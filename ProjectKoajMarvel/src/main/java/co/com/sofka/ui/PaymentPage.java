package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {

    public static final Target CHECK_BOX_TERMS_PAYMENT = Target.
            the("Check box terms and conditions for payment").located
                    (By.xpath("//*[@type='checkbox']"));

    public static Target PAYCO_OPTION = Target.
            the("Payco payment option").located
                    (By.xpath("(//*[@data-pay_option='efecty'])"));

    public static final Target GENERATE_PAYMENT_NUMBER = Target.
            the("Check box terms and conditions for payment").located
                    (By.xpath("(//*[@class='btn btn-primary'])[1]"));

    public static final Target WARNING_ALERT = Target.
            the("Payment Warning term").located
                    (By.xpath("(//*[@class='paymethod-warnings'])"));



}
