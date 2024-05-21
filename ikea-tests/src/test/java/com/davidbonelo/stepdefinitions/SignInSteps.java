package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.User;
import com.davidbonelo.tasks.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.davidbonelo.ui.ProfilePage.PROFILE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SignInSteps {

    @When("{actor} enters with his valid data")
    public void heEntersWithHisValidData(Actor actor) {
        User validUser = new User();
        // Place valid credentials here
        validUser.setEmail("valid@email.com");
        validUser.setPassword("~'aN,,fyGy4863k");
        // This test fails in the production environment because security restrictions
        actor.wasAbleTo(Login.as(validUser));
    }

    @And("{actor} should see that he is logged in")
    public void heShouldSeeThatHeIsLoggedIn(Actor actor) {
        actor.should(
                seeThat(the(PROFILE), isVisible())
        );
    }
}
