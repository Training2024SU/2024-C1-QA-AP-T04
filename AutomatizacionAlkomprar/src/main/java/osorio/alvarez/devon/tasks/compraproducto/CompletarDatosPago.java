package osorio.alvarez.devon.tasks.compraproducto;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static osorio.alvarez.devon.ui.PageCompraProducto.*;
import static osorio.alvarez.devon.utils.UtilCompra.cedula;

public class CompletarDatosPago implements Task {
    String cedulaNum = cedula();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_TIPO_DOCUMENTO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CAMPO_TIPO_DOCUMENTO),
                Click.on(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(cedulaNum).into(CAMPO_NUMERO_DOCUMENTO),
                WaitUntil.the(CAMPO_DEPARTAMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(CAMPO_DEPARTAMENTO),
                Click.on(CAMPO_DEPARTAMENTO),
                Click.on(SELECT_DEPARTAMENTO),
                WaitUntil.the(CAMPO_DIRECCION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DIRECCION),
                Enter.theValue(direccion()).into(CAMPO_DIRECCION),
                Click.on(CAMPO_BARRIO),
                Enter.theValue(barrio()).into(CAMPO_BARRIO),
                Click.on(CHECK_GUARDAR_DIRECCION),
                WaitUntil.the(BOTON_CONTINUAR_PAGO, isClickable()).forNoMoreThan(20).seconds(),
                WaitUntil.the(BOTON_CONTINUAR_PAGO, isVisible()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(BOTON_CONTINUAR_PAGO),
                Click.on(BOTON_CONTINUAR_PAGO),
                //WaitUntil.the(CHECK_CONFIRMAR_DIRECCION, isClickable()).forNoMoreThan(10).seconds(),
                //Click.on(CHECK_CONFIRMAR_DIRECCION),
                //Click.on(BOTON_CONFIRMAR_DIRECCION),
                WaitUntil.the(BOTON_METODO_ENVIO_CONTINUAR, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(BOTON_METODO_ENVIO_CONTINUAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_METODO_ENVIO_CONTINUAR),
                WaitUntil.the(CAMPO_METODO_DE_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_METODO_DE_PAGO),
                WaitUntil.the(CAMPO_SELECT_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_SELECT_PAGO),
                WaitUntil.the(BOTON_CONTINUAR_REVISAR_PEDIDO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_REVISAR_PEDIDO),
                WaitUntil.the(BOTON_GENERAR_RECIBO_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_GENERAR_RECIBO_PAGO)

        );
    }

    public static CompletarDatosPago completarDatosDePago() {
        return new CompletarDatosPago();
    }
}
