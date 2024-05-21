package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.enums.BrowserType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Setup {
    @Managed(driver = "firefox", options = "-private-window")
    private static WebDriver firefoxDriver;

    @Managed(driver = "chrome", options = "incognito")
    private static WebDriver chromeDriver;

    public static void setTheWebStage(BrowserType browser) {
        WebDriver driver;
        switch (browser) {
            case CHROME -> driver = chromeDriver;
            case FIREFOX -> driver = firefoxDriver;
            default -> throw new IllegalStateException("Unexpected value: " + browser);
        }
        driver.manage().window().maximize();
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @ParameterType(".*")
    public BrowserType browser(String browser) {
        return BrowserType.valueOf(browser);
    }

//    @Before("@web")
//    public void setTheWebStage() {
//        OnStage.setTheStage(new OnlineCast());
//    }
}
