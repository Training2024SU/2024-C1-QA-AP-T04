package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaRevisionYAprobacion.BOTON_CONFIRMAR_REVISION_APROBACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmarRevisionYAprobacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_CONFIRMAR_REVISION_APROBACION),
                WaitUntil.the(BOTON_CONFIRMAR_REVISION_APROBACION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR_REVISION_APROBACION)
        );
    }
    public static ConfirmarRevisionYAprobacion confirmarRevisionYAprobacion(){
        return new ConfirmarRevisionYAprobacion();
    }
}