package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.davidbonelo.tasks.OpenHomePage.openHomePage;
import static com.davidbonelo.ui.HomePage.SIGN_IN;

public class NavigateToSignInPage implements Performable {
    public static NavigateToSignInPage navigateToSignInPage() {
        return new NavigateToSignInPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                openHomePage(),
                Click.on(SIGN_IN)
        );
    }
}
