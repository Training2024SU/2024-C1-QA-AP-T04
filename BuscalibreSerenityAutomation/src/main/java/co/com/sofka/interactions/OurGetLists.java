package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import java.util.HashMap;
import java.util.Map;

import static co.com.sofka.constants.ConstantsOperation.*;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class OurGetLists extends RestInteraction {
    private final String initialResource;
    private final String parameterValue;
    private final String parameter;

    private Map<String, Object> params;

    public OurGetLists(String initialResource, String parameterValue, String parameter) {
        this.initialResource = initialResource;
        this.parameterValue = parameterValue;
        this.parameter = parameter;

        this.params = new HashMap<>();
        this.params.put(parameter, parameterValue);
        this.params.put("apikey", PUBLIC_KEY);
        this.params.put("ts", TIMESTAMP);
        this.params.put("hash", HASH);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().params(params).get(as(actor).resolve(initialResource)).then().log().all();
    }
    public static OurGetLists resource(String resource, String parameterValue, String parameter) {
        return Tasks.instrumented(OurGetLists.class, resource, parameterValue, parameter);
    }
}
