package com.davidbonelo.tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.davidbonelo.utils.Utils.pickRandomItem;
import static com.davidbonelo.ui.HomePage.CATEGORIES;
import static com.davidbonelo.ui.HomePage.OPEN_CATEGORY;

public class SelectMainCategory implements Performable {

    public static SelectMainCategory any() {
        return new SelectMainCategory();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades categories = CATEGORIES.resolveAllFor(actor);
        WebElementFacade category = pickRandomItem(categories);
        actor.attemptsTo(
                Scroll.to(category),
                Click.on(category),
                Click.on(OPEN_CATEGORY).afterWaitingUntilPresent()
        );
    }
}
