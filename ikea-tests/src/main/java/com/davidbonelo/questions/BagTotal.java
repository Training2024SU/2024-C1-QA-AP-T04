package com.davidbonelo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.davidbonelo.ui.BagPage.BAG_TOTAL;

public class BagTotal implements Question<Integer> {
    public static BagTotal price() {
        return new BagTotal();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        String priceText = BAG_TOTAL.resolveFor(actor).getText();
        return Integer.parseInt(priceText.replace(".", ""));
    }
}
