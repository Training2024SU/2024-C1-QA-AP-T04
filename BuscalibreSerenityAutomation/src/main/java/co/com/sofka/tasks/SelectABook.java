package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.ResultPage.selectsBook;


public class SelectABook implements Task {
    String bookName;

    public SelectABook named(String bookName) {
        this.bookName = bookName;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(selectsBook(bookName))
        );
    }

    public static SelectABook selectABook() {
        return new SelectABook();
    }
}
