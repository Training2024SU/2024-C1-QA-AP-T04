package com.davidbonelo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsListPage extends PageObject {
    public static Target LOGO = Target.the("Logo button")
            .located(By.cssSelector(".hnf-header__logo"));
    public static Target RESULT_PRODUCTS = Target.the("List of products")
            .located(By.cssSelector("div[data-testid='plp-product-card']"));
}
