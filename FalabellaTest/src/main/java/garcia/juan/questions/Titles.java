package garcia.juan.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Titles implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getList("data.results.title");
    }

    public static Question<List<String>> titles() {
        return new Titles();
    }
}