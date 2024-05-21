package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.EMAIL_SHIPPING;


public class EnterShippingEmail implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingEmail(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getEmail()).into(EMAIL_SHIPPING)
        );
    }

    public static EnterShippingEmail withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingEmail(shippingInfo);
    }
}
