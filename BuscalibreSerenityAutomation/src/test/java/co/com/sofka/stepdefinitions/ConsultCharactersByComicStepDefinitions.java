package co.com.sofka.stepdefinitions;

import co.com.sofka.questions.CharacterExists;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.setup.ServicesSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.Constants.*;
import static co.com.sofka.tasks.DoGet.doGet;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class ConsultCharactersByComicStepDefinitions extends ServicesSetUp {
    @Given("the user has access to marvel API {string}")
    public void theUserHasAccessToMarvelAPI(String url) {
        try {
            setUpServiceGet(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @When("make a GET request to the endpoint {string} with parameter {string} valid comic ID {int}")
    public void makeAGETRequestToTheEndpointWithParameterValidComicID(String resource, String parameter, Integer parameterValue) {
        try {
            actor.attemptsTo(
                    doGet().withTheResource(resource, parameterValue, parameter)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @Then("should get a status code {int}")
    public void shouldGetAStatusCode(Integer statusCode) {
        try {
            actor.should(
                    seeThat(STATUS_CODE, ResponseCode.was(), equalTo(statusCode))
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @Then("the answer contains the character {string}")
    public void theAnswerContainsTheCharacter(String characterName) {
        try {
            actor.should(
                    seeThat(CHARACTER_ANSWER, CharacterExists.named(characterName), is(true))
            );
            System.out.println(RESPONSE_BODY);
            SerenityRest.lastResponse().body().print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }
}
