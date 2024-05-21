package com.davidbonelo.questions;

import com.davidbonelo.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.HashSet;
import java.util.List;

public class CheckBag implements Question<Boolean> {
    private final List<Product> products;

    public CheckBag(List<Product> products) {
        this.products = products;
    }

    public static CheckBag containsItems(List<Product> products) {
        return new CheckBag(products);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<Product> rememberedProducts = actor.recall("shoppingBag");
        return new HashSet<>(rememberedProducts).containsAll(products);
    }
}
