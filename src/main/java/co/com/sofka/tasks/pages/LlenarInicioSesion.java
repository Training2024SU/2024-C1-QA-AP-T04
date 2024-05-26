package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.ui.PageLogin.*;

public class LlenarInicioSesion implements Task {
    String email;
    String password;

    public LlenarInicioSesion conEmail(String email){
        this.email = email;
        return this;
    }

    public LlenarInicioSesion yPassword(String password){
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_EMAIL),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static LlenarInicioSesion llenarInicioSesion(){
        return new LlenarInicioSesion();
    }
}
