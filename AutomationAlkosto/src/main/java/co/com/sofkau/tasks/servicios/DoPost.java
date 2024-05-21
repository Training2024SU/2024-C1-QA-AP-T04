package co.com.sofkau.tasks.servicios;

import co.com.sofkau.interactions.servicios.OurPost;
import co.com.sofkau.models.servicios.PostModel;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DoPost implements Task {
    private String resource;
    private PostModel body;

    public DoPost withTheResource(String resource) {
        this.resource = resource;
        return this;
    }
    public DoPost andTheBody(PostModel body) {
        this.body = body;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OurPost.resource(resource).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON).body("")
                                .relaxedHTTPSValidation()
                                .body(body)
                )
        );
    }
    public static DoPost doPost(){
        return new DoPost();
    }
}
