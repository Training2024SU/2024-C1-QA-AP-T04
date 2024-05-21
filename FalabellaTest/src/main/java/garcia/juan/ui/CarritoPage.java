package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    public static final Target BOTON_CONTINUAR_COMPRA = Target.
            the("Boton para continuar compra en carrito").
            located(By.xpath("//button[text()='Continuar compra']"));
}
