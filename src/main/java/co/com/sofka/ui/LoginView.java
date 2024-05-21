package co.com.sofka.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {
    public static Target USERNAME_FIELD = Target.the("Username field")
            .located(AppiumBy.accessibilityId("username"));
    public static Target PASSWORD_FIELD = Target.the("Password field")
            .located(AppiumBy.accessibilityId("password"));
    public static Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));

    public static Target SECRET_AREA = Target.the("Home user")
            .located(By.xpath("//android.widget.TextView[@text=\"Secret Area\"]"));

    public static Target LABEL_USER = Target.the("lABEL USER")
            .located(By.xpath("//android.widget.TextView[@text=\"You are logged in as alice\"]"));

    public static Target LOG_OUT_BUTTON = Target.the("Logout button")
            .located(By.xpath("//android.widget.TextView[@text=\"Logout\"]"));
}
