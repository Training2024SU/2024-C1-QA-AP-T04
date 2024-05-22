package osorio.alvarez.devon.tasks.compraproducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static osorio.alvarez.devon.ui.PageCompraProducto.BUTTON_MY_ACCOUNT;

public class NavegarARegistro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MY_ACCOUNT)
        );
    }

    public static NavegarARegistro navegarARegistro(){
        return new NavegarARegistro();
    }
}
