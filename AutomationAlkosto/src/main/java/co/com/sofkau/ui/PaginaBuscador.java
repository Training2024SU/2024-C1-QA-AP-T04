package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginaBuscador extends PageObject {
    public static Target CAMPO_BUSCAR_PRODUCTO = Target.
            the("campo buscar productos").located(org.openqa.selenium.By.
                    xpath("//input[@id= 'js-site-search-input']"));

    public static Target BOTON_BUSCAR = Target.
            the("campo buscar productos").located(org.openqa.selenium.By.
                    xpath("//button[@id= 'js-search-button']"));
}
