package co.com.sofka.tasks;

import co.com.sofka.util.Util;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.ui.DeliveryPage.CITIES;
import static co.com.sofka.ui.DeliveryPage.CITY_OPTIONS;

public class SelectRandomCity implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades optionsCity = CITY_OPTIONS.resolveAllFor(actor);
        int city = Util.selectRandomOption(optionsCity);
        actor.attemptsTo(
                SelectFromOptions.byIndex(city).from(CITIES)
        );
    }
    public static SelectRandomCity selectRandomCity() {
        return new SelectRandomCity();
    }
}
