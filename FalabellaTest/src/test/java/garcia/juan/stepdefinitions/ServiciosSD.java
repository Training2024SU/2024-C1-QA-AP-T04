package garcia.juan.stepdefinitions;

import garcia.juan.interactions.OurGet;
import garcia.juan.questions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import static garcia.juan.questions.ObtenerRespuesta.obtenerRespuesta;
import static garcia.juan.stepdefinitions.ConstantesAPI.*;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class ServiciosSD extends SetupService {

    @Given("el usuario accede al servicio de busqueda de marvel")
    public void el_usuario_accede_al_servicio_de_busqueda_de_marvel() {
        setUpServiceGet(URL_BASE);
    }
    @When("hace una peticion de tipo get con el id de heroe {int}")
    public void hace_una_peticion_de_tipo_get_con_el_id_de_heroe(Integer int1) {
        actor.attemptsTo(
                OurGet.resource(GET_COMICS_OF_HEROID).with(request ->
                        request.queryParam("ts",1)
                                .queryParam("apikey", PUBLIC_KEY)
                                .queryParam("hash", HASH)
                                .pathParam("id", int1)
                )
        );
    }
    @Then("deberia obtener un codigo de respuesta {int}")
    public void deberia_obtener_un_codigo_de_respuesta(Integer codigo) {
        actor.should(
                seeThat("Status code", ResponseCode.was(), equalTo(codigo))
        );
    }

    @Then("deberia obtener objetos json con su formato de tipo {string}")
    public void deberia_obtener_objetos_json_con_su_formato_de_tipo(String string1) {
//        String respuesta = new String(LastResponse.received().answeredBy(actor).asByteArray(),
//                StandardCharsets.UTF_8);
//        JSONObject jsonObject = new JSONObject(respuesta);
//        JSONObject jsonData = jsonObject.getJSONObject("data"); // Obtener el objeto JSON
//        JSONArray jsonResults = jsonData.getJSONArray("results");
//        JSONObject primerResultado = jsonResults.getJSONObject(0);
//        System.out.println("***********************");
//        System.out.println(primerResultado.getString("format"));
//        System.out.println("************************");
        actor.should(
                seeThat("Formato:",
                        ObtenerCuerpoRespuesta.
                                obtenerCuerpoRespuesta().
                                delObjeto(0).
                                obtenerElCampo("format"),equalTo(string1)
                )
        );
    }
}
