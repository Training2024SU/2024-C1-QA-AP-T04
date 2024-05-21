package co.com.sofka.stepdefinitions;

import co.com.sofka.questions.CharacterExists;
import co.com.sofka.questions.CreatorExists;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.setup.ServicesSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.Constants.*;
import static co.com.sofka.tasks.DoGet.doGet;
import static co.com.sofka.tasks.DoGetLists.doGetListAll;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class ConsultCreatorsStepDefinitions extends ServicesSetUp {
    @When("make a GET request to the endpoint {string} with parameter {string} equal to {string}")
    public void makeAGETRequestToTheEndpointWithParameterEqualTo(String resource, String parameter, String parameterValue) {
        try {
            actor.attemptsTo(
                    doGetListAll().withTheResource(resource,parameterValue,parameter)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }
    @Then("should obtain a status code {int}")
    public void shouldObtainAStatusCode(Integer statusCode) {
        try {
            actor.should(
                    seeThat(STATUS_CODE, ResponseCode.was(), equalTo(statusCode))
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }
    @Then("the answer contains a creator with last name {string}")
    public void theAnswerContainsACreatorWithLastName(String creatorLastName) {
        try {
            actor.should(
                    seeThat(CREATOR_ANSWER, CreatorExists.withLastname(creatorLastName), is(true))
            );
            System.out.println(RESPONSE_BODY);
            SerenityRest.lastResponse().body().print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

}
