package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.demo.ui.RegisterUserPage.*;

public class NavigateToCreateAccount implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ACCOUNT_LINK),
                Click.on(CREATE_ACCOUNT_LINK)

        );
    }

    public static NavigateToCreateAccount navigateToCreateAccount() {
        return new NavigateToCreateAccount();
    }
}
