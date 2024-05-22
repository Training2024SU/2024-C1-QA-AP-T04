package osorio.alvarez.devon.tasks.compraproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static osorio.alvarez.devon.ui.PageCompraProducto.*;

public class LlenarRegistro implements Task {
    String nombre;
    String apellido;
    String correo;
    String telefono;

    public LlenarRegistro conElNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public LlenarRegistro conElApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public LlenarRegistro conElcorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public LlenarRegistro yConEltelefono(String telefono) {
        this.telefono =telefono;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_EMAIL_REGISTER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_EMAIL_REGISTER),
                Enter.theValue(correo).into(CAMPO_EMAIL_REGISTER),
                Click.on(BOTON_CONTINUAR_REGISTRO),
                Enter.theValue(nombre).into(CAMPO_NOMBRE_REGISTRO),
                Enter.theValue(apellido).into(CAMPO_APELLIDO_REGISTRO),
                Enter.theValue(telefono).into(CAMPO_TELEFONO_REGISTRO),
                Scroll.to(CAMPO_NOMBRE_REGISTRO),
                Click.on(CHECK_TERMINOS),
                Click.on(BOTON_CONTINUAR_FIN_REGISTRO)
        );
    }

    public static LlenarRegistro llenarRegistro(){
        return new LlenarRegistro();
    }
}
