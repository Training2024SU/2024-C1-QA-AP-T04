package com.davidbonelo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.davidbonelo.ui.CheckoutPage.DELIVERY_DETAILS;

public class DeliveryTitle implements Question<String> {
    public static DeliveryTitle value() {
        return new DeliveryTitle();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DELIVERY_DETAILS.resolveFor(actor).getText();
    }
}
