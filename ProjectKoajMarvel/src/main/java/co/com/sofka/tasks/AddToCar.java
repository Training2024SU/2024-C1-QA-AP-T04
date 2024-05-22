package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.tasks.ProducPage.*;
import static co.com.sofka.ui.RegisterPage.NEXT_FORM_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddToCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ADD_CAR_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(ADD_CAR_BUTTON)
        );

    }
    public static AddToCar addToCar(){return new AddToCar();}
}
