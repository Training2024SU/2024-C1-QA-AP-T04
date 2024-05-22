package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.RegisterPage.BUTTON_REGISTER;

public class OpenRegisterForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_REGISTER)
        );

    }

    public static OpenRegisterForm openRegisterForm(){
        return new OpenRegisterForm();
    }

}
