package co.com.sofka.Setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AppiumSetup {
    @Managed(driver = "Appium")
    public static WebDriver movilDriver;

    private void setupActor(String usuario){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(usuario).can(BrowseTheWeb.with(movilDriver));
    }

    protected void actorSetupTheBrowser(String usuario){
        setupActor(usuario);
    }
}

