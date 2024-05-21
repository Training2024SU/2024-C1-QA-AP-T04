package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static co.com.sofka.constants.ConstantsOperation.PAY_METHOD_TITLE_THE;
import static co.com.sofka.constants.ConstantsOperation.PURCHASE_SUMMARY_THE;

public class CheckoutPage extends PageObject {
    public static final Target PAY_METHOD_TITLE = Target
            .the(PAY_METHOD_TITLE_THE).located(By.xpath("//h4[text()='Selecciona Forma de Pago:']"));
    public static final Target PURCHASE_SUMMARY = Target
            .the(PURCHASE_SUMMARY_THE).located(By.xpath("//p[text()='Pago']"));
}
