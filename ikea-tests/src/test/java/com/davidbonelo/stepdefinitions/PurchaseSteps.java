package com.davidbonelo.stepdefinitions;

import com.davidbonelo.models.User;
import com.davidbonelo.models.factories.UserFactory;
import com.davidbonelo.questions.DeliveryTitle;
import com.davidbonelo.tasks.FillPurchaseInfo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.davidbonelo.tasks.GoToPay.goToPay;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PurchaseSteps {
    @When("{actor} completes the purchase process")
    public void heCompletesThePurchaseProcess(Actor actor) {
        User user = UserFactory.createFakeUser(actor.getName());
        actor.attemptsTo(
                goToPay(),
                FillPurchaseInfo.with(user)
                // can't complete because payment method validation is required
//                Click.on(PLACE_ORDER).afterWaitingUntilEnabled()
        );
    }

    @Then("{actor} should see a confirmation")
    public void heShouldSeeAConfirmation(Actor actor) {
        actor.should(
                seeThat(DeliveryTitle.value(), equalTo("Detalles de la entrega"))
        );
    }
}
