package garcia.juan.questions;

import com.google.gson.JsonObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;

public class ObtenerRespuesta implements Question <String> {

    String campo;

    public ObtenerRespuesta delCampo(String campo){
        this.campo=campo;
        return this;
    }

    @Override
    public String answeredBy(Actor actor) {
        String respuesta = new String(LastResponse.received().answeredBy(actor).asByteArray(),
                StandardCharsets.UTF_8);
        JSONObject jsonObject = new JSONObject(respuesta);
        return (String) jsonObject.get(campo);
    }

    public static ObtenerRespuesta obtenerRespuesta(){
        return new ObtenerRespuesta();
    }
}
