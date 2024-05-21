package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.RegisterUserPage.FIRST_NAME_INPUT;

public class EnterFirstName implements Interaction {
    private final String firstName;

    public EnterFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME_INPUT)
        );
    }

    public static EnterFirstName withValue(String firstName) {
        return new EnterFirstName(firstName);
    }

}
