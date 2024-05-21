package co.com.sofka.taks;

import co.com.sofka.ui.PageProducto;
import co.com.sofka.ui.PageSearch;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static co.com.sofka.ui.PageSearch.CELDAS_PRODUCTOS;
//import static co.com.sofka.ui.PageSearch.LISTA_PRODUCTOS;

public class AgregarAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        PageSearch pageSearch = new PageSearch();
        List<WebElementFacade> botonesProductos = CELDAS_PRODUCTOS.resolveAllFor(actor);


        int sublistSize = botonesProductos.size() / 4;
        List<WebElementFacade> elements = botonesProductos.subList(0, sublistSize);

        Random random = new Random();
        int itemIndex = random.nextInt(elements.size());

        actor.attemptsTo(
                MoveMouse.to(elements.get(itemIndex)),
                Click.on(elements.get(itemIndex)),
                Wait.until(WebElementQuestion.the(PageProducto.BTN_AGREGAR_CARRITO),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(PageProducto.BTN_AGREGAR_CARRITO),
                Wait.until(WebElementQuestion.the(PageProducto.MENSAJE_AGREGADO),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(PageProducto.CERRAR_ALERTA)


        );


    }

    public static AgregarAlCarrito agregarAlCarrito() {
        return new AgregarAlCarrito();


    }
}
