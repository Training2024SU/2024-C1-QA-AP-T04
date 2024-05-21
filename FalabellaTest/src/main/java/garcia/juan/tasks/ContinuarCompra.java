package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static garcia.juan.ui.CarritoPage.BOTON_CONTINUAR_COMPRA;

public class ContinuarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_CONTINUAR_COMPRA),
                Click.on(BOTON_CONTINUAR_COMPRA)
        );
    }

    public static ContinuarCompra continuarCompra(){
        return new ContinuarCompra();
    }
}
