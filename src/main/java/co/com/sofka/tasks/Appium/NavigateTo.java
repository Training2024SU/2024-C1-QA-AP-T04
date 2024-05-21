package co.com.sofka.tasks.Appium;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.HomeView.loginLink;


public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(loginLink)
        );
    }

    public static NavigateTo navigateTo(){
        return new NavigateTo();
    }

}
