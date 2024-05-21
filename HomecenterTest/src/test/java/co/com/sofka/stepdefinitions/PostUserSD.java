package co.com.sofka.stepdefinitions;

import co.com.sofka.models.PostUserModel;
import co.com.sofka.models.PostUserResponseModel;
import co.com.sofka.questions.services.ResponseCode;
import co.com.sofka.taks.services.DoPost;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostUserSD extends SetupService {
    Faker faker = new Faker();

    PostUserModel postUserModel = new PostUserModel();
    PostUserResponseModel postUserResponseModel = new PostUserResponseModel();

    @Given("el usuario esta en la plataforma {string}")
    public void elUsuarioEstaEnLaPlataforma(String baseUrl) {
            setUpServiceGet(baseUrl);


    }
    @When("un POST request servicio es enviado {string}")
    public void unPOSTRequestServicioEsEnviado(String resource) {
        postUserModel.setJob(faker.job().position());
        postUserModel.setName(faker.name().fullName());
        actor.attemptsTo(
                DoPost.doPost().withTheResource(resource).andTheBody(postUserModel)
        );


    }
    @Then("deberia de recibir un code {int}")
    public void deberiaDeRecibirUnCode(Integer statusCode) {
        actor.should(
                seeThat("Status code", ResponseCode.was(), equalTo(statusCode))
        );



    }
    @Then("el usuario deberia ver la asociacion de la informacion")
    public void elUsuarioDeberiaVerLaAsociacionDeLaInformacion() {
        postUserResponseModel = SerenityRest
                .lastResponse()
                .jsonPath()
                .getObject("", PostUserResponseModel.class);
        System.out.println(postUserResponseModel);


        assertThat(postUserModel.getJob(),  equalTo(postUserResponseModel.getJob()));
        assertThat(postUserModel.getName(), equalTo(postUserResponseModel.getName()));
        assertThat(postUserResponseModel.getId(), notNullValue());
        assertThat(postUserResponseModel.getCreatedAt(), notNullValue());

    }
}
