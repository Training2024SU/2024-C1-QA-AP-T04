package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaMetodoDeEnvio.BOTON_CONFIRMAR_METODO_ENVIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmarMetodoDeEnvio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_CONFIRMAR_METODO_ENVIO),
                WaitUntil.the(BOTON_CONFIRMAR_METODO_ENVIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR_METODO_ENVIO)
        );
    }
    public static ConfirmarMetodoDeEnvio confirmarMetodoDeEnvio(){
        return new ConfirmarMetodoDeEnvio();
    }
}
