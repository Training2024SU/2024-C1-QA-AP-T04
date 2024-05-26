package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.ui.PageSeleccion.retornarTargetBusqueda;

public class SeleccionarProductosBuscados implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(retornarTargetBusqueda(3)),
                Click.on(retornarTargetBusqueda(3))
        );
    }

    public static SeleccionarProductosBuscados seleccionarProductosBuscados() {
        return new SeleccionarProductosBuscados();
    }
}
