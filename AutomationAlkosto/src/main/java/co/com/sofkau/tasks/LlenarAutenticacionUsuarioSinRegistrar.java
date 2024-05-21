package co.com.sofkau.tasks;

import co.com.sofkau.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.sofkau.ui.PaginaPrincipalAutenticacion.BOTON_CONTINUAR_AUTENTICACION;
import static co.com.sofkau.ui.PaginaPrincipalAutenticacion.CAMPO_EMAIL;

public class LlenarAutenticacionUsuarioSinRegistrar implements Task {
    UsuarioModel usuario = new UsuarioModel();

    public LlenarAutenticacionUsuarioSinRegistrar conElCorreo(UsuarioModel usuario) {
        this.usuario = usuario;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getEmail()).into(CAMPO_EMAIL),
                Click.on(BOTON_CONTINUAR_AUTENTICACION)
        );
    }
    public static LlenarAutenticacionUsuarioSinRegistrar llenarAutenticacion(){
        return new LlenarAutenticacionUsuarioSinRegistrar();
    }
}
