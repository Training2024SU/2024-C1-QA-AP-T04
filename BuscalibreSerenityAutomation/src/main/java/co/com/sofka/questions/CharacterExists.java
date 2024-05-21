package co.com.sofka.questions;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.util.List;

public class CharacterExists implements Question<Boolean> {
    private final String characterName;

    public CharacterExists(String characterName) {
        this.characterName = characterName;
    }

    public static CharacterExists named(String characterName) {
        return new CharacterExists(characterName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Response response = LastResponse.received().answeredBy(actor);
        List<String> characterNames = response.jsonPath().getList("data.results.name");
        return characterNames.contains(characterName);
    }
}
