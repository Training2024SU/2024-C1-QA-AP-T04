package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoPage extends PageObject {

    public static final Target BOTON_ADD_CART = Target.
            the("Boton para agregar al carrito").located(By.id("add-to-cart-button"));

    public static final Target BOTON_SEGUIR_COMPRANDO = Target.
            the("Boton para seguir comprando").located(By.xpath("//button[@class='jsx-564399796 button button-secondary-link-mkp']"));

}
