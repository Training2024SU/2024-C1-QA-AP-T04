package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.davidbonelo.Constants.IKEA_BASE;
import static com.davidbonelo.ui.HomePage.ACCEPT_COOKIES;

public class OpenHomePage implements Performable {
    public static OpenHomePage openHomePage() {
        return new OpenHomePage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(IKEA_BASE),
                Click.on(ACCEPT_COOKIES).afterWaitingUntilEnabled()
        );
    }
}
