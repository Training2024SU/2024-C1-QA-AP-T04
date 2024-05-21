package co.com.demo.interactions;

import co.com.demo.models.CreditCardInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.NAME_ON_CARD_INPUT;

public class EnterNameOnCard implements Interaction {

    private CreditCardInformation creditCardInfo;

    public EnterNameOnCard(CreditCardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(creditCardInfo.getNameOnCard()).into(NAME_ON_CARD_INPUT)
        );
    }

    public static EnterNameOnCard withValue(CreditCardInformation creditCardInfo) {
        return new EnterNameOnCard(creditCardInfo);
    }
}
