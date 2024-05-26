package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PageProducto.BOTON_TRAMITAR_PEDIDO;
import static co.com.sofka.ui.PageTramitarPedido.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TramitarPedido implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_TRAMITAR_PEDIDO),
                Click.on(BOTON_ENVIAR_DIRECCION),
                WaitUntil.the(BOTON_AGREGAR_TARJETA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_AGREGAR_TARJETA)
        );
    }

    public static TramitarPedido tramitarPedido() {
        return new TramitarPedido();
    }
}
