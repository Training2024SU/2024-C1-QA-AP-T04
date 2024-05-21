package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.davidbonelo.ui.HomePage.SEARCHBOX;

public class Search implements Performable {

    private final String searchTerm;

    public Search(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public static Search byKeyword(String searchTerm) {
        return new Search(searchTerm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchTerm).into(SEARCHBOX)
                        .thenHit(Keys.ENTER)
        );
    }
}
