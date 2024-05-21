package garcia.juan.questions;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

public class Formats implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getList("data.results.format");
    }

    public static Question<List<String>> formats() {
        return new Formats();
    }
}