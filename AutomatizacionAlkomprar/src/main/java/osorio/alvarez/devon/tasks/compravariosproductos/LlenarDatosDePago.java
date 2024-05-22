package osorio.alvarez.devon.tasks.compravariosproductos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static osorio.alvarez.devon.ui.PageCompraProducto.*;

public class LlenarDatosDePago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_METODO_ENVIO_CONTINUAR, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(BOTON_METODO_ENVIO_CONTINUAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_METODO_ENVIO_CONTINUAR),
                WaitUntil.the(CAMPO_METODO_DE_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_METODO_DE_PAGO),
                WaitUntil.the(CAMPO_SELECT_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_SELECT_PAGO),
                WaitUntil.the(BOTON_CONTINUAR_REVISAR_PEDIDO, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(BOTON_CONTINUAR_REVISAR_PEDIDO, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_CONTINUAR_REVISAR_PEDIDO),
                WaitUntil.the(BOTON_GENERAR_RECIBO_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_GENERAR_RECIBO_PAGO)
        );
    }

    public static LlenarDatosDePago llenarDatosDePago() {
        return new LlenarDatosDePago();
    }
}
