package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.MainPage.BUTTON_REDIRECT_CAR;
import static co.com.sofka.ui.MainPage.BUTTON_REDIRECT_MAIN_PAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RedirectMainPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_REDIRECT_MAIN_PAGE, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_REDIRECT_MAIN_PAGE)
        );


    }
    public static RedirectMainPage redirectMainPage(){return new RedirectMainPage();}
}
