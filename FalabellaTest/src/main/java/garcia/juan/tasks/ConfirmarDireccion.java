package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.time.Duration;

import static garcia.juan.ui.EnvioPage.*;
import static garcia.juan.ui.EnvioPage.BOTON_CONFIRMAR_DIRECCION1;

public class ConfirmarDireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Wait.until(WebElementQuestion.the(AVISO_DIRECCION_SIN_RECONOCER),
                                    WebElementStateMatchers.isVisible()).
                            forNoMoreThan(Duration.ofSeconds(15)),
                    Click.on(BOTON_CONFIRMAR_DIRECCION1)
            );
        }catch (Exception e){
            System.out.println("encontro la direccion");
        }

    }

    public static ConfirmarDireccion confirmarDireccion(){
        return new ConfirmarDireccion();
    }
}
