package co.com.sofka.tasks.totto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.PageComprarProduct.buttonFinishPayment;
import static co.com.sofka.ui.PageComprarProduct.buttonMethodPay;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IngresoInfoPago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(buttonMethodPay,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(buttonMethodPay),
                Click.on(buttonFinishPayment),
                WaitUntil.the(buttonFinishPayment,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(buttonFinishPayment)
                );
    }

    public static IngresoInfoPago ingresoInfoPago(){
        return new IngresoInfoPago();
    }

}
