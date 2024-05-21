package co.com.demo.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class DoPost implements Task {

    private String resource;
    private String body;

    public DoPost withResource(String resource) {
        this.resource = resource;
        return this;
    }

    public DoPost withBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(resource)
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation()
                                .body(body)
                        )
        );
    }

    public static DoPost post() {
        return new DoPost();
    }
}
