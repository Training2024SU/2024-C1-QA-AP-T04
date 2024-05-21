package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import static garcia.juan.ui.EnvioPage.*;

public class AceptarAlertaDespachos implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        try{
            t.attemptsTo(
                    Wait.until(WebElementQuestion.the(ALERTA_DESPACHOS),
                                    WebElementStateMatchers.isVisible()).
                            forNoMoreThan(Duration.ofSeconds(12)),
                    Switch.toFrame((WebElement) ALERTA_DESPACHOS_frame),
                    Scroll.to(BOTON_ACEPTAR_ALERTA_DESPACHOS),
//                    Wait.until(WebElementQuestion.the(BOTON_ACEPTAR_ALERTA_DESPACHOS),
//                                    WebElementStateMatchers.isClickable()).
//                            forNoMoreThan(Duration.ofSeconds(120)),
                    Click.on(BOTON_ACEPTAR_ALERTA_DESPACHOS)
            );
        }
        catch (Exception e){
            System.out.println("No tiene alerta para despachos");
        }
    }

    public static AceptarAlertaDespachos aceptarAlertaDespachos(){
        return new AceptarAlertaDespachos();
    }
}
