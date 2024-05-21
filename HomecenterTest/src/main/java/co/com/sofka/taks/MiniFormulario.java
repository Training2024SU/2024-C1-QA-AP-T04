package co.com.sofka.taks;

import co.com.sofka.models.CarritoUserModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static co.com.sofka.ui.PageCarrito.*;
import static co.com.sofka.ui.PageEntrega.BTN_QUIEN_RECIBE;

public class MiniFormulario implements Task {

    CarritoUserModel carritoUserModel = new CarritoUserModel();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(SELECCIONAR_DEPARTAMENTO),
                Click.on(SELECCIONAR_DEPARTAMENTO),
                Enter.theValue(carritoUserModel.getDepartamento()).into(INPUT_DEPARTAMENTO_CIUDAD_CALLE),
                Scroll.to(SELECCIONAR_PRIMER_DEPARTAMENTO),
                Click.on(SELECCIONAR_PRIMER_DEPARTAMENTO),
                Scroll.to(SELECCIONAR_CIUDAD),
                Click.on(SELECCIONAR_CIUDAD),
                Enter.theValue(carritoUserModel.getCiudad()).into(INPUT_DEPARTAMENTO_CIUDAD_CALLE),
                Scroll.to(SELECCIONAR_PRIMER_CIUDAD),
                Click.on(SELECCIONAR_PRIMER_CIUDAD),
                Scroll.to(SELECCIONAR_CALLE),
                Click.on(SELECCIONAR_CALLE),
                Enter.theValue(carritoUserModel.getTipodecalle()).into(INPUT_DEPARTAMENTO_CIUDAD_CALLE),
                Scroll.to(SELECCIONAR_PRIMER_CALLE),
                Click.on(SELECCIONAR_PRIMER_CALLE),
                Scroll.to(ESCRIBIR_NUMERO_CALLE),
                Enter.theValue(carritoUserModel.getNumerocalle()).into(ESCRIBIR_NUMERO_CALLE),
                Scroll.to(NUMERO_DIRECCION1),
                Enter.theValue(carritoUserModel.getNumero1()).into(NUMERO_DIRECCION1),
                Enter.theValue(carritoUserModel.getNumero2()).into(NUMERO_DIRECCION2),
                Scroll.to(BTN_USA_DIRECCION),
                Wait.until(WebElementQuestion.the(BTN_USA_DIRECCION),
                        WebElementStateMatchers.isClickable()).
                        forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_USA_DIRECCION),
                Wait.until(WebElementQuestion.the(BTN_USA_DIRECCION),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_USA_DIRECCION)
        );
    }

    public static MiniFormulario miniFormulario(){
        return new MiniFormulario();
    }
}
