package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ButtonPressSeveralTimes implements Interaction {

    private int times;
    private Target target;

    public ButtonPressSeveralTimes setButton(int times, Target target) {
        this.times  = times;
        this.target = target;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < times; i++) {
            actor.attemptsTo(Click.on(target));
        }
    }

    public static ButtonPressSeveralTimes pressButton (){
        return new ButtonPressSeveralTimes();
    }
}
