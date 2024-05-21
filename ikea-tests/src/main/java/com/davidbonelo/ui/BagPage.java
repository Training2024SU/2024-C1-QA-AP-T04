package com.davidbonelo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BagPage extends PageObject {
    public static Target BAG_PRODUCTS = Target.the("Products in the bag")
            .located(By.cssSelector("div[product-id]"));
    public static Target BAG_TOTAL = Target.the("Total price")
            .located(By.cssSelector("span[data-ft] span[class*='price__integer']"));
    public static Target CHECKOUT = Target.the("Checkout button")
            .located(By.cssSelector("button[data-ft='button-checkout']"));
    public static Target CONTINUE_GUEST = Target.the("Continue as guest button")
            .located(By.cssSelector("#menuSheetsModal button[class*='btn--primary']"));
}
