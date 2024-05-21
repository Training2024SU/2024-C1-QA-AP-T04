package com.davidbonelo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target ACCEPT_COOKIES = Target.the("Accept cookies button")
            .located(By.id("onetrust-accept-btn-handler"));
    public static final Target SIGN_IN = Target.the("Sign in button")
            .located(By.id("hnf-header-profile"));
    public  static final Target CATEGORIES = Target.the("Categories items")
            .located(By.cssSelector("#tab-products .hnf-carousel-slide:nth-child(n+3) a"));
    public  static final Target SUBCATEGORIES = Target.the("Sub categories items")
            .located(By.cssSelector("#tab-products .hnf-carousel-slide a"));
    public static final Target OPEN_CATEGORY = Target.the("See all from category button")
            .located(By.cssSelector(".hnf-dropdown__explore-category a"));
    public static final Target SEARCHBOX = Target.the("Search box")
            .located(By.id("ikea-search-input"));
    public static final Target SHOPPING_BAG = Target.the("Shopping cart button")
            .located(By.cssSelector(".hnf-header__shopping-cart-link"));
}
