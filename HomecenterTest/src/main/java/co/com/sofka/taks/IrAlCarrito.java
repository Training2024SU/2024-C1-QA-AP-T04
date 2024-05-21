package co.com.sofka.taks;

import co.com.sofka.ui.PageSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageSearch.CARRITO_DE_COMPRAS)
        );

    }
    public static IrAlCarrito gotoCarrito() {
        return new IrAlCarrito();
    }


}
