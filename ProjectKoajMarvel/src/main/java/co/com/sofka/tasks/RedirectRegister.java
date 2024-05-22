package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.MainPage.BOTON_SIGN_UP;

public class RedirectRegister implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_SIGN_UP)
        );
    }


    public static RedirectRegister redirectRegister(){
        return new RedirectRegister();
    }
}
