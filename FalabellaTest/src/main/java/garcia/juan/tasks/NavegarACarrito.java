package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static garcia.juan.ui.BusquedaPage.ICONO_CARRITO;


public class NavegarACarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ICONO_CARRITO),
                Click.on(ICONO_CARRITO)
        );
    }

    public static NavegarACarrito navegarACarrito(){
        return new NavegarACarrito();
    }
}
