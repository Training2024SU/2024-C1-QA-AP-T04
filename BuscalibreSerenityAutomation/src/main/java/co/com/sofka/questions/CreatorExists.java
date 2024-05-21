package co.com.sofka.questions;

import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.util.List;

public class CreatorExists implements Question<Boolean> {
    private final String creatorLastName;
    public CreatorExists(String creatorLastName) {
        this.creatorLastName = creatorLastName;
    }
    public static CreatorExists withLastname(String creatorLastName) {
        return new CreatorExists(creatorLastName);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Response response = LastResponse.received().answeredBy(actor);
        List<String> creatorNames = response.jsonPath().getList("data.results.lastName");
        return creatorNames.contains(creatorLastName);
    }
}
