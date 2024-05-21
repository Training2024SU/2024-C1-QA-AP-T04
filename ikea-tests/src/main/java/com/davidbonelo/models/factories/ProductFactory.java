package com.davidbonelo.models.factories;

import com.davidbonelo.models.Product;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductFactory {
    public static Product fromResultElement(WebElementFacade element) {
        Product product = new Product();
        product.setId(element.getAttribute("data-product-number"));
        Integer price = Integer.parseInt(element.getAttribute("data-price"));
        product.setPrice(price);
        return product;
    }

    public static Product fromBagElement(WebElementFacade element) {
        Product product = new Product();
        element.waitUntilVisible();
        product.setId(element.getAttribute("product-id"));
        return product;
    }
}
