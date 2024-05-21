package co.com.demo.tasks;

import co.com.demo.interactions.*;
import co.com.demo.models.ShippingInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersShippingInformation implements Task {

    private ShippingInformation shippingInfo;

    public EntersShippingInformation(ShippingInformation shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterShippingEmail.withInfo(shippingInfo),
                SelectCountry.click(),
                EnterShippingName.withInfo(shippingInfo),
                EnterShippingLastName.withInfo(shippingInfo),
                EnterShippingAddress.withInfo(shippingInfo),
                EnterShippingAddress2.withInfo(shippingInfo),
                EnterShippingCity.withInfo(shippingInfo),
                EnterShippingPhone.withInfo(shippingInfo),
                ClickContinueButton.button(),
                ClickContinueButton.button()
        );
    }

    public static EntersShippingInformation withDetails(ShippingInformation shippingInfo) {
        return instrumented(EntersShippingInformation.class, shippingInfo);
    }
}
