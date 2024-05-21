package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginaRevisionYAprobacion extends PageObject {
    public static Target BOTON_CONFIRMAR_REVISION_APROBACION = Target.
            the("campo email").located(org.openqa.selenium.By.
                    xpath("//button[@id= 'placeOrder' and @data-clicked = 'false']"));
}