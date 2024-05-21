package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.davidbonelo.ui.ProductsListPage.LOGO;

public class NavigateToHomePage implements Performable {
    public static NavigateToHomePage navigateToHomePage() {
        return new NavigateToHomePage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(Keys.HOME).into("//body"),
                Scroll.to(LOGO),
                Click.on(LOGO)
        );
    }
}
