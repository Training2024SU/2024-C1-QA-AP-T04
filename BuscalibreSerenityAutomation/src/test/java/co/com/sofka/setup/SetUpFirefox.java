package co.com.sofka.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static co.com.sofka.Constants.ACTOR_NAME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUpFirefox {
    @Managed(driver = "firefox")
    protected static WebDriver driver;

    private static void setUpActor(WebDriver driver) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_NAME).can(BrowseTheWeb.with(settingDriver()));
    }
    private static WebDriver settingDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        driver = new FirefoxDriver(options);
        return driver;
    }

    public static void actorSetUpTheBrowserFirefox() {
        setUpActor(driver);
        maximize(driver);
    }

    private static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }
}
