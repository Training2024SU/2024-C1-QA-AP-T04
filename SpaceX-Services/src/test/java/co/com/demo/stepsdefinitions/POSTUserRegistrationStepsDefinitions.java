package co.com.demo.stepsdefinitions;

import co.com.demo.questions.ResponseCodePost;
import co.com.demo.tasks.DoPost;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class POSTUserRegistrationStepsDefinitions extends SetupService {


    @Given("the user is on the {string} in page")
    public void theUserIsOnTheInPage(String url) {
        setupServiceGet(url);
    }

    @When("makes a post request to {string}")
    public void makesAPostRequestTo(String endpoint) {
        String requestBody = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

        actor.attemptsTo(
                DoPost.post().withResource(endpoint).withBody(requestBody)
        );
    }

    @Then("it should receive a code {int}")
    public void itShouldReceiveACode(Integer expectedStatusCode) {
        actor.should(
                seeThat(ResponseCodePost.was(), equalTo(expectedStatusCode))
        );
    }

    @Then("should get an id and a token")
    public void shouldGetAnIdAndAToken() {
        actor.should(
                seeThat("El id del usuario", response -> SerenityRest.lastResponse().jsonPath().getString("id"), notNullValue()),
                seeThat("El token de respuesta", response -> SerenityRest.lastResponse().jsonPath().getString("token"), notNullValue())
        );
    }
}
