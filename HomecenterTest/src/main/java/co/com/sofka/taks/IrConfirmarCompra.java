package co.com.sofka.taks;

import co.com.sofka.ui.PageCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrConfirmarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageCarrito.CONTINUAR_COMPRA)
        );

    }

    public static IrConfirmarCompra irConfirmarCompra(){
        return new IrConfirmarCompra();
    }
}
