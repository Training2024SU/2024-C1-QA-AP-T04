package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.sofka.ui.PaymentPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;

public class ConfirmPaymentMethod implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(WARNING_ALERT, isNotCurrentlyVisible()).forNoMoreThan(8).seconds(),
                Scroll.to(PAYCO_OPTION),
                Click.on(PAYCO_OPTION)
        );
    }
    public static ConfirmPaymentMethod confirmPaymentMethod(){return new ConfirmPaymentMethod();}
}
