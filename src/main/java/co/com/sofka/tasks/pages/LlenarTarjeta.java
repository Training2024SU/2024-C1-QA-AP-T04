package co.com.sofka.tasks.pages;

import co.com.sofka.models.FormularioTarjeta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.time.Duration;

import static co.com.sofka.ui.PageTarjeta.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarTarjeta implements Task {
    FormularioTarjeta formularioTarjeta;

    public LlenarTarjeta conLaTarjeta(FormularioTarjeta formularioTarjeta) {
        this.formularioTarjeta = formularioTarjeta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame(0),
                WaitUntil.the(MES_DE_VENCIMIENTO, isPresent()).forNoMoreThan(15).seconds(),
                Enter.theValue(formularioTarjeta.getNumeroDeTarjeta()).into(CAMPO_NUMERO_TARJETA),
                Enter.theValue(formularioTarjeta.getNombreEnTarjeta()).into(CAMPO_NOMBRE_EN_TARJETA),
                Click.on(MES_DE_VENCIMIENTO),
                WaitUntil.the(SELECCION_MES_DE_VENCIMIENTO, isPresent()).forNoMoreThan(15).seconds(),
                Click.on(SELECCION_MES_DE_VENCIMIENTO),
                Click.on(ANNO_DE_VENCIMIENTO),
                Click.on(SELECCION_ANNO_DE_VENCIMIENTO),
                Enter.theValue(formularioTarjeta.getCodigoDeSeguridad()).into(CODIGO_SEGURIDAD),
                Click.on(GUARDAR_FUTURAS_COMPRAS),
                Click.on(ANADIR_TARJETA)
        );
    }

    public static LlenarTarjeta llenarTarjeta() {
        return new LlenarTarjeta();
    }
}
