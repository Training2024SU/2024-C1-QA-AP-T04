package co.com.sofkau.stepdefinitions.servicios;

import co.com.sofkau.questions.servicios.RequestResponseBody;
import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import static co.com.sofkau.tasks.servicios.ConstantesServicios.*;
import static co.com.sofkau.tasks.servicios.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RetornarClimaIncorrectoStepDefinition extends Setup {

    @Given ("que el usuario se encuentra en la pagina de {string}")
    public void queElUsuarioSeEncuentraEnLaPagina(String url){
        try {
            setUpServiceGet(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("el usuario solicita el clima actual de la ciudad {string} sin API KEY")
    public void peticionAWeatherApiCurrentSinAPIKEY(String ciudad){
        try {
            actorDeServicios.attemptsTo(
                    doGet().withTheResourceAndParams(WEATHER_CURRENT_API,
                            Map.of("q", ciudad))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("deberia retornar de no autorizado")
    public void deberiaDeRetornarElMensaje(){
        try {
            actorDeServicios.should(
                    seeThat("La respuesta contiene el mensaje", RequestResponseBody.was(), containsString(MENSAJE_NO_AUTORIZADO))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
