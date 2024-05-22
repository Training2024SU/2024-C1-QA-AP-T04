package co.com.sofka.stepdefinitions;

import io.cucumber.java.en.When;

import static co.com.sofka.tasks.FillSmallForm.fillSmallForm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseProductsFirstSD extends SetUp{

    @When("fill the small form with correct information")
    public void fillTheSmallFormWithCorrectInformation() {
        theActorInTheSpotlight().attemptsTo(
                fillSmallForm()
        );
    }
}
