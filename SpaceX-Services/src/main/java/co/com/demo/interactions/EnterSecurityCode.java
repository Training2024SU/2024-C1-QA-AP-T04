package co.com.demo.interactions;

import co.com.demo.models.CreditCardInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.SECURITY_CODE_INPUT;

public class EnterSecurityCode implements Interaction {

    private CreditCardInformation creditCardInfo;

    public EnterSecurityCode(CreditCardInformation creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(creditCardInfo.getSecurityCode()).into(SECURITY_CODE_INPUT)
        );
    }

    public static EnterSecurityCode withValue(CreditCardInformation creditCardInfo) {
        return new EnterSecurityCode(creditCardInfo);
    }
}
