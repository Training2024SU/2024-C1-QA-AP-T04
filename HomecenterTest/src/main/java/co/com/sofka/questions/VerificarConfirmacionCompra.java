package co.com.sofka.questions;

import co.com.sofka.ui.PageConfirmacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarConfirmacionCompra implements Question<String > {
    @Override
    public String answeredBy(Actor actor) {
        return PageConfirmacion.MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }
    public static VerificarConfirmacionCompra verificarConfirmacionCompra(){
        return new  VerificarConfirmacionCompra();
    }
}
