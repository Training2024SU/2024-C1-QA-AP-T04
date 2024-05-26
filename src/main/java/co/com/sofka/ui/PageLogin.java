package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PageLogin extends PageObject {
    public static final Target BOTON_INICIO_DE_SESION = Target
            .the("boton inicio de sesion")
            .located(By.cssSelector("#nav-link-accountList"));
    public static final Target CAMPO_EMAIL = Target
            .the("campo email")
            .located(By.xpath("//*[@id=\"ap_email\"]"));
    public static final Target BOTON_EMAIL = Target
            .the("boton continuar")
            .located(By.xpath("//*[@id=\"continue\"]"));
    public static final Target CAMPO_PASSWORD = Target
            .the("campo contraseña")
            .located(By.xpath("//*[@id=\"ap_password\"]"));
    public static final Target BOTON_INICIAR_SESION = Target
            .the("boton iniciar sesion")
            .located(By.xpath("//*[@id=\"signInSubmit\"]"));

}
