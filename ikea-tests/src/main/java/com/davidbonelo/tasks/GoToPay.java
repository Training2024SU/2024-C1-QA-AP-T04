package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davidbonelo.tasks.NavigateToBag.navigateToBag;
import static com.davidbonelo.ui.BagPage.CHECKOUT;
import static com.davidbonelo.ui.BagPage.CONTINUE_GUEST;

public class GoToPay implements Task {
    public static GoToPay goToPay() {
        return new GoToPay();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                navigateToBag(),
                Click.on(CHECKOUT)
        );
        // An extra confirmation appears sometimes randomly
        if (CONTINUE_GUEST.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(CONTINUE_GUEST)
            );
        }
    }
}
