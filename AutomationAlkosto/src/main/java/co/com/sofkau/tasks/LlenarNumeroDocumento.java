package co.com.sofkau.tasks;

import co.com.sofkau.models.DireccionDeEnvioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofkau.ui.PaginaDireccionDeEnvio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarNumeroDocumento implements Task {
    DireccionDeEnvioModel documento = new DireccionDeEnvioModel();

    public LlenarNumeroDocumento conElDocumento(DireccionDeEnvioModel documento) {
        this.documento = documento;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_TIPO_DE_DOCUMENTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_TIPO_DE_DOCUMENTO),
                Click.on(SELECCIONAR_DOCUMENTO),
                Enter.theValue(documento.getDocumentoIdentidad()).into(CAMPO_DOCUMENTO_IDENTIDAD)

        );
    }

    public static LlenarNumeroDocumento llenarNumeroDocumento(){
        return new LlenarNumeroDocumento();
    }
}

