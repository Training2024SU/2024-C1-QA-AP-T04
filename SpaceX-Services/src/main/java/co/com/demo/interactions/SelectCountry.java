package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.demo.ui.PurchaseItemPage.COUNTRY_DROPDOWN;

public class SelectCountry implements Interaction {

        private static final String COUNTRY = "Cambodia";

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText(COUNTRY).from(COUNTRY_DROPDOWN)
            );
        }

        public static SelectCountry click() {
            return new SelectCountry();
        }


}
