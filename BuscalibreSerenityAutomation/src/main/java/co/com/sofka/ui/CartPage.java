package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.sofka.constants.ConstantsOperation.FINISH_PURCHASE_BUTTON;

public class CartPage extends PageObject {
    public static final Target FINISH_PURCHASE = Target
            .the(FINISH_PURCHASE_BUTTON).located(By.xpath("//a[text()='Finalizar compra']"));
}
