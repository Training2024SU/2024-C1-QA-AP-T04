package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenInitialPage implements Task {

    private String url;
    public OpenInitialPage withURL(String url){
        this.url = url;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static OpenInitialPage openPage(){
        return new OpenInitialPage();
    }
}
