package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.davidbonelo.ui.HomePage.SHOPPING_BAG;

public class NavigateToBag implements Performable {
    public static NavigateToBag navigateToBag() {
        return new NavigateToBag();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SHOPPING_BAG));
    }
}
