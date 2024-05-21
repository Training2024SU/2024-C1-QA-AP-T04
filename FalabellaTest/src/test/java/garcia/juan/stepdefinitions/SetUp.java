package garcia.juan.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {

    @Managed//(driver = "edge",options = "--inprivate")
    protected static WebDriver webDriver;

    private void setUpActor(WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juanjo").can(BrowseTheWeb.with(webDriver));

    }

    protected void actorSetUpTheBrowser(String navegador){
        WebDriver webDriver = getWebDriver(navegador);
        setUpActor(webDriver);
        maximizar(webDriver);
    }

    protected void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

    private WebDriver getWebDriver(String navegador){
        switch (navegador){
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--inprivate");
                return new EdgeDriver(edgeOptions);
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                return new ChromeDriver(chromeOptions);
            default:
                System.out.println("Navegador no valido");
                return null;
        }
    }
}
