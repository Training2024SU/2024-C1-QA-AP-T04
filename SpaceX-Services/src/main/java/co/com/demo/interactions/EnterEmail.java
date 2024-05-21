package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.RegisterUserPage.EMAIL_INPUT;

public class EnterEmail implements Interaction {
    private final String email;

    public EnterEmail(String email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(EMAIL_INPUT)
        );
    }

    public static EnterEmail withValue(String email) {
        return new EnterEmail(email);
    }
}
