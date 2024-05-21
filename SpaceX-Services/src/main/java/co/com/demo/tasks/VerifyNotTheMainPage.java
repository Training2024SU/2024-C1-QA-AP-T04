package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.demo.ui.ViewingRocketsPage.HEADER_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerifyNotTheMainPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(HEADER_TITLE).isNotDisplayed()
        );
    }

    public static VerifyNotTheMainPage isNotTheMainPage() {
        return instrumented(VerifyNotTheMainPage.class);
    }
}
