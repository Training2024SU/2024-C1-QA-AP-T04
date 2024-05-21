package garcia.juan.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

import static garcia.juan.ui.BusquedaPage.PRIMER_ITEM_BUSQUEDA;
import static garcia.juan.ui.MainPage.SEARCH_BAR;

public class SeleccionarPrimero implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Wait.until(WebElementQuestion.the(PRIMER_ITEM_BUSQUEDA),
                                WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(PRIMER_ITEM_BUSQUEDA),
                Wait.until(WebElementQuestion.the(PRIMER_ITEM_BUSQUEDA),
                                WebElementStateMatchers.isClickable()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(PRIMER_ITEM_BUSQUEDA)
        );
    }

    public static SeleccionarPrimero seleccionarPrimero(){
        return new SeleccionarPrimero();
    }
}
