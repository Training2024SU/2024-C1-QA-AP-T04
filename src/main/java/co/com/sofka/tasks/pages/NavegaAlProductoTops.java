package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PageMonky.SECCION_TOPS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class NavegaAlProductoTops implements Task {

    private String seccionTops;

    public NavegaAlProductoTops(String seccionTops) {
        this.seccionTops = seccionTops;
    }

    public static NavegaAlProductoTops aLaSeccionTops(String seccionTops) {
        return instrumented(NavegaAlProductoTops.class, seccionTops);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SECCION_TOPS)

        );
    }
}
