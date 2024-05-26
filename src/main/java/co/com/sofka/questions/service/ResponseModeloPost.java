package co.com.sofka.questions.service;

import co.com.sofka.models.ModeloResponsePost;
import io.restassured.mapper.ObjectMapperType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseModeloPost implements Question<ModeloResponsePost> {

    @Override
    public ModeloResponsePost answeredBy(Actor actor) {
        return SerenityRest.lastResponse().body().as(ModeloResponsePost.class, ObjectMapperType.GSON);
    }

    public static ResponseModeloPost responseModeloPost() {
        return new ResponseModeloPost();
    }

    public static String name() {
        return SerenityRest.lastResponse().body().as(ModeloResponsePost.class, ObjectMapperType.GSON).getName();
    }
}
