package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.davidbonelo.tasks.NavigateToSignInPage.navigateToSignInPage;
import static com.davidbonelo.ui.SignInPage.REGISTER;

public class NavigateToRegisterPage implements Performable {
    public static NavigateToRegisterPage navigateToRegisterPage() {
        return new NavigateToRegisterPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                navigateToSignInPage(),
                Click.on(REGISTER)
        );
    }
}
