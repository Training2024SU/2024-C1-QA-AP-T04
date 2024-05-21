package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofkau.ui.PaginaCarritoDeCompras.BOTON_IR_A_PAGAR;


public class IrAPagar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_IR_A_PAGAR),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }
    public static IrAPagar irAPagar(){
        return new IrAPagar();
    }
}
