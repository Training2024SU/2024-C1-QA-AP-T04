package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaOrdenDeConfirmacion extends PageObject {
    public static final Target MENSAJE_CONFIRMACION_ESPERA_DE_PAGO = Target.
            the("mensaje de confirmacion a espera de pago").located(By.
                    cssSelector(".checkout-success .cash div"));
}