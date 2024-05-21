package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.demo.ui.PurchaseItemPage.PROVINCE_DROPDOWN;

public class SelectCapitalDistrictOption implements Interaction {

    private static final String CAPITAL_DISTRICT = "Capital District";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(CAPITAL_DISTRICT).from(PROVINCE_DROPDOWN)
        );
    }

    public static SelectCapitalDistrictOption click() {
        return new SelectCapitalDistrictOption();
    }
}
