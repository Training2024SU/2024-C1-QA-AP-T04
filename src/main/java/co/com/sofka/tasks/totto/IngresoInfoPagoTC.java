package co.com.sofka.tasks.totto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IngresoInfoPagoTC implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static IngresoInfoPago ingresoTCInfoPago(){
        return new IngresoInfoPago();
    }

}
