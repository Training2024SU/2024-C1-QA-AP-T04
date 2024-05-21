package co.com.demo.stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.demo.tasks.SelectRocket.selectRocket;
import static co.com.demo.tasks.VerifyNotTheMainPage.isNotTheMainPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ViewingRocketsStepsDefinitions extends Setup {

    @When("the user selects a {string}")
    public void theUserSelectsA(String rocket) {
        theActorInTheSpotlight().attemptsTo(
                selectRocket(rocket)
        );

    }
    @Then("should leave the main page")
    public void should_leave_the_main_page() {
        theActorInTheSpotlight().attemptsTo(
                isNotTheMainPage()
        );
    }
    }

