package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaMetodoDeEnvio extends PageObject {
    public static final Target BOTON_CONFIRMAR_METODO_ENVIO = Target.
            the("boton continuar metodo de envio").located(By.
                    id("deliveryMethodSubmit"));
    public static final Target ACTUALIZAR_DATOS_DE_ENVIO = Target.
            the("actualizar datos de envio").located(By.
                    id("addNewAddress"));
    public static final Target BOTON_CONTINUAR_CON_ACTUALIZACION = Target.
            the("boton continuar con actualizacion de envio").located(By.
                    xpath("//button[@class = 'button-primary js-redirectToHardLoginSecondStep']"));
}
