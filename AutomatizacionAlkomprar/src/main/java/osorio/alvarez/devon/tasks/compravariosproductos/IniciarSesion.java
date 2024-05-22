package osorio.alvarez.devon.tasks.compravariosproductos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static osorio.alvarez.devon.ui.PageCompraProducto.BOTON_CONTINUAR_REGISTRO;
import static osorio.alvarez.devon.ui.PageCompraProducto.CAMPO_EMAIL_REGISTER;
import static osorio.alvarez.devon.ui.PageCompraVariosProductos.*;

public class IniciarSesion implements Task {
    String correo;
    String password;

    public IniciarSesion conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public IniciarSesion yPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_EMAIL_REGISTER),
                Enter.theValue(correo).into(CAMPO_EMAIL_REGISTER),
                Click.on(BOTON_CONTINUAR_REGISTRO),
                Click.on(OPTION_MAIL_PASSWORD),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
