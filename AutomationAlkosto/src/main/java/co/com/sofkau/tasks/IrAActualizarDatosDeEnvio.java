package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofkau.ui.PaginaMetodoDeEnvio.ACTUALIZAR_DATOS_DE_ENVIO;

public class IrAActualizarDatosDeEnvio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ACTUALIZAR_DATOS_DE_ENVIO),
                Click.on(ACTUALIZAR_DATOS_DE_ENVIO)
        );
    }
    public static IrAActualizarDatosDeEnvio actualizarDatosDeEnvio(){
        return new IrAActualizarDatosDeEnvio();
    }
}