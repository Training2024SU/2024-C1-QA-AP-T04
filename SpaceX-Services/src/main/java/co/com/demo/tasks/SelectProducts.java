package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.demo.interactions.AddToCart.addToCart;
import static co.com.demo.interactions.ProceedToCheckout.proceedToCheckout;
import static co.com.demo.interactions.SelectProduct.selectProduct;

public class SelectProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                selectProduct(),
                addToCart(),
                proceedToCheckout()

        );
    }

    public static SelectProducts selectProducts(){
        return new SelectProducts();
    }
}
