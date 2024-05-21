package co.com.sofka.taks;

import io.cucumber.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static co.com.sofka.ui.PageEntrega.CONTINUAR_AL_PAGO;
import static co.com.sofka.ui.PageSeleccionMetodo.*;

public class SeleccionMetodo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(METODO_EFECTY),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(METODO_EFECTY),
                Wait.until(WebElementQuestion.the(CONFIRMAR_METODO),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(CONFIRMAR_METODO)


        );

    }
    public static SeleccionMetodo seleccionMetodo (){
        return new SeleccionMetodo();
    };
}
