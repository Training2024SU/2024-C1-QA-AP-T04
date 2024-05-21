package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.demo.ui.PurchaseItemPage.CHECKOUT_BUTTON;

public class ProceedToCheckout implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BUTTON)
        );
    }

    public static ProceedToCheckout proceedToCheckout() {
        return new ProceedToCheckout();
    }
}
