package co.com.sofka.tasks.pages;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.sofka.ui.PageMonky.SELECCIONAR_PRODUCTO_TOPS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarTops implements Task {
    public static SeleccionarTops enLaSeccionTops() {
        return instrumented(SeleccionarTops.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            //    WaitUntil.the(SELECCIONAR_PRODUCTO_TOPS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_PRODUCTO_TOPS)

        );
    }
}

