package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageSeleccion.BOTON_INFORMATICA;

public class NavegarInformatica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INFORMATICA)
        );
    }

    public static NavegarInformatica navegarInformatica() {
        return new NavegarInformatica();
    }
}
