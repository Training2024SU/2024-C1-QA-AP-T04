package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofkau.ui.PaginaLogin.BOTON_LOGIN_MAIL_Y_CONTRASENA;


public class NavegarALogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_LOGIN_MAIL_Y_CONTRASENA),
                Click.on(BOTON_LOGIN_MAIL_Y_CONTRASENA)
        );
    }
    public static NavegarALogin navegarALogin(){
        return new NavegarALogin();
    }
}
