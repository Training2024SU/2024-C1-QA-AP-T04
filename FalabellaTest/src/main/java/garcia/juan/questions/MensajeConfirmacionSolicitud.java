package garcia.juan.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static garcia.juan.ui.ConfirmacionPage.MENSAJE_CONFIRMACION;

public class MensajeConfirmacionSolicitud implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }

    public static MensajeConfirmacionSolicitud mensajeConfirmacionSolicitud(){
        return new MensajeConfirmacionSolicitud();
    }
}
