package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static garcia.juan.ui.EnvioPage.BOTON_IR_A_PAGAR;


public class NavegarAPagar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BOTON_IR_A_PAGAR),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }

    public static NavegarAPagar navegarAPagar(){
        return new NavegarAPagar();
    }
}
