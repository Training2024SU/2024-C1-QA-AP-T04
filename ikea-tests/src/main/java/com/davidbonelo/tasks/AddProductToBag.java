package com.davidbonelo.tasks;

import com.davidbonelo.models.Product;
import com.davidbonelo.models.factories.ProductFactory;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.davidbonelo.utils.Utils.pickRandomItem;
import static com.davidbonelo.ui.ProductsListPage.RESULT_PRODUCTS;

public class AddProductToBag implements Performable {
    public static AddProductToBag any() {
        return new AddProductToBag();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades products = RESULT_PRODUCTS.resolveAllFor(actor);
        WebElementFacade productE = pickRandomItem(products);
        productE.waitUntilVisible();

        WebElementFacade addToBagBtn =
                productE.then(By.cssSelector("button[aria-label^='Agregar']")).waitUntilClickable();
        actor.attemptsTo(
                Scroll.to(productE),
                Click.on(addToBagBtn).afterWaitingUntilEnabled(),
                Scroll.to(products.get(0))
        );
        rememberProduct(actor, productE);
    }

    private <T extends Actor> void rememberProduct(T actor, WebElementFacade productE) {
        Product product = ProductFactory.fromResultElement(productE);
        List<Product> shoppingBag = actor.recall("shoppingBag");
        if (shoppingBag == null) {
            shoppingBag = new ArrayList<>();
        }
        shoppingBag.add(product);
        actor.remember("shoppingBag", shoppingBag);
    }
}
