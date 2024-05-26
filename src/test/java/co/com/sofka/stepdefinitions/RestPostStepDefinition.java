package co.com.sofka.stepdefinitions;

import co.com.sofka.models.ModeloRequestPost;
import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.datafaker.Faker;

import static co.com.sofka.questions.service.ResponseModeloPost.responseModeloPost;
import static co.com.sofka.tasks.services.DoPostRest.doPostRest;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RestPostStepDefinition extends SetupService {
    ModeloRequestPost modeloRequestPost = new ModeloRequestPost();
    Faker faker = new Faker();

    @When("envia una peticion de tipo Post al recurso {string}")
    public void enviaUnaPeticionDeTipoPostAlRecurso(String recurso) {
        modeloRequestPost.setName(faker.name().firstName());
        modeloRequestPost.setJob(faker.job().field());
        actor.attemptsTo(
                doPostRest()
                        .withTheResource(recurso)
                        .andTheBody(modeloRequestPost)
        );
    }

    @And("deberia mostrar la informacion ingresada")
    public void deberiaMostrarLaInformacionIngresada() {
        actor.should(
                seeThat("su nombre es: ",
                        responseModeloPost().asString(),
                        containsString(modeloRequestPost.getName())
                ),
                seeThat("su trabajo es: ",
                        responseModeloPost().asString(),
                        containsString(modeloRequestPost.getJob())
                )
        );
        then().body("name",
                equalTo(modeloRequestPost.getName())
        );
    }
}
