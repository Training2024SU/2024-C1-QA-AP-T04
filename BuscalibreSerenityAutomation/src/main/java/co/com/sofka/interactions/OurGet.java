package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import java.util.HashMap;
import java.util.Map;

import static co.com.sofka.constants.ConstantsOperation.*;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class OurGet extends RestInteraction {
    private final String initialResource;
    private final int idResource;
    private final String parameter;

    private Map<String, Object> params;

    public OurGet(String initialResource, int idResource, String parameter) {
        this.initialResource = initialResource;
        this.idResource = idResource;
        this.parameter = parameter;


        this.params = new HashMap<>();
        this.params.put("apikey", PUBLIC_KEY);
        this.params.put("ts", TIMESTAMP);
        this.params.put("hash", HASH);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().pathParam(parameter, idResource)
                .params(params).get(as(actor).resolve(initialResource)).then().log().all();
    }

    public static OurGet resource(String initialResource, int idResource, String parameter) {
        return Tasks.instrumented(OurGet.class, initialResource, idResource, parameter);
    }
}
