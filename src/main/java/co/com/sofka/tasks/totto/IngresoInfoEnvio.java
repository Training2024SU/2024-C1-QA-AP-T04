package co.com.sofka.tasks.totto;

import co.com.sofka.modelos.PersonaFormModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.time.Duration;

import static co.com.sofka.ui.PageComprarProduct.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IngresoInfoEnvio  implements Task {

    private PersonaFormModel formPersona;

    public IngresoInfoEnvio ingresoPersona(PersonaFormModel personaFormModel){
        this.formPersona = personaFormModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(selectDepartamento,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                SelectFromOptions.byVisibleText(formPersona.getDepartamento()).from(selectDepartamento),
                SelectFromOptions.byVisibleText(formPersona.getCiudad()).from(selectCiudad),
                WaitUntil.the(selectTipoVia,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                new ScrollToTarget(selectTipoVia),
                SelectFromOptions.byVisibleText(formPersona.getTipoVia()).from(selectTipoVia),
                WaitUntil.the(inputNumero3,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(formPersona.getNumeroDireccion().get(0)).into(inputNumero1),
                Enter.theValue(formPersona.getNumeroDireccion().get(1)).into(inputNumero2),
                Enter.theValue(formPersona.getNumeroDireccion().get(2)).into(inputNumero3),
                Enter.theValue(formPersona.getNombre()+" "
                                +formPersona.getApellido()+" "
                                +formPersona.getEmail()
                ).into(inputInfoComplementaria),
                new ScrollToTarget(inputDestinatario),
                Enter.theValue(formPersona.getNombre()).into(inputDestinatario),
                Click.on(buttonContinuePayment)
                );
    }

    public static IngresoInfoEnvio ingresoInfoEnvio(){
        return new IngresoInfoEnvio();
    }
}
