package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.sofkau.ui.PaginaBuscador.CAMPO_BUSCAR_PRODUCTO;


public class AgregarProducto implements Task {
    String producto;

    public AgregarProducto conElProducto(String producto){
        this.producto = producto;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues(producto).into(CAMPO_BUSCAR_PRODUCTO),
                Click.on(CAMPO_BUSCAR_PRODUCTO),
                Enter.keyValues(Keys.ENTER).into(CAMPO_BUSCAR_PRODUCTO)
        );
    }
    public static AgregarProducto buscarProducto(){
        return new AgregarProducto();
    }
}

