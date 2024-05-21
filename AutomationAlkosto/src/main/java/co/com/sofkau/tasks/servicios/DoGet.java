package co.com.sofkau.tasks.servicios;

import co.com.sofkau.interactions.servicios.OurGet;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class DoGet implements Task {

    private String resource;

    private Map<String, String> params;

    public DoGet withTheResource(String resource) {
        this.resource = resource;
        return this;
    }

    public DoGet withTheResourceAndParams(String resource, Map<String, String> params){
        this.resource = resource;
        this.params = params;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (params != null){
            actor.attemptsTo(
                    OurGet.resource(resource).with(
                            requestSpecification -> requestSpecification
                                    .params(params)
                                    .contentType(ContentType.JSON)
                                    .relaxedHTTPSValidation()
                    )
            );
        } else {
            actor.attemptsTo(
                    OurGet.resource(resource).with(
                            requestSpecification -> requestSpecification
                                    .contentType(ContentType.JSON)
                                    .relaxedHTTPSValidation()
                    )
            );
        }

    }
    public static DoGet doGet(){
        return new DoGet();
    }
}
