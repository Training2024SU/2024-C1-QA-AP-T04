package co.com.sofka.tasks;

import co.com.sofka.model.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.ui.DeliveryPage.*;

public class FillOutAccountForm implements Task {
    UserModel userModel;

    public FillOutAccountForm withUserInformation(UserModel userModel) {
        this.userModel = userModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getEmail()).into(EMAIL_INPUT),
                Click.on(CONTINUE_BUTTON),
                Enter.theValue(userModel.getEmail()).into(EMAIL_CONFIRMATION_INPUT),
                Enter.theValue(userModel.getName()).into(NAME_INPUT),
                Enter.theValue(userModel.getLastName()).into(LAST_NAME_INPUT),
                Enter.theValue(userModel.getPassword()).into(PASSWORD_INPUT),
                Enter.theValue(userModel.getPassword()).into(CONFIRM_PASSWORD_INPUT),
                Click.on(CREATE_ACCOUNT_BUTTON)
        );
    }
    public static FillOutAccountForm fillOutAccountForm() {
        return new FillOutAccountForm();
    }
}
