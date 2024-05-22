package osorio.alvarez.devon.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class SetupServiceGet {

    protected static final Actor actor = new Actor("Devon");

    protected void setupServiceGet(String urlBase){
        actorCanRequest(urlBase);
    }

    private void actorCanRequest(String urlBase){
        actor.can(CallAnApi.at(urlBase));
    }
}
