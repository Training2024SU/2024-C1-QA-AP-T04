package co.com.sofka.taks;

import co.com.sofka.ui.PageCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;


import java.time.Duration;

public class ConfirmarCompra implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        try {

            if (PageCarrito.BTN_CERRAR_ALERTA_CARRITO_ID.resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        Wait.until(WebElementQuestion.the(PageCarrito.BTN_CERRAR_ALERTA_CARRITO_ID),
                                WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                        Click.on(PageCarrito.BTN_CERRAR_ALERTA_CARRITO_ID)
                );
            }


            actor.attemptsTo(
                    Wait.until(WebElementQuestion.the(PageCarrito.BTN_CONTINUAR_COMO_INVITADO),
                            WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(PageCarrito.BTN_CONTINUAR_COMO_INVITADO)
            );

        } catch (Exception e) {

            System.out.println("Error en la ejecución del flujo de compra: " + e.getMessage());


            actor.attemptsTo(
                    Wait.until(WebElementQuestion.the(PageCarrito.BTN_CONTINUAR_COMO_INVITADO),
                            WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                    Click.on(PageCarrito.BTN_CONTINUAR_COMO_INVITADO)
            );
        } finally {
            System.out.println("Flujo de compra ejecutado");
        }

    }

    public static ConfirmarCompra confirmarCompra(){
        return new ConfirmarCompra();

    }
}
