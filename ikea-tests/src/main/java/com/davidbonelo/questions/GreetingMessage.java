package com.davidbonelo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.davidbonelo.ui.ProfilePage.GREETING;

public class GreetingMessage implements Question<String> {
    public static GreetingMessage greetingMessage() {
        return new GreetingMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return GREETING.resolveFor(actor).getText();
    }
}
