package com.davidbonelo.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class RegisterPage {
    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.id("last-name"));
    public static final Target IDENTIFICATION = Target.the("Identification field")
            .located(By.id("CitizenshipCard-identification-value"));
    public static final Target PHONE = Target.the("Phone field")
            .located(By.id("phone-input-field"));
    public static final Target EMAIL = Target.the("Email field")
            .located(By.id("email"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target CONFIRM_EMAIL = Target.the("Confirm email field")
            .located(By.id("repeated-email"));
    public static final Target PASSWORD = Target.the("Email field")
            .located(By.id("password"));
    public static final Target PRIVACY_POLICY = Target.the("Privacy policy checkbox")
            .located(By.id("privacy-policy-checkbox"));
    public static final Target CREATE_ACCOUNT = Target.the("Create account button")
            .located(By.cssSelector("button[data-testid='sign-up-create-account']"));
}
