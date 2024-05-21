package co.com.sofkau.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofkau.ui.PaginaCarritoDeCompras.CARRITO_DE_COMPRAS;


public class NavegarACarritoDeCompras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CARRITO_DE_COMPRAS),
                Click.on(CARRITO_DE_COMPRAS),
                Click.on(CARRITO_DE_COMPRAS)
        );
    }
    public static NavegarACarritoDeCompras navegarACarritoDeCompras(){
        return new NavegarACarritoDeCompras();
    }
}

