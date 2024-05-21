package co.com.sofka.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.sofka.ui.PageLogin.BUSCADOR;
import static co.com.sofka.ui.PageLogin.BUSCAR;


public class BuscarProducto implements Task {
    private String producto;


    public BuscarProducto conElNombre(String producto) {
        this.producto = producto;
        return this;
    }

    public static BuscarProducto buscarProducto() {
        return new BuscarProducto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(

                Enter.theValue(producto, Keys.ENTER).into(BUSCADOR)
        );

    }


}
