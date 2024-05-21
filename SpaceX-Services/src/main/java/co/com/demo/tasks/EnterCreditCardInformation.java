package co.com.demo.tasks;

import co.com.demo.interactions.*;
import co.com.demo.models.CreditCardInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCreditCardInformation implements Task {

    private CreditCardInformation creditCardInfo;

    public EnterCreditCardInformation(CreditCardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Switch.toFrame("card-fields-number-qmld3dhx75000000-scope-shop.spacex.com"),
                EnterSecurityCode.withValue(creditCardInfo),
                EnterExpirationDate.withValue(creditCardInfo),
                EnterNameOnCard.withValue(creditCardInfo),
                EnterCreditCardNumber.withValue(creditCardInfo),
                ClickContinueButton.button()
        );
    }

    public static EnterCreditCardInformation withDetails(CreditCardInformation creditCardInfo) {
        return instrumented(EnterCreditCardInformation.class, creditCardInfo);
    }
}
