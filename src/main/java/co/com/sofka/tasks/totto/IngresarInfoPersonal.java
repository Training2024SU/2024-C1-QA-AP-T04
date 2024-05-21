package co.com.sofka.tasks.totto;

import co.com.sofka.modelos.PersonaFormModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.PageComprarProduct.*;
import static co.com.sofka.ui.PageProducts.productSale;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarInfoPersonal implements Task {

    private PersonaFormModel formPersona;

    public IngresarInfoPersonal ingresoPersona(PersonaFormModel personaFormModel){
        this.formPersona = personaFormModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(inputEmail,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
            Click.on(inputEmail),
            Enter.theValue(formPersona.getEmail()).into(inputEmail),
            Click.on(buttonContinueEmail),
            WaitUntil.the(inputFirstName,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
            Click.on(inputFirstName),
            Enter.theValue(formPersona.getNombre()).into(inputFirstName),
            Enter.theValue(formPersona.getApellido()).into(inputLastName),
            Enter.theValue(formPersona.getCedula()).into(inputDocument),
            Enter.theValue(formPersona.getMovil()).into(inputPhone),
            new ScrollToTarget(termsCheck),
            Click.on(termsCheck),
            WaitUntil.the(buttonnGoToPayment,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
            Click.on(buttonnGoToPayment)

            );
    }

    public static IngresarInfoPersonal ingresarInfoPersonal(){
        return new IngresarInfoPersonal();
    }
}
