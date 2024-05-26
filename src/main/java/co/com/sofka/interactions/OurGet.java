package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class OurGet extends RestInteraction {

    private final String resourse;

    public OurGet(String resourse) {
        this.resourse = resourse;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().get(as(actor).resolve(resourse)).then().log().all();
    }

    public static OurGet resource(String resourse) {
        return instrumented(OurGet.class, resourse);
    }
}
