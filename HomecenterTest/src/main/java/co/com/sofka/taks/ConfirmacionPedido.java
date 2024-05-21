package co.com.sofka.taks;

import co.com.sofka.ui.PageCarrito;
import co.com.sofka.ui.PageConfirmacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static co.com.sofka.ui.PageConfirmacion.MENSAJE_CONFIRMACION;

public class ConfirmacionPedido implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            if (PageConfirmacion.CERRAR_ALERTA_PEDIDO.resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        Wait.until(WebElementQuestion.the(PageConfirmacion.CERRAR_ALERTA_PEDIDO),
                                WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                        Click.on(PageConfirmacion.CERRAR_ALERTA_PEDIDO)
                );


            }



        } catch (Exception e) {

        } finally {
            String confirmationText = Text.of(PageConfirmacion.MENSAJE_CONFIRMACION).toString();
            actor.remember("confirmationText", confirmationText);
            System.out.println("Texto de confirmacion capturado: " + confirmationText);
            System.out.println("Flujo de compra ejecutado");
        }
    }

    public static ConfirmacionPedido delMensaje() {
        return new ConfirmacionPedido();
    }
}
