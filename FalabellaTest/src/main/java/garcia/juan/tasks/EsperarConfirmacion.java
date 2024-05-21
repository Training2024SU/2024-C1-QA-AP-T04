package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.time.Duration;

import static garcia.juan.ui.EnvioPage.*;
import static garcia.juan.ui.EnvioPage.BOTON_CONFIRMAR_DIRECCION1;
import static garcia.juan.ui.MetodoPagoPage.BOTON_TERMINAR_PAGO;

public class EsperarConfirmacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BOTON_TERMINAR_PAGO),
                                WebElementStateMatchers.isNotCurrentlyVisible()).
                        forNoMoreThan(Duration.ofSeconds(15))
        );
    }

    public static EsperarConfirmacion esperarConfirmacion(){
        return new EsperarConfirmacion();
    }
}
