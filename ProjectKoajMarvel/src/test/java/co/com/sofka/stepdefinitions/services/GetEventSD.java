package co.com.sofka.stepdefinitions.services;

import co.com.sofka.questions.services.ResponseCode;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GetEventSD extends SetupService{

    @Then("it should be able to see the information of the events")
    public void itShouldBeAbleToSeeTheInformationOfTheEvents() {
        System.out.println("cuerpo de la respuesta");
        SerenityRest.lastResponse().body().prettyPrint();
        String title = SerenityRest.lastResponse().body().path("data.results[0].title");
        assertThat("The title of the first event should be 'Acts of Vengeance!'", title, is(equalTo("Acts of Vengeance!")));

    }
}
