package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.ui.PageProducto.BOTON_AGREGAR_CESTA;
import static co.com.sofka.ui.PageSeleccion.BOTON_INFORMATICA;
import static co.com.sofka.ui.PageSeleccion.retornarTargetOferta;

public class SeleccionarProductosInformatica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(retornarTargetOferta(1,2)),
                Click.on(BOTON_AGREGAR_CESTA),
                Click.on(BOTON_INFORMATICA),
                Scroll.to(retornarTargetOferta(1,1)),
                Click.on(retornarTargetOferta(1,1))
        );
    }

    public static SeleccionarProductosInformatica seleccionarProductosInformatica() {
        return new SeleccionarProductosInformatica();
    }
}
