package co.com.demo.stepsdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    private void setupActor(WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Daniel").can(BrowseTheWeb.with(webDriver));
    }

    protected void actorSetupTheBrowser(){
        setupActor(webDriver);
        maximize(webDriver);
    }

    private static void maximize(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

    protected void switchToIframe(String iframeId) {
        // Cambiar al contexto del iframe por su ID
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeId));
    }

    protected void switchToDefaultContent() {
        // Cambiar de vuelta al contexto principal (fuera del iframe)
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().switchTo().defaultContent();
    }
}
