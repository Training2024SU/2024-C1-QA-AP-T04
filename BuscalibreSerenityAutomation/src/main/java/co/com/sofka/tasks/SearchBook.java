package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.ui.HomePage.SEARCH_BUTTON;
import static co.com.sofka.ui.HomePage.SEARCH_ENGINE_INPUT;

public class SearchBook implements Task {
    String bookName;

    public SearchBook withName(String book) {
        this.bookName = book;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(bookName).into(SEARCH_ENGINE_INPUT),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchBook searchBook() {
        return new SearchBook();
    }
}
