package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.demo.ui.PurchaseItemPage.LAST_NAME_SHIPPING;

public class EnterShippingLastName implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingLastName(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getLastName()).into(LAST_NAME_SHIPPING)
        );
    }

    public static EnterShippingLastName withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingLastName(shippingInfo);
    }
}
