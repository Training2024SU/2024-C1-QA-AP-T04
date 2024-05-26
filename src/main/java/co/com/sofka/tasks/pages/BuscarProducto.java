package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.sofka.ui.PageSeleccion.*;

public class BuscarProducto implements Task {
    String producto;

    public BuscarProducto por(String producto) {
        this.producto = producto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSQUEDA),
                Enter.theValue(producto).into(CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSCAR)
        );
    }

    public static BuscarProducto buscarProducto() {
        return new BuscarProducto();
    }
}
