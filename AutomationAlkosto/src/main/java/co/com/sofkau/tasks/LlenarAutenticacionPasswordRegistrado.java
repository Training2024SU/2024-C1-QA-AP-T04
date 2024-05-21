package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.sofkau.ui.PaginaLogin.*;

public class LlenarAutenticacionPasswordRegistrado implements Task {
    String passwordRegistrado;

    public LlenarAutenticacionPasswordRegistrado conElPasswordRegistrado(String passwordRegistrado){
        this.passwordRegistrado = passwordRegistrado;
        return this;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(passwordRegistrado).into(CAMPO_PASSWORD),
                Click.on(BOTON_CONTINUAR_LOGIN)
        );
    }
    public static LlenarAutenticacionPasswordRegistrado llenarAutenticacionPasswordRegistrado(){
        return new LlenarAutenticacionPasswordRegistrado();
    }
}
