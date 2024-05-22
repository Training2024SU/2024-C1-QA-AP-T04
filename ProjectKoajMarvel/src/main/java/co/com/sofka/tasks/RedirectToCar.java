package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.MainPage.*;
import static co.com.sofka.ui.RegisterPage.NEXT_FORM_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RedirectToCar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BUTTON_CAR_POPUP, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_CAR_POPUP),
                WaitUntil.the(BUTTON_REDIRECT_CAR, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_REDIRECT_CAR)
        );

    }
    public static RedirectToCar redirectToCar(){return new RedirectToCar();}
}
