package com.davidbonelo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class CheckoutPage extends PageObject {
    public static final Target EMAIL = Target.the("Email field")
            .located(By.id("email"))
            .waitingForNoMoreThan(Duration.ofSeconds(30));
    public static final Target FULL_NAME = Target.the("Full name field")
            .located(By.id("fullName"));
    public static final Target IDENTIFICATION = Target.the("Identification field")
            .located(By.id("identityValue"));
    public static final Target PHONE = Target.the("Phone field")
            .located(By.id("phone"));
    public static final Target REGION = Target.the("Region field")
            .located(By.id("county"));
    public static final Target CITY = Target.the("City field")
            .located(By.id("district"));
    public static final Target LOCALITY = Target.the("Locality field")
            .located(By.id("town"));
    public static final Target AUTOCOMPLETE_SUGGESTIONS = Target.the("Region suggestion options")
            .located(By.cssSelector(".suggestions li"));
    public static final Target ADDRESS = Target.the("Email field")
            .located(By.id("addressOne"));
    public static final Target CONTINUE_SERVICES = Target.the("Continue to services button")
            .located(By.id("submitIdentityFormButton"));
    public static final Target CONTINUE_PAYMENT = Target.the("Continue to payment button")
            .located(By.id("submit-services-form-button"));
    public static final Target CC_IFRAME = Target.the("Credit card frame")
            .located(By.cssSelector("iframe[title='fpayform']"));
    public static final Target CREDIT_CARD = Target.the("Credit card option")
            .located(By.cssSelector("#CREDITCARD button"));
    public static final Target CC_NUMBER = Target.the("Credit card number field")
            .located(By.id("pan"));
    public static final Target EXPIRE_DATE = Target.the("Expire date field")
            .located(By.id("expDate"));
    public static final Target CVV = Target.the("CVV number field")
            .located(By.id("cvv"));
    public static final Target ADD_CARD = Target.the("Add card button")
            .located(By.id("btnConfirm"));
    public static final Target PLACE_ORDER = Target.the("Place order button")
            .located(By.cssSelector("button[data-testid='button-place-order']"));
    public static final Target TERMS = Target.the("Terms and conditions checkbox")
            .located(By.id("terms-and-conditions-checkbox"));
    public static final Target DELIVERY_DETAILS = Target.the("Delivery details title")
            .located(By.xpath("//h6[text()='Detalles de la entrega']"));

    public static final Target SUGGESTION = Target.the("{0} autocomplete suggestion")
            .locatedBy("//li[text()='{0}']");

    public static Target getSuggestionByText(String text) {
        return SUGGESTION.of(text);
    }
}
