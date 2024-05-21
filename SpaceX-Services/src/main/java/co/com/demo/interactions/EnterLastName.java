package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.RegisterUserPage.LAST_NAME_INPUT;

public class EnterLastName implements Interaction {
    private final String lastName;

    public EnterLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(lastName).into(LAST_NAME_INPUT)
        );
    }

    public static EnterLastName withValue(String lastName) {
        return new EnterLastName(lastName);
    }
}
