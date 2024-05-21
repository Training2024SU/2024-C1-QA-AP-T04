package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.HashMap;

import static co.com.sofka.ui.LoginView.*;
import static co.com.sofka.utils.Constantes.*;

public class UserLogin implements Question<HashMap<String, String>> {

    @Override
    public HashMap<String, String> answeredBy(Actor actor) {
        HashMap<String, String> responseLoginHome = new HashMap<>();
        responseLoginHome.put(SECRET_AREA_LABEL,SECRET_AREA.resolveFor(actor).getText());
        responseLoginHome.put(LOGIN_USER,LABEL_USER.resolveFor(actor).getText());
        responseLoginHome.put(LOGOUT_BUTTON,LOG_OUT_BUTTON.resolveFor(actor).getText());

        return responseLoginHome;
    }

    public static UserLogin expected(){
        return new UserLogin();
    }
}
