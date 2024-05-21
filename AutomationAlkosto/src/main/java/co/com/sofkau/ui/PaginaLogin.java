package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaLogin extends PageObject {
    public static final Target BOTON_LOGIN_MAIL_Y_CONTRASENA = Target.
            the("boton login con mail y contrasena").located(By.
                    xpath("//li[@id='js-loginEmailPass']"));

    public static final Target CAMPO_PASSWORD = Target.
            the("campo password de login").located(By.
                    xpath("//input[@class = 'js-float-input float-input-group__input js-myaccount-email-password']"));
    public static final Target BOTON_CONTINUAR_LOGIN = Target.
            the("campo password de login").located(By.
                    xpath("//button[@class = 'button-primary js-login-email-password']"));

    public static final Target BOTON_ALKOSTO_PP = Target.
            the("campo password de login").located(By.
                    xpath("//div[@class = 'banner__component simple-banner']"));

}
