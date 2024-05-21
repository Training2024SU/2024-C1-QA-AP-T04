package co.com.sofkau.ui;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_SIGN_UP = Target.
            the("boton inicio de sesion").located(By.
                    xpath("//li[@id = 'js-myaccount-header']"));

    public static Target CAMPO_NOMBRES = Target.
            the("campo nombres").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'register.firstName']"));
    public static Target CAMPO_APELLIDOS = Target.
            the("campo apellidos").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'register.lastName']"));
    public static Target CAMPO_CELULAR = Target.
            the("campo celular").located(org.openqa.selenium.By.
                    xpath("//input[@id = 'register.mobileNumber']"));
    public static Target SELECCION_TERMINOS_CONDICIONES = Target.
            the("seleccionar terminos y condiciones").located(org.openqa.selenium.By.
                    xpath("//label[@for= 'registerChkTermsConditions']"));

    public static Target BOTON_CONTINUAR_REGISTRO = Target.
            the("boton continuar en formulario de registro").located(org.openqa.selenium.By.
                    xpath("//button[@class='button-primary btn-block js-btn-register-myaccount']"));

}
