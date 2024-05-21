package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageConfirmation extends PageObject {
    public static final Target MENSAJE_CONFIRMACION = Target.
            the("Mensaje ingresar account informacion").located(By.xpath("//b[contains(text(),'Enter')]"));
}
