package co.com.sofka.stepdefinitions;

import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.service.ResponseBody.responseBody;
import static co.com.sofka.tasks.services.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class GetStepDefinition extends SetupService {

    @When("envia una peticion de tipo Get al recurso {string}")
    public void enviaUnaPeticionDeTipoGetAlRecurso(String recurso) {
        actor.attemptsTo(
                doGet().withTheResource(recurso)
        );
    }

    @Then("deberia obtener una lista con la informacion de los usuarios")
    public void deberiaObtenerUnaListaConLaInformacionDeLosUsuarios() {
        actor.should(
                seeThat("el cuerpo de respuesta: ",
                        responseBody(),
                        containsString("Ferguson"))
        );
    }
}
