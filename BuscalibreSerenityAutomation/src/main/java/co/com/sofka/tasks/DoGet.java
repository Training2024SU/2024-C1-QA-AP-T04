package co.com.sofka.tasks;

import co.com.sofka.interactions.OurGet;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DoGet implements Task {
    private String resource;
    private int idResource;
    private String parameter;

    public DoGet withTheResource(String resource, int idResource, String parameter) {
        this.resource = resource;
        this.idResource = idResource;
        this.parameter = parameter;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurGet.resource(resource, idResource, parameter).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation()
                )
        );
    }

    public static DoGet doGet() {
        return new DoGet();
    }
}
