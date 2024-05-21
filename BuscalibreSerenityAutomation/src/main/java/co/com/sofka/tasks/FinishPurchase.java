package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.CartPage.FINISH_PURCHASE;

public class FinishPurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FINISH_PURCHASE)
        );
    }
    public static FinishPurchase finishPurchase(){
        return new FinishPurchase();
    }
}
