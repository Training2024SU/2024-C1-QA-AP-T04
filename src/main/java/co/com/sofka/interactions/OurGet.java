package co.com.sofka.interactions;

import co.com.sofka.exceptions.ErrorServicesException;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;


import java.util.HashMap;
import java.util.Map;

import static co.com.sofka.utils.configurationRequest.ParamsConfig.*;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;


public class OurGet extends RestInteraction {

    private final String resource;
    private final int idResource;

  private Map<String, Object> params;


    public OurGet(String resource, int idResource) {
        this.resource = resource;
        this.idResource = idResource;

        this.params = new HashMap<>();
        this.params.put("apikey", PUBLIC_KEY);
        this.params.put("ts", TIMESTAMP);
        this.params.put("hash", HASH_API);
        this.params.put("id", idResource);
    }

    public static OurGet service(String resource, int idResource ) {
        return Tasks.instrumented(OurGet.class, resource, idResource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        rest().log().all()
                .params(params)
                .get(as(actor).resolve(resource))
                .then().log().all();
    }

}
