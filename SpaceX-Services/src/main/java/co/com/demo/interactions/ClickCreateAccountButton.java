package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.demo.ui.RegisterUserPage.CREATE_ACCOUNT_BUTTON;

public class ClickCreateAccountButton implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREATE_ACCOUNT_BUTTON)
        );
    }

    public static ClickCreateAccountButton button() {
        return new ClickCreateAccountButton();
    }
}
