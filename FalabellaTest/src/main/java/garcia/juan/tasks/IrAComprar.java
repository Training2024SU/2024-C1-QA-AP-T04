package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static garcia.juan.ui.RegistrationPage.BOTON_IR_A_COMPRAR;

public class IrAComprar implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BOTON_IR_A_COMPRAR)
        );
    }

    public static IrAComprar irAComprar(){
        return new IrAComprar();
    }
}
