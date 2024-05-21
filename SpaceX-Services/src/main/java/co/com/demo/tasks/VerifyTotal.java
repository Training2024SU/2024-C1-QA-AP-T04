package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.demo.ui.PurchaseItemPage.TOTAL_LABEL;

public class VerifyTotal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(TOTAL_LABEL).isDisplayed()
        );
    }

    public static VerifyTotal verifyTotal(){
        return new VerifyTotal();
    }
}
