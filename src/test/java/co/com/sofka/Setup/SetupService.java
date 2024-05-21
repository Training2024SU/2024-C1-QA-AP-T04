package co.com.sofka.Setup;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;


public class SetupService {


    private EnvironmentVariables environmentVariables;
    protected final Actor actor = new Actor("Daniel");

    public void setupService(){
        actorCanRequst();
    }

    private void actorCanRequst(){
        actor.can(CallAnApi.at(environmentVariables.getProperty("environment.baseUrl")));
    }


}
