package co.com.demo.interactions;

import co.com.demo.models.CreditCardInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.EXPIRATION_DATE_INPUT;

public class EnterExpirationDate implements Interaction {

    private CreditCardInformation creditCardInfo;

    public EnterExpirationDate(CreditCardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(creditCardInfo.getExpirationDate()).into(EXPIRATION_DATE_INPUT)
        );
    }

    public static EnterExpirationDate withValue(CreditCardInformation creditCardInfo) {
        return new EnterExpirationDate(creditCardInfo);
    }
}
