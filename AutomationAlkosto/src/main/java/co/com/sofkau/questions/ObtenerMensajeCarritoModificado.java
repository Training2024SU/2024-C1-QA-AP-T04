package co.com.sofkau.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaCarritoDeCompras.MENSAJE_CANTIDAD_MODIFICADA_EXITOSAMENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerMensajeCarritoModificado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE_CANTIDAD_MODIFICADA_EXITOSAMENTE, isVisible()).forNoMoreThan(10).seconds();
        return MENSAJE_CANTIDAD_MODIFICADA_EXITOSAMENTE.resolveFor(actor).getText();
    }
    public static ObtenerMensajeCarritoModificado obtenerMensajeCarritoModificado(){
        return new ObtenerMensajeCarritoModificado();
    }
}
