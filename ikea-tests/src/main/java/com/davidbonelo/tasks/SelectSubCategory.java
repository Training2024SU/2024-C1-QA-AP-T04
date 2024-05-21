package com.davidbonelo.tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.davidbonelo.utils.Utils.pickRandomItem;
import static com.davidbonelo.ui.HomePage.SUBCATEGORIES;

public class SelectSubCategory implements Performable {

    public static SelectSubCategory any() {
        return new SelectSubCategory();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades categories = SUBCATEGORIES.resolveAllFor(actor);
        WebElementFacade category = pickRandomItem(categories);
        actor.attemptsTo(
                Scroll.to(category),
                Click.on(category)
        );
    }
}
