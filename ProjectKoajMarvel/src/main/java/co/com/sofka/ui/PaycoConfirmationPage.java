package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaycoConfirmationPage extends PageObject {

    public static final Target PAYCO_CONFIRMATION_PAGE = Target.
            the("Confirmation Page").located
                    (By.xpath("//*[text() = 'Solo falta un paso']"));

    public static final Target PAYCO_CONFIRMATION_DOWNLOABLE = Target.
            the("Downloable Confirm").located
                    (By.xpath("//*[@class='resaltar btn btn-primary']"));


}
