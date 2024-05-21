package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static garcia.juan.ui.ProductoPage.BOTON_ADD_CART;
import static garcia.juan.ui.ProductoPage.BOTON_SEGUIR_COMPRANDO;

public class AgregarAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Scroll.to(BOTON_ADD_CART),
                Click.on(BOTON_ADD_CART),
                Click.on(BOTON_SEGUIR_COMPRANDO)
        );
    }

    public static AgregarAlCarrito agregarAlCarrito(){
        return new AgregarAlCarrito();
    }
}
