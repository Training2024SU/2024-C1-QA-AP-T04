package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.RegisterUserPage.PASSWORD_INPUT;

public class EnterPassword implements Interaction {
    private final String password;

    public EnterPassword(String password) {
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(PASSWORD_INPUT)
        );
    }

    public static EnterPassword withValue(String password) {
        return new EnterPassword(password);
    }
}
