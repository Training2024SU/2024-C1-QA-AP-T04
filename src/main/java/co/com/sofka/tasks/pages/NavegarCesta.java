package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageProducto.BOTON_NAVEGAR_CESTA;

public class NavegarCesta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NAVEGAR_CESTA)
        );
    }

    public static NavegarCesta navegarCesta() {
        return new NavegarCesta();
    }
}
