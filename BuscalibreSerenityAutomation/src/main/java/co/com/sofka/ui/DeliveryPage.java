package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.sofka.constants.ConstantsOperation.*;

public class DeliveryPage extends PageObject {
    public static final Target EMAIL_INPUT = Target
            .the(EMAIL_INPUT_THE).located(By.xpath("//input[@id='signin_username']"));
    public static final Target CONTINUE_BUTTON = Target
            .the(CONTINUE_BUTTON_THE).located(By.xpath("//button[text()='Continuar']"));
    public static final Target EMAIL_CONFIRMATION_INPUT = Target
            .the(EMAIL_CONFIRMATION_THE).located(By.xpath("//input[@id='signup_email_confirm']"));
    public static final Target NAME_INPUT = Target
            .the(NAME_THE).located(By.id("signup_nombre"));
    public static final Target LAST_NAME_INPUT = Target
            .the(LAST_NAME_THE).located(By.id("signup_apellido"));
    public static final Target PASSWORD_INPUT = Target
            .the(PASSWORD_THE).located(By.xpath("//input[@id='signup_clave']"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target
            .the(CONFIRM_PASSWORD_THE).located(By.xpath("//input[@id='signup_confirmar_clave']"));
    public static final Target CREATE_ACCOUNT_BUTTON = Target
            .the(CREATE_ACCOUNT_THE).located(By.xpath("//button[text()='Crear cuenta']"));
    public static final Target STATES = Target
            .the(STATE_THE).located(By.xpath("//select[@id='direccion_c_region']"));
    public static final Target STATE_OPTIONS = Target
            .the(STATE_THE).located(By.xpath("//select[@id='direccion_c_region']/option"));
    public static final Target CITIES = Target
            .the(CITY_THE).located(By.xpath("//select[@id='direccion_c_comuna']"));
    public static final Target CITY_OPTIONS = Target
            .the(CITY_THE).located(By.xpath("//select[@id='direccion_c_comuna']/option"));
    public static final Target ID = Target
            .the(ID_THE).located(By.xpath("//input[@id='direccion_rut']"));
    public static final Target ADDRESSEE = Target
            .the(ADDRESSEE_THE).located(By.xpath("//input[@id='direccion_destinatario']"));
    public static final Target ADDRESS = Target
            .the(ADDRESS_THE).located(By.xpath("//input[@id='direccion_calle']"));
    public static final Target PHONE = Target
            .the(PHONE_THE).located(By.xpath("//input[@id='direccion_telefono']"));
    public static final Target VALIDATE_ADDRESS_BUTTON = Target
            .the(VALIDATE_ADDRESS_THE).located(By.xpath("//button[text()='Validar Dirección']"));
    public static final Target SEND_HERE_BUTTON = Target
            .the(SEND_HERE_THE).located(By.xpath("//button[text()='ENVÍAR AQUÍ']"));

}
