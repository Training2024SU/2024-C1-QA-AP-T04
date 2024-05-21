package co.com.sofka.questions;

import co.com.sofka.modelos.CharacterModel;
import co.com.sofka.modelos.ComicModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.json.simple.JSONObject;

import static co.com.sofka.utils.jsonparser.JsonCommon.*;

public class ComicGetResponse implements Question<ComicModel> {
    @Override
    public ComicModel answeredBy(Actor actor) {
        // JSONObject de la libreria json.simple con la informacion del personaje
        JSONObject comicObject = jsonToObject(SerenityRest.lastResponse().getBody().asString());
        return toComic(comicObject);
    }

    public static Question<ComicModel> expected(){
        return new ComicGetResponse();
    }
}
