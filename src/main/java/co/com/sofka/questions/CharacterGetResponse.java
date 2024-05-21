package co.com.sofka.questions;

import co.com.sofka.modelos.CharacterModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.json.simple.JSONObject;

import static co.com.sofka.utils.jsonparser.JsonCommon.jsonToObject;
import static co.com.sofka.utils.jsonparser.JsonCommon.toCharacter;

public class CharacterGetResponse implements Question<CharacterModel> {


    @Override
    public CharacterModel answeredBy(Actor actor) {
        // JSONObject de la libreria json.simple con la informacion del personaje
        JSONObject characterObject = jsonToObject(SerenityRest.lastResponse().getBody().asString());
        return toCharacter(characterObject);
    }

    public static Question<CharacterModel> expected(){
        return new CharacterGetResponse();
    }


}
