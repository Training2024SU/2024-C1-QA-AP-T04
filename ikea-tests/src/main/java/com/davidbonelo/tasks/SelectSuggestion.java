package com.davidbonelo.tasks;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davidbonelo.utils.Utils.pickRandomItem;
import static com.davidbonelo.ui.CheckoutPage.AUTOCOMPLETE_SUGGESTIONS;
import static com.davidbonelo.ui.CheckoutPage.getSuggestionByText;

public class SelectSuggestion implements Task {
    private final String suggestionText;

    public SelectSuggestion(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public static SelectSuggestion randomly() {
        return new SelectSuggestion(null);
    }

    public static SelectSuggestion withText(String suggestionText) {
        return new SelectSuggestion(suggestionText);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade suggestion = getSuggestionE(actor);
        actor.attemptsTo(
                Click.on(suggestion)
        );
    }

    private <T extends Actor> WebElementFacade getSuggestionE(T actor) {
        WebElementFacade suggestion;
        if (suggestionText != null) {
            suggestion = getSuggestionByText(suggestionText).resolveFor(actor);
        } else {
            ListOfWebElementFacades suggestions = AUTOCOMPLETE_SUGGESTIONS.resolveAllFor(actor);
            suggestion = pickRandomItem(suggestions);
        }
        return suggestion;
    }
}
