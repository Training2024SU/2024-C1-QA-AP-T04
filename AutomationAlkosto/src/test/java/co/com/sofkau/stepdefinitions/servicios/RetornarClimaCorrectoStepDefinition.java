package co.com.sofkau.stepdefinitions.servicios;

import co.com.sofkau.questions.servicios.RequestResponseBody;
import co.com.sofkau.questions.servicios.ResponseCode;
import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import static co.com.sofkau.tasks.servicios.ConstantesServicios.*;
import static co.com.sofkau.tasks.servicios.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;

public class RetornarClimaCorrectoStepDefinition extends Setup {

    @Given("que el usuario esta en la pagina de weather api")
    public void queElUsuarioEstaEnLaPaginaDe() {
        try {
        setUpServiceGet(URL_Servicios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("el usuario solicita el clima actual de la ciudad {string}")
    public void peticionAWeatherApiCurrent(String ciudad){
        try {
            actorDeServicios.attemptsTo(
                    doGet().withTheResourceAndParams(WEATHER_CURRENT_API,
                            Map.of("key", API_KEY, "q", ciudad))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("deberia obtener un codigo de respuesta {int}")
    public void deberiaObtenerUnCodigoDeRespuesta(Integer statusCode) {
        try {
            actorDeServicios.should(
                    seeThat("The status code", ResponseCode.was(), equalTo(statusCode))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("deberia de retornar la informacion de la ciudad de {string} del pais {string}")
    public void deberiaDeRetornarLaInformacionDeLaCiudadDeDelPais(String ciudad, String pais) {
        try {
            actorDeServicios.should(
                    seeThat("La respuesta contiene la ciudad ", RequestResponseBody.was(), containsString(ciudad)),
                    seeThat("La respuesta contiene el pais ", RequestResponseBody.was(), containsString(pais))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
