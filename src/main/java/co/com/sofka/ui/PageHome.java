package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageHome extends PageObject {
    public static final Target buttonCloseBanner = Target.
            the("Botón para cerrar banenr inicio").located(By.xpath("//button[contains(@class,'closeButton')]"));

    public static final Target buttonSale = Target.
            the("Botón Sale").located(By.xpath("//p[contains(text(),'SALE')]/ancestor::button"));

}
