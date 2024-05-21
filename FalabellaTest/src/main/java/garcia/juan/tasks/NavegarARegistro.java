package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static garcia.juan.ui.MainPage.REGISTRARSE_BOTON;
import static garcia.juan.ui.MainPage.USER_ACTIONS_MAIN_PAGE;

public class NavegarARegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_ACTIONS_MAIN_PAGE),
                Click.on(REGISTRARSE_BOTON)
        );
    }

    public static NavegarARegistro navegarARegistro(){
        return new NavegarARegistro();
    }
}