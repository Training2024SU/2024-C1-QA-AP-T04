package co.com.sofka.tasks.pages;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PageMonky.SECCION_MUJER;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class NavegarAlProducto implements Task {

    private String seccion;

    public NavegarAlProducto(String seccion) {
        this.seccion = seccion;
    }

    public static NavegarAlProducto aLaSeccion(String seccion) {
        return instrumented(NavegarAlProducto.class, seccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SECCION_MUJER, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SECCION_MUJER)

        );
    }
}




