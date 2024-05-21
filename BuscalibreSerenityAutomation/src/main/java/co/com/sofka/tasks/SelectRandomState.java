package co.com.sofka.tasks;

import co.com.sofka.util.Util;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.sofka.ui.DeliveryPage.*;

public class SelectRandomState implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades optionsState = STATE_OPTIONS.resolveAllFor(actor);
        int state = Util.selectRandomOption(optionsState);


        actor.attemptsTo(
                SelectFromOptions.byIndex(state).from(STATES)
        );
    }

    public static SelectRandomState selectRandomState() {
        return new SelectRandomState();
    }
}
