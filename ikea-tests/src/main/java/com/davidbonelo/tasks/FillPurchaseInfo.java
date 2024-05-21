package com.davidbonelo.tasks;

import com.davidbonelo.models.User;
import net.datafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.davidbonelo.ui.CheckoutPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FillPurchaseInfo implements Performable {
    private final User user;

    public FillPurchaseInfo(User user) {
        this.user = user;
    }

    public static FillPurchaseInfo with(User user) {
        return new FillPurchaseInfo(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();
        String address = faker.address().fullAddress();
        actor.attemptsTo(
                Enter.theValue(user.getEmail()).into(EMAIL),
                Enter.theValue(user.getFullName()).into(FULL_NAME),
                Enter.theValue(user.getIdentification()).into(IDENTIFICATION),
                Enter.theValue(user.getPhone()).into(PHONE),
                Click.on(REGION),
//                SelectSuggestion.randomly(), // Some cities are not available for delivery
                SelectSuggestion.withText("BOGOTÁ D.C."),
//                Click.on(CITY).afterWaitingUntilEnabled(), // this gets auto-filled for Bogotá
                WaitUntil.the(LOCALITY, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(LOCALITY).afterWaitingUntilEnabled(),
                SelectSuggestion.randomly(),
                Enter.theValue(address).into(ADDRESS),
                Click.on(CONTINUE_SERVICES).afterWaitingUntilEnabled(),
                WaitUntil.the(CONTINUE_PAYMENT, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(CONTINUE_PAYMENT),
                Click.on(CREDIT_CARD).afterWaitingUntilEnabled(),

                Switch.toFrame(CC_IFRAME.resolveFor(actor)),
                WaitUntil.the(CC_NUMBER, isEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue("4929678932145678").into(CC_NUMBER),
                Enter.theValue("0925").into(EXPIRE_DATE),
                Enter.theValue("123").into(CVV),
                Switch.toParentFrame(),
//                Click.on(ADD_CARD).afterWaitingUntilEnabled(), // Doesn't work with fake data
                SetCheckbox.of(TERMS).toTrue()
        );
    }
}