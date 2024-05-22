package co.com.sofka.stepdefinitions.services;

import co.com.sofka.questions.services.ResponseCode;
import io.cucumber.java.en.*;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.sofka.stepdefinitions.services.Constans.HASH;
import static co.com.sofka.stepdefinitions.services.Constans.PUBLIC_KEY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class GetCharactersSD extends SetupService{

    @Given("the user is in the web page Marvel Developers")
    public void theUserIsInTheWebPageMarvelDevelopers() {
        setUpServiceGet("http://gateway.marvel.com");
    }
    @When("sent a GET petition to the resource {string}")
    public void sentAGETPetitionToTheResource(String resource) {
        actor.attemptsTo(
                Get.resource(resource).with(request->
                    request.queryParam("ts", 1)
                            .queryParam("apikey", PUBLIC_KEY)
                            .queryParam("hash", HASH)
                )
        );
    }
    @Then("it should obtain a answer code {int}")
    public void itShouldObtainAAnswerCode(Integer statusCode) {
        actor.should(
                seeThat("el codigo de respuesta",
                        ResponseCode.was(), equalTo(statusCode))
        );
    }
    @Then("it should be able to see the information of the characters")
    public void itShouldBeAbleToSeeTheInformationOfTheCharacters() {
        System.out.println("cuerpo de la respuesta");
        SerenityRest.lastResponse().body().prettyPrint();
        String title = SerenityRest.lastResponse().body().path("data.results[0].name");

       assertThat("The Name of the first Heroe should be", title, is(equalTo("3-D Man")));
    }
}
