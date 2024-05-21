package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageComprarProduct.buttonMethodPayCre;

public class PayTCResponse implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return buttonMethodPayCre.resolveFor(actor).getText();
    }

    public static PayTCResponse expected(){
        return new PayTCResponse();
    }

}
