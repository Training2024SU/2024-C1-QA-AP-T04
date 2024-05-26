package co.com.sofka.stepdefinitions;

import co.com.sofka.models.ModeloRequestPost;
import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.service.ResponseModeloPost.responseModeloPost;
import static co.com.sofka.tasks.services.DoPostRest.doPostRest;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RestPutStepDefinition extends SetupService {
    ModeloRequestPost modeloRequestPost = new ModeloRequestPost();

    @When("con los datos nombre {string} y el trabajo {string}")
    public void conLosDatosNombreYElTrabajo(String nombre, String trabajo) {
        modeloRequestPost.setName(nombre);
        modeloRequestPost.setJob(trabajo);
    }

    @When("envia una peticion de tipo put al recurso {string} y el id {int}")
    public void enviaUnaPeticionDeTipoPutAlRecursoYElId(String recurso, Integer id) {
        actor.attemptsTo(
                doPostRest()
                        .withTheResource(recurso + id)
                        .andTheBody(modeloRequestPost)
        );
    }

    @Then("deberia obtener la informacion del usuario {string} y trabajo {string}")
    public void deberiaObtenerLaInformacionDelUsuarioYTrabajo(String nombre, String trabajo) {
        actor.should(
                seeThat("su nombre es: ",
                        responseModeloPost().asString(),
                        containsString(nombre)
                ),
                seeThat("su trabajo es: ",
                        responseModeloPost().asString(),
                        containsString(trabajo)
                )
        );
        then().body("name",
                equalTo(nombre)
        );
        then().body("job",
                equalTo(trabajo)
        );
    }
}
