package co.com.sofka.taks;

import co.com.sofka.models.UserModelPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import java.time.Duration;

import static co.com.sofka.ui.PageConfirmacion.MENSAJE_CONFIRMACION;
import static co.com.sofka.ui.PageSeleccionMetodo.*;

public class LlenarFormularioPago implements Task {
    UserModelPago userModelPago = new UserModelPago();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(NOMBRE_FORM),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(userModelPago.getNombre()).into(NOMBRE_FORM),
                Enter.theValue(userModelPago.getApellido()).into(APELLIDO_FORM),
                Enter.theValue(userModelPago.getNumero()).into(CEDULA),
                Enter.theValue(userModelPago.getTelefono()).into(TELEFONO),
                Enter.theValue(userModelPago.getCorreo()).into(CORREO),
                Click.on(TIPO_CONTRIBUYENTE),
                Wait.until(WebElementQuestion.the(SELECCION_NO_APLICA),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(SELECCION_NO_APLICA),
                Click.on(TERMINOS),
                Click.on(REGLAMENTOS),
                Click.on(CONFIRMAR_COMPRA),
                Wait.until(WebElementQuestion.the(MENSAJE_CONFIRMACION),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(MENSAJE_CONFIRMACION)


        );
    }
        public static LlenarFormularioPago llenarFormularioPago(){
            return new LlenarFormularioPago();
        }

    }

