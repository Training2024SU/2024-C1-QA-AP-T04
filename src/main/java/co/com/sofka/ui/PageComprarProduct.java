package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageComprarProduct extends PageObject {
    public static final Target inputEmail = Target.
            the("Input email").located(By.xpath("//input[@id='client-pre-email']"));

    public static final Target buttonContinueEmail = Target.
            the("Botón para continuar luego del ingreso del email").located(By.cssSelector("button[id='btn-client-pre-email']"));

    public static final Target inputFirstName = Target.
            the("Input nombre").located(By.id("client-first-name"));

    public static final Target inputLastName = Target
            .the("Input apellido")
            .located(By.id("client-last-name"));

    public static final Target inputDocument = Target
            .the("Input documento")
            .located(By.id("client-document"));

    public static final Target inputPhone = Target
            .the("Input teléfono")
            .located(By.id("client-phone"));

    public static final Target termsCheck = Target
            .the("Checkbox de términos")
            .located(By.cssSelector("input#terms-check"));

    public static final Target buttonnGoToPayment = Target
            .the("Botón form persona continuar compra ")
            .located(By.cssSelector("a#validate-terms"));

    public static final Target selectDepartamento = Target
            .the("Select departamento")
            .located(By.id("ship-state"));

    public static final Target selectCiudad = Target
            .the("Select Ciudad")
            .located(By.id("ship-city"));

    // Select element with ID 'tipo-via'
    public static final Target selectTipoVia = Target
            .the("Select tipo de vía")
            .located(By.id("tipo-via"));


    public static final Target inputNumero1 = Target
            .the("Input número 1")
            .located(By.xpath("//input[@id='numero-1']"));

    // Input element with ID 'numero-2'
    public static final Target inputNumero2 = Target
            .the("Input número 2")
            .located(By.xpath("//input[@id='numero-2']"));

    // Input element with ID 'numero-3'
    public static final Target inputNumero3 = Target
            .the("Input número 3")
            .located(By.xpath("//input[@id='numero-3']"));

    // Input element with ID 'ship-number'
    public static final Target inputInfoComplementaria = Target
            .the("Input información complementaria")
            .located(By.xpath("//input[@id='ship-number']"));

    public static final Target inputDestinatario = Target
            .the("Input destinatario")
            .located(By.xpath("//input[@id='ship-receiverName']"));

    public static final Target buttonContinuePayment = Target
            .the("Botón continuar form envio ")
            .located(By.cssSelector("button#btn-go-to-payment"));

    public static final Target buttonMethodPay = Target
            .the("Botón elegir metodo de pago ")
            .located(By.xpath("//span[contains(text(),'EFECTY')]"));

    public static final Target buttonMethodPayCre = Target
            .the("Botón elegir metodo de pago tarjeta de credito ")
            .located(By.xpath("//span[contains(text(),'Tarjeta de cr')]"));

    public static final Target buttonFinishPayment = Target
            .the("Botón continuar form envio ")
            .located(By.xpath("//button[@id='payment-data-submit']//span[contains(text(),'Comprar')]"));

}
