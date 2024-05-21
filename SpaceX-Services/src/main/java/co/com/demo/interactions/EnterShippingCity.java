package co.com.demo.interactions;

import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.demo.ui.PurchaseItemPage.CITY_SHIPPING;

public class EnterShippingCity implements Interaction {

    private ShippingInformation shippingInfo;

    public EnterShippingCity(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(shippingInfo.getCity()).into(CITY_SHIPPING)
        );
    }

    public static EnterShippingCity withInfo(ShippingInformation shippingInfo) {
        return new EnterShippingCity(shippingInfo);
    }
}
