package co.com.sofkau.stepdefinitions.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed(driver = "edge", options = "incognito")
    protected WebDriver edgeDriver;
    @Managed(driver = "chrome", options = "incognito")
    protected WebDriver chromeDriver;

    protected static Actor actorDeServicios = new Actor("ActorDeServicios");
    private void setupActor(WebDriver webDriver, String nombre){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).can(BrowseTheWeb.with(webDriver));
    }
    protected void actorSetupTheBrowser(String nombre, int driver){
        if(driver == 1){
            setupActor(chromeDriver, nombre);
            maximizar(chromeDriver);

        } else {
            setupActor(edgeDriver, nombre);
            maximizar(edgeDriver);
        }

    }
    private static void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

    protected void setUpServiceGet(String url){
        actorDeServicios.can(CallAnApi.at(url));
    }

}
