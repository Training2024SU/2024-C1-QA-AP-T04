package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInformacionAutenticacion {
    public static Target CAMPO_EMAIL_INFORMACION = Target.
            the("campo email").located(org.openqa.selenium.By.
                    cssSelector("form .email-input input"));

    public static Target BOTON_CONTINUAR_AUTENTICACION_INFORMACION = Target.
            the("boton continuar autenticacion").located(org.openqa.selenium.By.
                    xpath("//form[@id='alkostoSoftLoginForm']/button"));
}
