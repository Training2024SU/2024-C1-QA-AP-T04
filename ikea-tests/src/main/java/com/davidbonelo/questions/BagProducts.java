package com.davidbonelo.questions;

import com.davidbonelo.models.Product;
import com.davidbonelo.models.factories.ProductFactory;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.davidbonelo.ui.BagPage.BAG_PRODUCTS;

public class BagProducts implements Question<List<Product>> {
    public static BagProducts list() {
        return new BagProducts();
    }

    @Override
    public List<Product> answeredBy(Actor actor) {
        ListOfWebElementFacades bagProductsE = BAG_PRODUCTS.resolveAllFor(actor);
        return bagProductsE.map(ProductFactory::fromBagElement);
    }
}
