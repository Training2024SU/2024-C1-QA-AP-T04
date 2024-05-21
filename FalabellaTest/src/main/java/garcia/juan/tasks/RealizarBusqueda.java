package garcia.juan.tasks;

import garcia.juan.ui.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static garcia.juan.ui.MainPage.SEARCH_BAR;

public class RealizarBusqueda implements Task {

    String producto;

public RealizarBusqueda elProducto(String producto){
this.producto = producto;
return this;
}

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Wait.until(WebElementQuestion.the(SEARCH_BAR),
                        WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(SEARCH_BAR),
                Enter.theValue(producto, Keys.ENTER).into(SEARCH_BAR)
        );
    }

    public static RealizarBusqueda realizarBusqueda(){
        return new RealizarBusqueda();
    }
}
