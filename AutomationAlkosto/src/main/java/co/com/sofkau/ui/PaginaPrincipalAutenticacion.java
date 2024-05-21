package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginaPrincipalAutenticacion extends PageObject {
    public static Target CAMPO_EMAIL = Target.
            the("campo email").located(org.openqa.selenium.By.
                    xpath("//*[@id= 'js-login-email']"));

    public static Target BOTON_CONTINUAR_AUTENTICACION = Target.
            the("boton continuar autenticacion").located(org.openqa.selenium.By.
                    id("js-login-continue"));
}
