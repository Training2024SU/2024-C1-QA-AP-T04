package co.com.demo.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static co.com.demo.tasks.OpenInitialPage.openPage;
import static co.com.demo.tasks.SelectService.selectService;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectingServicesStepsDefinitions extends Setup {

    @Given("I am on the main SpaceX webpage")
    public void iAmOnTheMainSpaceXWebpage() {
        actorSetupTheBrowser();
        theActorInTheSpotlight().wasAbleTo(
                openPage().withURL("https://www.spacex.com/")
        );

    }
    @When("the user selects the service {string}")
    public void theUserSelectsTheService(String service) {
        theActorInTheSpotlight().attemptsTo(
                selectService(service)
        );
    }

}
