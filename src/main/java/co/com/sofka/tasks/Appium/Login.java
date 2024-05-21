package co.com.sofka.tasks.Appium;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.sofka.ui.LoginView.*;


//shortcut alt+enter
public class Login implements Task {

    private String userName;
    private String password;

    public Login ingresoUser(String userName, String password){
        this.userName = userName;
        this.password = password;

        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(userName).into(USERNAME_FIELD),
                SendKeys.of(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );

    }

    public static Login doLogin(){
        return new Login();
    }
}
