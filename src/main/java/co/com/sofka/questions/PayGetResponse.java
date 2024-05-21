package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.HashMap;

import static co.com.sofka.ui.LoginView.SECRET_AREA;
import static co.com.sofka.ui.PageComprarProduct.buttonFinishPayment;
import static co.com.sofka.ui.PageComprarProduct.buttonMethodPay;
import static co.com.sofka.utils.Constantes.*;

public class PayGetResponse implements Question<HashMap<String, String>> {

    @Override
    public HashMap<String, String> answeredBy(Actor actor) {
        HashMap<String, String> responsePayMethod= new HashMap<>();
        responsePayMethod.put(EFECTY_METHOD_PAY,buttonMethodPay.resolveFor(actor).getText());
        responsePayMethod.put(BUTTON_COMPRAR,buttonFinishPayment.resolveFor(actor).getText());

        return responsePayMethod;
    }

    public static PayGetResponse expected(){
        return new PayGetResponse();
    }
}
