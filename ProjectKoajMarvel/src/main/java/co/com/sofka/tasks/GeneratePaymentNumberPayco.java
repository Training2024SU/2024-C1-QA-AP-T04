package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PaymentPage.GENERATE_PAYMENT_NUMBER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class GeneratePaymentNumberPayco implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GENERATE_PAYMENT_NUMBER, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Click.on(GENERATE_PAYMENT_NUMBER)
        );

    }
    public static GeneratePaymentNumberPayco generatePaymentNumberPayco(){return new GeneratePaymentNumberPayco();}
}
