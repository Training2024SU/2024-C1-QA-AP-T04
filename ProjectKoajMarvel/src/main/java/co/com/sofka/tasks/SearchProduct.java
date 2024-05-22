package co.com.sofka.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Pause;


import static co.com.sofka.ui.SearchPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.joda.time.DurationFieldType.seconds;

public class SearchProduct implements Task {
    private String nameProduct;

    public SearchProduct withTheName(String nameProduct){
        this.nameProduct = nameProduct;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SEARCH_BAR),
                WaitUntil.the(SEARCH_BAR_HIDDEN, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(nameProduct, Keys.ENTER).into(SEARCH_BAR_HIDDEN),
                WaitUntil.the(SERACH_RESULT_FIRST, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SERACH_RESULT_FIRST)
        );

    }

    public static SearchProduct searchProduct() {
        return new SearchProduct();
    }
}
