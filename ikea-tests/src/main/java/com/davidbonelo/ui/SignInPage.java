package com.davidbonelo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class SignInPage {
    public static final Target EMAIL = Target.the("Email field")
            .located(By.id("login-email"));
    public static final Target PASSWORD = Target.the("Password field")
            .located(By.id("login-password"));
    public static final Target SIGN_IN = Target.the("Sign in button")
            .located(By.cssSelector("button[data-testid='login']"));
    public static final Target REGISTER = Target.the("Sign up button")
            .located(By.cssSelector("button[data-testid='create-account']"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));
}
