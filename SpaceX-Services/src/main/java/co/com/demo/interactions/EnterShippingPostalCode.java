package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.demo.ui.PurchaseItemPage.POSTAL_CODE_SHIPPING;

public class EnterShippingPostalCode implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingPostalCode(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getPostalCode()).into(POSTAL_CODE_SHIPPING)
        );
    }

    public static EnterShippingPostalCode withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingPostalCode(shippingInfo);
    }
}
