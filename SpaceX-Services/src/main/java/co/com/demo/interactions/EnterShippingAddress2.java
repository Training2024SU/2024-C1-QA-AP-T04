package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.ADDRESS_2_SHIPPING;


public class EnterShippingAddress2 implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingAddress2(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getAddress2()).into(ADDRESS_2_SHIPPING)
        );
    }

    public static EnterShippingAddress2 withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingAddress2(shippingInfo);
    }
}
