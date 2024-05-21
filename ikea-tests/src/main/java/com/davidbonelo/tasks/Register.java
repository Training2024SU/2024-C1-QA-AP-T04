package com.davidbonelo.tasks;

import com.davidbonelo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.davidbonelo.ui.RegisterPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Register implements Performable {
    private final User user;

    public Register(User user) {
        this.user = user;
    }

    public static Register as(User user) {
        return new Register(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(FIRST_NAME),
                Enter.theValue(user.getLastName()).into(LAST_NAME),
                Enter.theValue(user.getIdentification()).into(IDENTIFICATION),
                Enter.theValue(user.getPhone()).into(PHONE),
                Enter.theValue(user.getEmail()).into(EMAIL),
                Enter.theValue(user.getEmail()).into(CONFIRM_EMAIL),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                SetCheckbox.of(PRIVACY_POLICY).toTrue(),
                Scroll.to(CREATE_ACCOUNT),
                WaitUntil.the(CREATE_ACCOUNT, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(CREATE_ACCOUNT).afterWaitingUntilEnabled()
        );
    }
}
