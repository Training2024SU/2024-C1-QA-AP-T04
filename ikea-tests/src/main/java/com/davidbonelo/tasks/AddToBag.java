package com.davidbonelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.davidbonelo.tasks.NavigateToHomePage.navigateToHomePage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToBag implements Task {

    private final int quantity;

    public AddToBag(int quantity) {
        this.quantity = quantity;
    }

    public static AddToBag products(Integer quantity) {
        return instrumented(AddToBag.class, quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < quantity; i++) {
            actor.attemptsTo(
                    SelectMainCategory.any(),
                    SelectSubCategory.any(),
                    AddProductToBag.any(),
                    navigateToHomePage()
            );
        }
    }
}
