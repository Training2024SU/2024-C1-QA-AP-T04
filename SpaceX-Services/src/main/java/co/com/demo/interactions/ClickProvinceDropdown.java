package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.demo.ui.PurchaseItemPage.PROVINCE_DROPDOWN;

public class ClickProvinceDropdown implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROVINCE_DROPDOWN)

        );
    }

    public static ClickProvinceDropdown click() {
        return new ClickProvinceDropdown();
    }
}
