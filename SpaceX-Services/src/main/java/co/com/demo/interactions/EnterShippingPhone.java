package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.demo.ui.PurchaseItemPage.PHONE_SHIPPING;

public class EnterShippingPhone implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingPhone(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getPhone()).into(PHONE_SHIPPING)
        );
    }

    public static EnterShippingPhone withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingPhone(shippingInfo);
    }
}
