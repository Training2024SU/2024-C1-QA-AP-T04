package com.davidbonelo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class ProfilePage {
    public static final Target GREETING = Target.the("Profile greeting")
            .located(By.cssSelector("main > section > h1"))
            .waitingForNoMoreThan(Duration.ofSeconds(20));
    public static final Target PROFILE = Target.the("Profile button")
            .located(By.cssSelector("a[data-greeting]"));
}
