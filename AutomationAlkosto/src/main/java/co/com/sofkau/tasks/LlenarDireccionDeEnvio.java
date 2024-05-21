package co.com.sofkau.tasks;

import co.com.sofkau.models.DireccionDeEnvioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaDireccionDeEnvio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarDireccionDeEnvio implements Task {
    DireccionDeEnvioModel direccion = new DireccionDeEnvioModel();


    public LlenarDireccionDeEnvio conLaDireccion(DireccionDeEnvioModel direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_LISTA_DEPARTAMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_LISTA_DEPARTAMENTO),
                WaitUntil.the(SELECCIONAR_DEPARTAMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_DEPARTAMENTO),
                Scroll.to(CAMPO_DIRECCION),
                WaitUntil.the(CAMPO_DIRECCION, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(direccion.getDireccion()).into(CAMPO_DIRECCION),
                Enter.theValue(direccion.getBarrio()).into(CAMPO_BARRIO),
                WaitUntil.the(BOTON_CONTINUAR_DIRECCION_ENVIO, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CONTINUAR_DIRECCION_ENVIO),
                Click.on(BOTON_CONTINUAR_DIRECCION_ENVIO)
                );
    }
    public static LlenarDireccionDeEnvio llenarDireccionDeEnvio(){
        return new LlenarDireccionDeEnvio();
    }
}
