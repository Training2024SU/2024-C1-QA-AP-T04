package co.com.demo.stepsdefinitions;

import co.com.demo.questions.ResponseCodeGet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static co.com.demo.tasks.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class GetMarvelCharactersStepDefinitions extends SetupService{

    @Given("the user is on the {string}")
    public void theUserIsOnThe(String url) {
        setupServiceGet(url);
    }

    @When("makes a get request {string}")
    public void makesAGetRequest(String resource) {
        actor.attemptsTo(
                doGet().withTheResource(resource)
        );
    }

    @Then("the response should have a status code {int}")
    public void theResponseShouldHaveAStatusCode(Integer statusCode) {
        actor.should(
                seeThat("The response code", ResponseCodeGet.is(),equalTo(statusCode))
        );

        System.out.println("Request Body");
        SerenityRest.lastResponse().body().prettyPrint();

    }

    @Then("the response should include information about characters")
    public void theResponseShouldIncludeInformationAboutCharacters() {
        actor.should(
                seeThat(response -> SerenityRest.lastResponse().jsonPath().getString("swaggerVersion") != null),
                seeThat(response -> SerenityRest.lastResponse().jsonPath().getString("apiVersion") != null),
                seeThat(response -> SerenityRest.lastResponse().jsonPath().getString("basePath") != null),
                seeThat(response -> SerenityRest.lastResponse().jsonPath().getString("resourcePath") != null)

        );
    }


}
