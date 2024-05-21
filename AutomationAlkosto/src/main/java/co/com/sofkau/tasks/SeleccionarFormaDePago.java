package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaFormaDePago.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarFormaDePago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SELECCIONAR_METODO_DE_ENVIO_CASH),
                WaitUntil.the(SELECCIONAR_METODO_DE_ENVIO_CASH, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_METODO_DE_ENVIO_CASH),
                WaitUntil.the(SELECCIONAR_EFECTY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_EFECTY),
                Click.on(BOTON_CONFIRMAR_FORMA_DE_PAGO)
        );
    }

    public static SeleccionarFormaDePago seleccionarFormaDePago() {
        return new SeleccionarFormaDePago();
    }
}
