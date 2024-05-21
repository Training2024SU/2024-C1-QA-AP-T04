package co.com.sofka.tasks.totto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.interactions.ButtonPressSeveralTimes.pressButton;

import static co.com.sofka.ui.PageComprarProduct.inputEmail;
import static co.com.sofka.ui.PageComprarProduct.inputFirstName;
import static co.com.sofka.ui.PageProducts.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarProductosCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    WaitUntil.the(productSale,isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                    new ScrollToTarget(productSale),
                    Click.on(productSale),
                    WaitUntil.the(colorProduct,isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                    Click.on(colorProduct),
                pressButton().setButton(4,incrementProductButton),
                    new ScrollToTarget(addToCartButton),
                    Click.on(addToCartButton),
                    WaitUntil.the(goToCart,isClickable()).forNoMoreThan(Duration.ofSeconds(20)),
                    Click.on(goToCart),
                     WaitUntil.the(continueCompraButton,isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                    new ScrollToTarget(continueCompraButton),
                    Click.on(continueCompraButton)
//                    Click.on(inputEmail),
//                    Enter.theValue("emailprueba@gmail.com").into(inputEmail),
//                    WaitUntil.the(inputEmail,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
//                    Click.on(inputFirstName)
                );
    }

    public static AgregarProductosCarrito agregarProductosCarrito(){
        return new AgregarProductosCarrito();
    }
}
