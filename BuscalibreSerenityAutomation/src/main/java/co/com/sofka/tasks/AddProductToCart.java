package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.ui.BookDetails.BUY_BUTTON;
import static co.com.sofka.ui.BookDetails.QUANTITY;

public class AddProductToCart implements Task {
    int quantity;

    public AddProductToCart withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byIndex(quantity).from(QUANTITY),
                Click.on(BUY_BUTTON)
        );
    }

    public static AddProductToCart addProductToCart() {
        return new AddProductToCart();
    }
}
