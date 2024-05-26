package co.com.sofka.stepdefinitions;

import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.service.ResponseBody.responseBody;
import static co.com.sofka.tasks.services.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class RestGetStepDefinition extends SetupService {


    @When("envia una peticion de tipo Get al recurso {string} y el id {int}")
    public void enviaUnaPeticionDeTipoGetAlRecursoYElId(String recurso, Integer id) {
        actor.attemptsTo(
                doGet().withTheResource(recurso + id)
        );
    }


    @Then("deberia obtener la informacion del usuario {string}")
    public void deberiaObtenerLaInformacionDelUsuario(String nombreUsuario) {
        actor.should(
                seeThat("el cuerpo de respuesta: ",
                        responseBody(),
                        containsString(nombreUsuario))
        );
    }

}
