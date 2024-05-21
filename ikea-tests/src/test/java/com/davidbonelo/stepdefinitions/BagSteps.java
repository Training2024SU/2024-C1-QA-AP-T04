package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.Product;
import com.davidbonelo.questions.BagProducts;
import com.davidbonelo.questions.BagTotal;
import com.davidbonelo.questions.CheckBag;
import com.davidbonelo.tasks.AddToBag;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;

import java.util.List;

import static com.davidbonelo.tasks.NavigateToBag.navigateToBag;
import static com.davidbonelo.tasks.OpenHomePage.openHomePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class BagSteps {
    @Given("{actor} has an empty shopping bag")
    public void davidHasAnEmptyShoppingBag(Actor actor) {
        actor.wasAbleTo(openHomePage());
    }

    @When("{actor} adds {int} products to his shopping bag")
    public void heAddsQuantityProductSToHisShoppingBag(Actor actor, Integer quantity) {
        actor.wasAbleTo(
                // TODO: Filter available online items only
                AddToBag.products(quantity)
        );
    }

    @Then("{actor} should see all the products in his bag")
    public void heShouldSeeAllTheProductsInHisBag(Actor actor) {
        actor.attemptsTo(navigateToBag());
        List<Product> products = BagProducts.list().answeredBy(actor);
        actor.should(seeThat(CheckBag.containsItems(products)));
    }

    @And("{actor} should see the total price for all the products")
    public void heShouldSeeTheTotalPriceForAllTheProducts(Actor actor) {
//        List<Product> products = BagProducts.list().answeredBy(actor);
        List<Product> products = actor.recall("shoppingBag");
        Integer totalPrice = products.stream().mapToInt(Product::getPrice).sum();
        System.err.println(totalPrice);
        actor.should(seeThat(BagTotal.price(), equalTo(totalPrice)));
    }
}
