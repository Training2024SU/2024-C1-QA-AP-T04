package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;

import java.time.Duration;

import static garcia.juan.ui.EnvioPage.*;

public class IngresarDireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(BOTON_CONFIRMAR_DIRECCION1),
                                WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(DROPDOWN_DEPARTAMENTO),
                Click.on(DROPDOWN_DEPARTAMENTO),
                Click.on(AsignarPalabraXpath(SELECCION_DROPDOWN,"ANTIOQUIA")),
                Scroll.to(DROPDOWN_CIUDAD),
                Click.on(DROPDOWN_CIUDAD),
                Click.on(AsignarPalabraXpath(SELECCION_DROPDOWN,"RIONEGRO")),
                Scroll.to(DROPDOWN_BARRIO),
                Click.on(DROPDOWN_BARRIO),
                Click.on(AsignarPalabraXpath(SELECCION_DROPDOWN,"RIONEGRO")),
                Scroll.to(INPUT_DIRECCION),
                Enter.theValue("carrera 62b").into(INPUT_DIRECCION),
                Click.on(BOTON_CONFIRMAR_DIRECCION1),
                Wait.until(WebElementQuestion.the(BOTON_CONFIRMAR_DIRECCION1),
                                WebElementStateMatchers.isClickable()).
                                forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(BOTON_CONFIRMAR_DIRECCION1)
        );
    }

    public static IngresarDireccion ingresarDireccion(){
        return new IngresarDireccion();
    }
}
