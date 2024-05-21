package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.sofkau.ui.PaginaPrincipalAutenticacion.BOTON_CONTINUAR_AUTENTICACION;
import static co.com.sofkau.ui.PaginaPrincipalAutenticacion.CAMPO_EMAIL;

public class LlenarAutenticacionEmailRegistrado implements Task {
    String emailRegistrado;

    public LlenarAutenticacionEmailRegistrado conElCorreoRegistrado(String emailRegistrado){
        this.emailRegistrado = emailRegistrado;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(emailRegistrado).into(CAMPO_EMAIL),
                Click.on(BOTON_CONTINUAR_AUTENTICACION)
        );
    }
    public static LlenarAutenticacionEmailRegistrado llenarAutenticacionEmailRegistrado(){
        return new LlenarAutenticacionEmailRegistrado();
    }
}
