package co.com.sofka.stepdefinitions.setup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.sofka.utils.Constants.ACTOR;

public class SetupService {

    protected static final Actor actor = new Actor(ACTOR);

    protected void setupService(String urlBase) {
        actor.can(CallAnApi.at(urlBase));
    }
}
