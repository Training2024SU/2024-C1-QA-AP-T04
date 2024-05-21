package com.davidbonelo.tasks;

import com.davidbonelo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.davidbonelo.ui.SignInPage.EMAIL;
import static com.davidbonelo.ui.SignInPage.PASSWORD;
import static com.davidbonelo.ui.SignInPage.SIGN_IN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Performable {
    private final User user;

    public Login(User user) {
        this.user = user;
    }

    public static Login as(User user) {
        return new Login(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL, isEnabled()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(user.getEmail()).into(EMAIL),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                Scroll.to(SIGN_IN),
                Click.on(SIGN_IN).afterWaitingUntilEnabled()
        );
    }
}
