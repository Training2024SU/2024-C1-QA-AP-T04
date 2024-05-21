package co.com.sofka.tasks;

import co.com.sofka.model.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.tasks.SelectRandomCity.selectRandomCity;
import static co.com.sofka.tasks.SelectRandomState.selectRandomState;
import static co.com.sofka.ui.DeliveryPage.*;

public class FillOutDeliveryForm implements Task {
    UserModel userModel;

    public FillOutDeliveryForm withUserInformation(UserModel userModel) {
        this.userModel = userModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                selectRandomState(),
                Enter.theValue(userModel.getId()).into(ID),
                selectRandomCity(),
                Enter.theValue(userModel.getName()+" "+userModel.getLastName()).into(ADDRESSEE),
                Enter.theValue(userModel.getAddress()).into(ADDRESS),
                Enter.theValue(userModel.getPhone()).into(PHONE),
                Click.on(VALIDATE_ADDRESS_BUTTON),
                Scroll.to(SEND_HERE_BUTTON),
                Click.on(SEND_HERE_BUTTON)
        );
    }



    public static FillOutDeliveryForm fillOutDeliveryForm(){
        return new FillOutDeliveryForm();
    }
}
