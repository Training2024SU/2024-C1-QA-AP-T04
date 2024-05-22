package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PaycoConfirmationPage.PAYCO_CONFIRMATION_PAGE;

public class ConfirmationMessagePayco implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PAYCO_CONFIRMATION_PAGE.resolveFor(actor).getText();
    }

    public static ConfirmationMessagePayco confirmationMessagePayco(){
        return new ConfirmationMessagePayco();
    }
}
