package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.demo.ui.SelectingServicePage.*;

public class SelectService implements Task {
    private final String serviceName;

    public SelectService(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (serviceName) {
            case "Rideshare":
                actor.attemptsTo(Click.on(RIDESHARE_LINK));
                break;
            case "Starshield":
                actor.attemptsTo(Click.on(STARSHIELD_LINK));
                break;
            default:
                throw new IllegalArgumentException("Invalid service name: " + serviceName);
        }
    }

    public static SelectService selectService(String serviceName) {
        return new SelectService(serviceName);
    }
}
