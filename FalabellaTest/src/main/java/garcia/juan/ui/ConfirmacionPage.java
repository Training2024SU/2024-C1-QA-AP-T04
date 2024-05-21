package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionPage extends PageObject {

public static final Target MENSAJE_CONFIRMACION = Target.
        the("Mensaje de confirmacion").
        located(By.xpath("//span[@class='jsx-1508542074 body-copy-shade1-bold body-xs body-xl ']"));

}
