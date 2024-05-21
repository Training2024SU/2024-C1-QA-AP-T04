package garcia.juan.tasks;

import garcia.juan.models.PersonaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static garcia.juan.ui.RegistrationPage.*;

public class RegistrarPersona implements Task {

    PersonaModel persona = new PersonaModel();

    public RegistrarPersona conLaPersona(PersonaModel persona) {
        this.persona=persona;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(persona.getNombre()).into(INPUT_NOMBRE_PERSONA),
                Scroll.to(INPUT_APELLIDOS_PERSONA),
                Enter.theValue(persona.getApellidos()).into(INPUT_APELLIDOS_PERSONA),
                Scroll.to(LIST_TIPO_DOCUMENTO),
                Click.on(LIST_TIPO_DOCUMENTO),
                Click.on(BOTON_CEDULA),
                Scroll.to(INPUT_DOCUMENTO_PERSONA),
                Enter.theValue(persona.getNumeroDoc()).into(INPUT_DOCUMENTO_PERSONA),
                Scroll.to(INPUT_TELEFONO_PERSONA),
                Enter.theValue(persona.getNumeroCel()).into(INPUT_TELEFONO_PERSONA),
                Scroll.to(INPUT_EMAIL_PERSONA),
                Enter.theValue(persona.getEmail()).into(INPUT_EMAIL_PERSONA),
                Scroll.to(INPUT_CONTRASENA_PERSONA),
                Enter.theValue(persona.getContrasena()).into(INPUT_CONTRASENA_PERSONA),
                Scroll.to(BOTON_ACEPTAR_TERMINOS),
                Click.on(BOTON_ACEPTAR_TERMINOS),
                Scroll.to(BOTON_REGISTRAR),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static RegistrarPersona registrarPersona(){
        return new RegistrarPersona();
    }
}
