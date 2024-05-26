package co.com.sofka.questions.page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageConfirmacion.MENSAJE_TARJETA_FINAL;

public class ObtenerMensajeTarjeta implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_TARJETA_FINAL.resolveFor(actor).getText();
    }

    public static ObtenerMensajeTarjeta obtenerMensajeTarjeta(){
        return new ObtenerMensajeTarjeta();
    }
}
