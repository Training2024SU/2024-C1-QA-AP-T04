package co.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SelectingServicePage extends PageObject {
    public static final Target RIDESHARE_LINK = Target.the("Rideshare program link")
            .located(By.cssSelector("a[href='/rideshare/']"));

    public static final Target STARSHIELD_LINK = Target.the("Starshield program link")
            .located(By.cssSelector("a[href='/starshield/']"));

    public static final Target STARLINK_LINK = Target.the("Starlink website link")
            .located(By.cssSelector("a[href='https://www.starlink.com']"));




}