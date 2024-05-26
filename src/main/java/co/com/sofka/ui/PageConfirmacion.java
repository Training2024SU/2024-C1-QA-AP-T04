package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageConfirmacion extends PageObject {
    public static final Target MENSAJE_CONFIRMACION = Target
            .the("muestra sesion iniciada")
            .located(By.cssSelector("#nav-link-accountList-nav-line-1"));
    public static final Target MENSAJE_TARJETA_FINAL = Target
            .the("muestra tarjeta incorrecta")
            .located(By.xpath("//*[@class='a-alert-heading']"));
}

