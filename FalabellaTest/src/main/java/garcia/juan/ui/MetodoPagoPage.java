package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MetodoPagoPage extends PageObject {

    public static final Target BOTON_PAGO_EN_EFECTIVO = Target.
            the("Boton pago en efectivo").
            located(By.xpath("//*[@data-testid='testId-paymentOption-PAY_AT_AGENCY']"));



    public static final Target BOTON_TERMINAR_PAGO= Target.the("Boton pago terminar pago").
            located(By.xpath("//button[@class='chakra-button css-lwxwlj']"));
}
