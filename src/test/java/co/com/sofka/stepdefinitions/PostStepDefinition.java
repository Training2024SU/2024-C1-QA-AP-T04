package co.com.sofka.stepdefinitions;

import co.com.sofka.models.ModeloPost;
import co.com.sofka.stepdefinitions.setup.SetupService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.datafaker.Faker;

import static co.com.sofka.questions.service.ResponseBody.responseBody;
import static co.com.sofka.tasks.services.DoPost.doPost;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class PostStepDefinition extends SetupService {
    ModeloPost modeloPost = new ModeloPost();
    Faker faker = new Faker();

    @When("envia una peticion de tipo Post al recurso {string}")
    public void enviaUnaPeticionDeTipoPostAlRecurso(String recurso) {
        modeloPost.setName(faker.name().firstName());
        modeloPost.setJob(faker.job().field());
        actor.attemptsTo(
                doPost()
                        .withTheResource(recurso)
                        .andTheBody(modeloPost)
        );
    }

    @And("deberia mostrar la informacion ingresada")
    public void deberiaMostrarLaInformacionIngresada() {
        actor.should(
                seeThat("su nombre es: ",
                        responseBody(),
                        containsString(modeloPost.getName()))
        );
    }
}
