package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;


import static garcia.juan.ui.BusquedaPage.PRIMER_ITEM_BUSQUEDA;
import static garcia.juan.ui.MetodoPagoPage.BOTON_PAGO_EN_EFECTIVO;
import static garcia.juan.ui.MetodoPagoPage.BOTON_TERMINAR_PAGO;

public class SeleccionarMetodoPago implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Wait.until(WebElementQuestion.the(BOTON_PAGO_EN_EFECTIVO),
                                WebElementStateMatchers.isClickable()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(BOTON_PAGO_EN_EFECTIVO),
                Click.on(BOTON_PAGO_EN_EFECTIVO),
                Wait.until(WebElementQuestion.the(BOTON_TERMINAR_PAGO),
                                WebElementStateMatchers.isClickable()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(BOTON_TERMINAR_PAGO),
                Click.on(BOTON_TERMINAR_PAGO)
        );

    }

    public static SeleccionarMetodoPago seleccionarMetodoPago(){
        return new SeleccionarMetodoPago();
    }
}
