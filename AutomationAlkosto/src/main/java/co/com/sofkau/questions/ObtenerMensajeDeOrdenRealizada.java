package co.com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaOrdenDeConfirmacion.MENSAJE_CONFIRMACION_ESPERA_DE_PAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerMensajeDeOrdenRealizada implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE_CONFIRMACION_ESPERA_DE_PAGO, isVisible()).forNoMoreThan(10).seconds();
        return MENSAJE_CONFIRMACION_ESPERA_DE_PAGO.resolveFor(actor).getText();
    }
    public static ObtenerMensajeDeOrdenRealizada obtenerMensajeDeOrdenRealizada(){
        return new ObtenerMensajeDeOrdenRealizada();
    }
}