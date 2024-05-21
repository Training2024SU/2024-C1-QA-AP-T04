package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaFormaDePago extends PageObject {
    public static final Target BOTON_CONTINUAR_METODO_ENVIO = Target.
            the("boton continuar metodo de envio").located(By.
                    xpath("//button[@class = 'button-primary js-animationPaymentMethodBtn']"));

    public static final Target SELECCIONAR_METODO_DE_ENVIO_CASH = Target.
            the("seleccionar metodo de envio, efetivo").located(By.
                    xpath("//a[@class='pm-tab payment_method_option z-link' and @data-pmcode='CASH']"));
    public static final Target SELECCIONAR_EFECTY = Target.
            the("seleccionar metodo de envio, efetivo").located(By.
                    xpath("//div[@class='form-check custom-radio']//label[@for = 'efecty']"));
    public static final Target BOTON_CONFIRMAR_FORMA_DE_PAGO = Target.
            the("boton confirmar forma de pago y pasar a revision y aprobacion").located(By.
                    xpath("//div[@class = 'cash-payment--continue']//button[@class='button-primary js-animationPaymentMethodBtn']"));
}
