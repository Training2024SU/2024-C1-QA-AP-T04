package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.demo.ui.PurchaseItemPage.STARSHIP_T_SHIRT_LINK;

public class SelectProduct implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(STARSHIP_T_SHIRT_LINK)
        );
    }
    public static SelectProduct selectProduct() {
        return new SelectProduct();
    }
}
