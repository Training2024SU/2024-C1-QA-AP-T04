package osorio.alvarez.devon.tasks.compraproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static osorio.alvarez.devon.ui.PageCompraProducto.*;

public class SeleccionarProducto implements Task {
    String producto;


    public SeleccionarProducto conNombre(String producto) {
        this.producto = producto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSQUEDA_PRODUCTO),
                Enter.theValue(producto).into(CAMPO_BUSQUEDA_PRODUCTO),
                Hit.the(Keys.ENTER).into(CAMPO_BUSQUEDA_PRODUCTO),
                Scroll.to(SCROLL_TEXT_PRODUCT),
                WaitUntil.the(PRODUCTO, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(PRODUCTO, isClickable()).forNoMoreThan(10).seconds(),
                //JavaScriptClick.on(PRODUCTO),
                Click.on(PRODUCTO),
                WaitUntil.the(IR_AL_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(IR_AL_CARRITO),
                WaitUntil.the(BOTON_IR_A_PAGAR, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_IR_A_PAGAR),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }

    public static SeleccionarProducto seleccionarProducto() {
        return new SeleccionarProducto();
    }
}
