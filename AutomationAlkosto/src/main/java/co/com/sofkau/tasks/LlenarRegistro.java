package co.com.sofkau.tasks;

import co.com.sofkau.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofkau.ui.PaginaConfirmacion.MENSAJE_CONFIRMACION_INICIO_SESION;
import static co.com.sofkau.ui.PaginaRegistro.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarRegistro implements Task {

    UsuarioModel usuario = new UsuarioModel();

    public LlenarRegistro conElUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getNombre()).into(CAMPO_NOMBRES),
                Enter.theValue(usuario.getApellido()).into(CAMPO_APELLIDOS),
                Scroll.to(CAMPO_CELULAR),
                Enter.theValue(usuario.getCelular()).into(CAMPO_CELULAR),
                Click.on(SELECCION_TERMINOS_CONDICIONES),
                Click.on(BOTON_CONTINUAR_REGISTRO),
                WaitUntil.the(MENSAJE_CONFIRMACION_INICIO_SESION, isVisible()).forNoMoreThan(10).seconds()
        );
    }
    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();
    }
}
