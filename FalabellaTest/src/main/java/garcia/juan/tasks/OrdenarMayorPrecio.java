package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static garcia.juan.ui.BusquedaPage.DESPLEGABLE_ORDERBY;
import static garcia.juan.ui.BusquedaPage.ORDENAR_PRECIO_DESCENDENTE;
import static garcia.juan.ui.MainPage.SEARCH_BAR;


public class OrdenarMayorPrecio implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Wait.until(WebElementQuestion.the(DESPLEGABLE_ORDERBY),
                                WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(DESPLEGABLE_ORDERBY),
                Click.on(DESPLEGABLE_ORDERBY),
                Wait.until(WebElementQuestion.the(ORDENAR_PRECIO_DESCENDENTE),
                                WebElementStateMatchers.isClickable()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(ORDENAR_PRECIO_DESCENDENTE)
        );
    }

    public static OrdenarMayorPrecio ordenarMayorPrecio(){
        return new OrdenarMayorPrecio();
    }
}
