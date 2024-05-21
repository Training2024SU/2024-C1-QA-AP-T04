package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.demo.ui.PurchaseItemPage.ADDRESS_SHIPPING;

public class EnterShippingAddress implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingAddress(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getAddress()).into(ADDRESS_SHIPPING)
        );
    }

    public static EnterShippingAddress withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingAddress(shippingInfo);
    }
}
