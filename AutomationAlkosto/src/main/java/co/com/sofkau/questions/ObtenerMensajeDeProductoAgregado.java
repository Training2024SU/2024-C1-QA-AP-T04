package co.com.sofkau.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaConfirmacion.MENSAJE_CONFIRMACION_PRODUCTO_AGREGADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerMensajeDeProductoAgregado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MENSAJE_CONFIRMACION_PRODUCTO_AGREGADO, isVisible()).forNoMoreThan(10).seconds();
        return MENSAJE_CONFIRMACION_PRODUCTO_AGREGADO.resolveFor(actor).getText();
    }
    public static ObtenerMensajeDeProductoAgregado obtenerMensajeDeProductoAgregado(){
        return new ObtenerMensajeDeProductoAgregado();
    }
}
