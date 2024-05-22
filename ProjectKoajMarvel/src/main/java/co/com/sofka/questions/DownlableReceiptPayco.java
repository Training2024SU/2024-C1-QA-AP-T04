package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PaycoConfirmationPage.PAYCO_CONFIRMATION_DOWNLOABLE;

public class DownlableReceiptPayco implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PAYCO_CONFIRMATION_DOWNLOABLE.resolveFor(actor).isClickable();
    }

    public static DownlableReceiptPayco downlableReceiptPayco(){
        return new DownlableReceiptPayco();
    }
}

