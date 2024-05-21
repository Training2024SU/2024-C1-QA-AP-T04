package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static co.com.sofkau.ui.PaginaCarritoDeCompras.*;

public class ModificarCantidadProductoAgregado implements Task {

    int cantidadDeseadaDelProducto;

    public ModificarCantidadProductoAgregado conLaCantidad(int cantidadDeseadaDelProducto){
        this.cantidadDeseadaDelProducto = cantidadDeseadaDelProducto;
        return this;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CAMPO_CANTIDAD_PRODUCTO_AGREGADO),
                SelectFromOptions.byIndex(cantidadDeseadaDelProducto).from(CAMPO_CANTIDAD_PRODUCTO_AGREGADO)
        );

    }
    public static ModificarCantidadProductoAgregado modificarCantidadProductoAgregado(){
        return new ModificarCantidadProductoAgregado();
    }
}
