package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.enums.BrowserType;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

import static com.davidbonelo.stepdefinitions.Setup.setTheWebStage;
import static com.davidbonelo.tasks.NavigateToRegisterPage.navigateToRegisterPage;
import static com.davidbonelo.tasks.NavigateToSignInPage.navigateToSignInPage;
import static com.davidbonelo.tasks.OpenHomePage.openHomePage;

public class NavigationSteps {
    @Given("The user is browsing the web using the {browser} browser")
    public void theUserIsBrowsingTheWebUsingTheBrowser(BrowserType browser) {
        setTheWebStage(browser);
    }

    @Given("{actor} is looking at the register page")
    public void actorIsLookingAtTheRegisterPage(Actor actor) {
        actor.wasAbleTo(
                navigateToRegisterPage()
        );
    }

    @Given("{actor} is looking at the sign in page")
    public void davidIsLookingAtTheSignInPage(Actor actor) {
        actor.wasAbleTo(
                navigateToSignInPage()
        );
    }

    @Given("{actor} is looking at the home page")
    public void davidIsLookingAtTheHomePage(Actor actor) {
        actor.wasAbleTo(openHomePage());
    }
}
