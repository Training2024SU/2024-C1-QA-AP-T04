package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageLogin extends PageObject {

    public static final Target BOTON_SIGN_UP = Target.
            the("boton inicio de sesión").located(By.cssSelector("a[href='/login']"));
    public static final Target CAMPO_USER = Target.
            the("Campo usuario").located(By.xpath("//*[@name='name']"));
    public static final Target CAMPO_CORREO = Target.
            the("Campo correo").located(By.xpath("//input[@data-qa='signup-email']"));
    public static final Target BOTON_ACEPT = Target.
            the("boton aceptar").located(By.xpath("//button[text()='Signup']"));


}
