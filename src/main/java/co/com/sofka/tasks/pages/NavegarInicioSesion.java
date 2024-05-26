package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageLogin.BOTON_INICIO_DE_SESION;

public class NavegarInicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIO_DE_SESION)
        );
    }

    public static NavegarInicioSesion navegarInicioSesion() {
        return new NavegarInicioSesion();
    }
}
