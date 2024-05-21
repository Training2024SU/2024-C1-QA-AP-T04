package co.com.sofka.tasks;

import co.com.sofka.interactions.OurGetLists;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DoGetLists implements Task {
    private String resource;
    private String parameterValue;
    private String parameter;

    public DoGetLists withTheResource(String resource, String parameterValue, String parameter) {
        this.resource = resource;
        this.parameterValue = parameterValue;
        this.parameter = parameter;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurGetLists.resource(resource, parameterValue, parameter).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation()
                )
        );
    }
    public static DoGetLists doGetListAll() {
        return new DoGetLists();
    }
}
