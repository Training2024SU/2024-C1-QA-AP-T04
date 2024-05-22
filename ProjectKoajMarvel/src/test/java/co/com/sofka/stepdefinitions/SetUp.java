package co.com.sofka.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {
    @Managed(driver = "edge",options = "--inprivate")
    protected WebDriver webDriver;


    private void setupActor(WebDriver webDriver, String nombre){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).can(BrowseTheWeb.with(webDriver));
    }

    protected void actorSetupTheBrowser(String nombre){
        setupActor(webDriver, nombre);
        maximize(webDriver);
    }

    private static void maximize(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

}
