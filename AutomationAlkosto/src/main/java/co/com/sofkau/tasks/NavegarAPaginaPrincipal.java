package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.sofkau.ui.PaginaLogin.BOTON_ALKOSTO_PP;

public class NavegarAPaginaPrincipal implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ALKOSTO_PP)
        );
    }
    public static NavegarAPaginaPrincipal navegarAPaginaPrincipal(){
        return new NavegarAPaginaPrincipal();
    }
}
