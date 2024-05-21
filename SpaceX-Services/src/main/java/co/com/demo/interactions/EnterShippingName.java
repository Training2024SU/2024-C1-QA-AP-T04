package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.FIRST_NAME_SHIPPING;

public class EnterShippingName implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingName(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getFirstName()).into(FIRST_NAME_SHIPPING)
        );
    }

    public static EnterShippingName withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingName(shippingInfo);
    }
}
