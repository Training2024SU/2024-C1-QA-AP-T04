package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.CheckoutPage.PAY_METHOD_TITLE;

public class Title implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PAY_METHOD_TITLE.resolveFor(actor).getText();
    }
    public static Title title(){
        return new Title();
    }
}
