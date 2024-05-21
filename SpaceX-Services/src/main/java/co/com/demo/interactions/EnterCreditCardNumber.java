package co.com.demo.interactions;

import co.com.demo.models.CreditCardInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.ui.PurchaseItemPage.CREDIT_CARD_INPUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterCreditCardNumber implements Interaction {

    private CreditCardInformation creditCardInfo;

    public EnterCreditCardNumber(CreditCardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(creditCardInfo.getCreditCardNumber()).into(CREDIT_CARD_INPUT)
        );
    }

    public static EnterCreditCardNumber withValue(CreditCardInformation creditCardInfo) {
        return new EnterCreditCardNumber(creditCardInfo);
    }
}
