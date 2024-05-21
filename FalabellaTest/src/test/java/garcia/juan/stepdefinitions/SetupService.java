package garcia.juan.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class SetupService {

    protected final Actor actor = new Actor("Juanos");

    protected void setUpServiceGet(String urlBase){
        actor.can(CallAnApi.at(urlBase));
    }
}
