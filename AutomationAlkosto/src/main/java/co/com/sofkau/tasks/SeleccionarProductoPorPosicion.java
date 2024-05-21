package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import static co.com.sofkau.ui.PaginaListaDeProducto.retornarProductos;


public class SeleccionarProductoPorPosicion implements Task {
    int posicionDeProducto;

    public SeleccionarProductoPorPosicion conElProductoEnPosicion(int posicionDeProducto){
        this.posicionDeProducto = posicionDeProducto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target carritoComprasDeProducto = retornarProductos(posicionDeProducto);
        actor.attemptsTo(
                Scroll.to(carritoComprasDeProducto),
                Click.on(carritoComprasDeProducto)
        );
    }
    public static SeleccionarProductoPorPosicion seleccionarProductoPorPosicion(){
        return new SeleccionarProductoPorPosicion();
    }
}
