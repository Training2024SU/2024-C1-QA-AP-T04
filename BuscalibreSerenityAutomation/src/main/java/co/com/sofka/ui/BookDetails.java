package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static co.com.sofka.constants.ConstantsOperation.BUY_BUTTON_NAME;
import static co.com.sofka.constants.ConstantsOperation.DROPDOWN;

public class BookDetails extends PageObject {
    public static final Target BUY_BUTTON = Target
            .the(BUY_BUTTON_NAME).located(By.xpath("//button[@id='addToCart']"));
    public static final Target QUANTITY = Target
            .the(DROPDOWN).located(By.id("cantidad"));
}
