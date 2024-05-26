package co.com.sofka.stepdefinitions;

import co.com.sofka.questions.service.ResponseCode;
import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RestServiceStepDefinition extends SetupService {

    @Given("que el usuario esta en la pagina de {string}")
    public void queElUsuarioEstaEnLaPaginaDe(String urlBase) {
        setupService(urlBase);
    }

    @Then("deberia obtener un codigo de respuesta {int}")
    public void deberiaObtenerUnCodigoDeRespuesta(Integer statusCode) {
        actor.should(
                seeThat("el codigo de respuesta: ",
                        ResponseCode.was(),
                        equalTo(statusCode))
        );
    }
}
