package co.com.sofka.tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.CategoryPage.BOOKS_BY_CATEGORY;
import static co.com.sofka.util.Util.selectRandomItem;

public class SelectARandomBook implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades books = BOOKS_BY_CATEGORY.resolveAllFor(actor);
        WebElementFacade bookSelected = selectRandomItem(books);
        actor.attemptsTo(
                Click.on(bookSelected)
        );
    }
    public static SelectARandomBook selectARandomBook() {
        return new SelectARandomBook();
    }
}
