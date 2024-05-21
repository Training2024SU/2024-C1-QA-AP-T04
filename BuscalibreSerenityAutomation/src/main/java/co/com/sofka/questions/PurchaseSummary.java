package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.CheckoutPage.PURCHASE_SUMMARY;

public class PurchaseSummary implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PURCHASE_SUMMARY.resolveFor(actor).getText();
    }
    public static PurchaseSummary purchaseSummary() {
        return new PurchaseSummary();
    }
}
