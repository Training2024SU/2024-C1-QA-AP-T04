package co.com.sofka.Setup;

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

public class Setup {
    @Managed(driver = "chrome")
    protected static WebDriver chromeWebDriver;

    @Managed(driver = "edge")
    protected static WebDriver edgeWebDriver;

    protected static WebDriver webDriver;

    private void setupActor(String usuario, WebDriver driver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(usuario).can(BrowseTheWeb.with(driver));

    }

    protected void actorSetupTheBrowser(String usuario, String browser){
        webDriver = setWebDriver(browser);
        setupActor(usuario,webDriver);
        maximizar(webDriver);
    }

    private WebDriver setWebDriver (String op){

        switch (op) {
            case "chrome" -> {
                // Configurar EdgeOptions para abrir en incognito
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");

                // Inicializar el WebDriver con las opciones configuradas
               return chromeWebDriver = new ChromeDriver(options);
            }
            case "edge" -> {
                // Configurar EdgeOptions para abrir en modo privado
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--inprivate");

                // Inicializar el WebDriver con las opciones configuradas
               return edgeWebDriver = new EdgeDriver(options);
            }
            default -> {

            }
        }

        return null;
    }

    private static void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

    protected void quiteDriver() {
        webDriver.quit();
    }

}
