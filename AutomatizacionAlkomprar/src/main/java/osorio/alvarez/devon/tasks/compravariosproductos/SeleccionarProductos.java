package osorio.alvarez.devon.tasks.compravariosproductos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static osorio.alvarez.devon.ui.PageCompraProducto.*;
import static osorio.alvarez.devon.ui.PageCompraVariosProductos.*;

public class SeleccionarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSQUEDA_PRODUCTO),
                Enter.theValue("celular").into(CAMPO_BUSQUEDA_PRODUCTO),
                Hit.the(Keys.ENTER).into(CAMPO_BUSQUEDA_PRODUCTO),
                WaitUntil.the(OPTION_ADD_CARRITO_1, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(OPTION_ADD_CARRITO_1, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPTION_ADD_CARRITO_1),
                WaitUntil.the(OPTION_CONTINUAR_COMPRANDO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPTION_CONTINUAR_COMPRANDO),
                Click.on(OPTION_ADD_CARRITO_2),
                WaitUntil.the(OPTION_CONTINUAR_COMPRANDO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPTION_CONTINUAR_COMPRANDO),
                WaitUntil.the(CAMPO_BUSQUEDA_ALTERNO, isClickable()).forNoMoreThan(20).seconds(),
                WaitUntil.the(CAMPO_BUSQUEDA_ALTERNO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CAMPO_BUSQUEDA_ALTERNO),
                Enter.theValue("mouse").into(CAMPO_BUSQUEDA_ALTERNO),
                WaitUntil.the(OPTION_ADD_CARRITO_3, isVisible()).forNoMoreThan(20).seconds(),
                MoveMouse.to(OPTION_ADD_CARRITO_3),
                Click.on(OPTION_ADD_CARRITO_3),
                WaitUntil.the(BOTON_IR_CARRITO_PAGAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_IR_CARRITO_PAGAR),
                WaitUntil.the(BOTON_IR_A_PAGAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }
    public static SeleccionarProductos seleccionarProductos() {
        return new SeleccionarProductos();
    }
}
