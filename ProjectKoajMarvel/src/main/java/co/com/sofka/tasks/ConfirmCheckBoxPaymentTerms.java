package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PaymentPage.CHECK_BOX_TERMS_PAYMENT;
import static co.com.sofka.ui.PaymentPage.PAYCO_OPTION;
import static co.com.sofka.ui.SearchPage.SERACH_RESULT_FIRST;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmCheckBoxPaymentTerms implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CHECK_BOX_TERMS_PAYMENT, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Click.on(CHECK_BOX_TERMS_PAYMENT)

        );
    }
    public static ConfirmCheckBoxPaymentTerms confirmCheckBoxPaymentTerms(){
        return new ConfirmCheckBoxPaymentTerms();
    }
}
