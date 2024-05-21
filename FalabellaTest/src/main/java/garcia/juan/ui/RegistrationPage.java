package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {

    public static final Target INPUT_NOMBRE_PERSONA = Target.
            the("Nombre persona").located(By.id("testId-Input-firstName"));

    public static final Target INPUT_APELLIDOS_PERSONA = Target.
        the("Apellidos persona").located(By.id("testId-Input-lastName"));

    public static final Target LIST_TIPO_DOCUMENTO = Target.
        the("Lista tipos doc").located(By.xpath("//button[@data-testid='testId-Dropdown-testId-dropdown-Tipo de documento-desktop']"));

    public static final Target BOTON_CEDULA = Target.
            the("Boton cedula de ciudadania").located(By.id("testId-Dropdown-Cédula de Ciudadanía"));

    public static final Target INPUT_DOCUMENTO_PERSONA = Target.
            the("Documento persona").located(By.id("testId-Input-document"));

    public static final Target INPUT_TELEFONO_PERSONA = Target.
            the("Telefono persona").located(By.id("testId-Input-phoneNumber"));

    public static final Target INPUT_EMAIL_PERSONA = Target.
            the("Email persona").located(By.id("email"));

    public static final Target INPUT_CONTRASENA_PERSONA = Target.
            the("Contrasena persona").located(By.id("testId-Input-password"));

    public static final Target BOTON_ACEPTAR_TERMINOS = Target.
            the("boton de aceptar terminos y condiciones").located(By.xpath("//label[@for='testId-TyC-BU_consentTemplateRegistroTyC_FAL_CO-checkbox']"));

    public static final Target BOTON_REGISTRAR = Target.
            the("Boton para registrar").located(By.id("saveButton"));

    public static final Target BOTON_IR_A_COMPRAR = Target.
            the("Boton ir a comprar").located(By.id("testId-button-home"));



}
