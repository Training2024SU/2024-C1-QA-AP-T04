package osorio.alvarez.devon.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    private void setUpActor(WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Devon").can(BrowseTheWeb.with(webDriver));
    }

    protected void actorSetupTheBrowser(){
        setUpActor(webDriver);
        maximizar(webDriver);
    }

    private static void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

}
