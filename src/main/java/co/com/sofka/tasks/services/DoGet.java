package co.com.sofka.tasks.services;

import co.com.sofka.interactions.OurGet;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.model.util.EnvironmentVariables;

public class DoGet implements Task {
    private String resource;
    private int idResource;
    private EnvironmentVariables environmentVariables;

    public DoGet withTheResource(String resource, int idResource) {
        this.resource = resource;
        this.idResource = idResource;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurGet.service(resource, idResource).with(
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
