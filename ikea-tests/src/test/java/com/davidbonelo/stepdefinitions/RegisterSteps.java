package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.User;
import com.davidbonelo.models.factories.UserFactory;
import com.davidbonelo.tasks.Register;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.davidbonelo.ui.ProfilePage.GREETING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class RegisterSteps {
    private User user;

    @When("{actor} completes the process with his valid information")
    public void sheCompletesTheProcessWithHisValidInformation(Actor actor) {
        user = UserFactory.createFakeUser(actor.getName());
        actor.wasAbleTo(Register.as(user));
    }

    @Then("{actor} should get redirected to her profile page")
    public void sheShouldGetRedirectedToHerProfilePage(Actor actor) {
        actor.should(
                seeThat(the(GREETING), containsText(user.getFirstName()))
        );
    }
}
