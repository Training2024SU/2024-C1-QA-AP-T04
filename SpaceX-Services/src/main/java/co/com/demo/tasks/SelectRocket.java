package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.demo.ui.ViewingRocketsPage.*;

public class SelectRocket implements Task {
    private final String rocketName;

    public SelectRocket(String rocketName) {
        this.rocketName = rocketName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (rocketName) {
            case "FALCON 9":
                actor.attemptsTo(Click.on(FALCON_9_LINK));
                break;
            case "FALCON HEAVY":
                actor.attemptsTo(Click.on(FALCON_HEAVY_LINK));
                break;
            case "DRAGON":
                actor.attemptsTo(Click.on(DRAGON_LINK));
                break;
            case "STARSHIP":
                actor.attemptsTo(Click.on(STARSHIP_LINK));
                break;
            default:
                throw new IllegalArgumentException("Invalid rocket name: " + rocketName);
        }
    }

    public static SelectRocket selectRocket(String rocket) {
        return new SelectRocket(rocket);
    }
}
