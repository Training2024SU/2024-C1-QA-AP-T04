package co.com.sofka.taks;

import co.com.sofka.ui.PageCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static co.com.sofka.ui.PageEntrega.*;

public class LlenarDatosEntrega implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BTN_QUIEN_RECIBE_X),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_QUIEN_RECIBE_X),
                Wait.until(WebElementQuestion.the(BTN_DEJAR_PORTERIA),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_DEJAR_PORTERIA),
                Wait.until(WebElementQuestion.the(BTN_GUARDARYSALIR),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_GUARDARYSALIR),
                Wait.until(WebElementQuestion.the(CONTINUAR_AL_PAGO),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(CONTINUAR_AL_PAGO)

        );

    }

    public static LlenarDatosEntrega llenarDatosEntrega(){
        return new LlenarDatosEntrega();
    }
}
