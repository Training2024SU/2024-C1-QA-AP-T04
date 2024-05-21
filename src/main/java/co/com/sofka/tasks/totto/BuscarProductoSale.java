package co.com.sofka.tasks.totto;

import co.com.sofka.ui.PageProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.PageHome.buttonCloseBanner;
import static co.com.sofka.ui.PageHome.buttonSale;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class BuscarProductoSale implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(buttonCloseBanner, isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(buttonCloseBanner),
                Click.on(buttonSale)

        );
    }

    private void cantidadProducto(int cant, Target button){
        for (int i = 0; i < cant; i++) {
            Click.on(button);
        }
    }

    public static BuscarProductoSale buscarProductoSale(){
        return new BuscarProductoSale();
    }
}
