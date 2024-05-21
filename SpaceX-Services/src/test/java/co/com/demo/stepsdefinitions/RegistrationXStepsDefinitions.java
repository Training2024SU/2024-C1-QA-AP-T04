package co.com.demo.stepsdefinitions;

import co.com.demo.tasks.RegisterUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.demo.tasks.NavigateToCreateAccount.navigateToCreateAccount;
import static co.com.demo.tasks.VerifyImgMainPage.verifyImgMainPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrationXStepsDefinitions extends Setup {

    @When("the user selects creates a new account")
    public void theUserSelectsCreatesANewAccount() {
        theActorInTheSpotlight().attemptsTo(
                navigateToCreateAccount()
        );
    }

    @When("enters their {string} {string} {string} {string}$%dD\"")
    public void entersTheir$DD(String firstName, String lastName, String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                RegisterUser.withDetails(firstName, lastName, email, password)
        );
    }

    @Then("they should be directed to the main page")
    public void theyShouldBeDirectedToTheMainPage() {
        theActorInTheSpotlight().attemptsTo(
                verifyImgMainPage()
        );
    }
}
