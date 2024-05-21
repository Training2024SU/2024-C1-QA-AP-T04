package co.com.sofka.tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.HomePage.CATEGORIES;
import static co.com.sofka.util.Util.selectRandomItem;

public class SelectRandomCategory implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades bookCategories = CATEGORIES.resolveAllFor(actor);
        WebElementFacade categorySelected = selectRandomItem(bookCategories);
        actor.attemptsTo(
                Click.on(categorySelected)
        );
    }
    public static SelectRandomCategory selectRandomCategory() {
        return new SelectRandomCategory();
    }
}
