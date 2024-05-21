package co.com.sofka.taks.services;

import co.com.sofka.interactions.OurPost;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DoPost implements Task {
    private String resource;
    private Object body;

    public DoPost withTheResource(String resource){
        this.resource = resource;
        return this;
    }

    public DoPost andTheBody (Object body){
        this.body = body;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurPost.resource(resource).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation()
                                .body(body)
                )
        );

    }

    public static DoPost doPost(){
        return new DoPost();
    }
}
