package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageSeleccionMetodo extends PageObject {


    public static Target METODO_EFECTY = Target.
            the("Senal de metodos de pago").located(By.xpath("//div[@data-testid='testId-payment-option-PAY_AT_STORE']"));
    public static Target CONFIRMAR_METODO = Target.
            the("Confirmar metodo de pago Efecty").located(By.id("testId-btn-singleButton"));
    public static Target NOMBRE_FORM = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//input[@id='testId-name']"));
    public static Target APELLIDO_FORM = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//input[@id='testId-lastName']"));
    public static Target CEDULA = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//input[@id='testId-documentType']"));
    public static Target TELEFONO = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//input[@id='testId-phoneNumber-phoneNumber']"));
    public static Target CORREO = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//input[@id='testId-email']"));
    public static Target TIPO_CONTRIBUYENTE = Target.
            the("Confirmar metodo de pago Efecty").located(By.xpath("//div[@id='testId-Dropdown-taxPayer-value']"));
    public static Target SELECCION_NO_APLICA = Target.
            the("Confirmar metodo de pago Efecty").located(By.id("testId-li-testId-DropdownList-testId-Dropdown-taxPayer-dropdown-list-item-1"));
    public static Target TERMINOS = Target.
            the("Confirmar metodo de pago Efecty").located(By.id("checkbox-declareTerms"));
    public static Target REGLAMENTOS = Target.
            the("Confirmar metodo de pago Efecty").located(By.id("checkbox-cmrPointTerms"));
    public static Target CONFIRMAR_COMPRA = Target.
            the("Confirmar metodo de pago Efecty").located(By.id("testId-btn-singleButton"));
}
