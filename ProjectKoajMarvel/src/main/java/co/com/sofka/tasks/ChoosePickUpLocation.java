package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import static co.com.sofka.ui.CarPage.*;

public class ChoosePickUpLocation implements Task {
    private String city = "BOGOTA";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PICKUP_OPTION),
                Enter.theValue("Bogota").into(SEARCH_FIELD_PICKUP),
                Click.on(By.xpath("//ul[@id='_sd_user_location_popup__stores-list']//*[contains(text(),'"+ city + "')]")),
                Click.on(CONFIRM_PICKUP_DIRECTION)
        );

    }
    public static ChoosePickUpLocation choosePickUpLocation(){return new ChoosePickUpLocation();}
}
