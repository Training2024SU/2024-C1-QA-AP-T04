package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageConfirmacion extends PageObject {
    public static final Target CERRAR_ALERTA_PEDIDO = Target.
            the("boton de usar esta direccion").
            located(By.id("close-button-1454703513202"));

    public static final Target MENSAJE_CONFIRMACION = Target.
            the("Mensaje de confirmacion").
            located(By.xpath("//strong[contains(., 'gracias por preferirnos')]"));

}
