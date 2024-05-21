package co.com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaConfirmacion.MENSAJE_CONFIRMACION_INICIO_SESION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerMensajeInicioDeSesion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE_CONFIRMACION_INICIO_SESION, isVisible()).forNoMoreThan(10).seconds();
        return MENSAJE_CONFIRMACION_INICIO_SESION.resolveFor(actor).getText();
    }
    public static ObtenerMensajeInicioDeSesion obtenerMensajeInicioDeSesion(){
        return new ObtenerMensajeInicioDeSesion();
    }
}
