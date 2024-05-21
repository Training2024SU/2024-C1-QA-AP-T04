package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaListaDeProducto.MODAL_CARRITO_DE_COMPRAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAPagarCarritoDesdeModal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MODAL_CARRITO_DE_COMPRAS),
                WaitUntil.the(MODAL_CARRITO_DE_COMPRAS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MODAL_CARRITO_DE_COMPRAS)
        );
    }
    public static IrAPagarCarritoDesdeModal irAPagarCarritoDesdeModal(){
        return new IrAPagarCarritoDesdeModal();
    }
}
