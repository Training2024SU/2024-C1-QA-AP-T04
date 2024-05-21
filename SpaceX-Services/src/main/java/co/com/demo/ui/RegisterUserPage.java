package co.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUserPage {
    public static final Target ACCOUNT_LINK = Target.the("Account Link")
            .located(By.cssSelector("a[href='/account'].Heading.Link.Link--primary.Text--subdued.u-h8"));

    public static final Target CREATE_ACCOUNT_LINK = Target.the("Create Account Link")
            .located(By.cssSelector("a[href='/account/register'].Link.Link--secondary"));

    public static final Target FIRST_NAME_INPUT = Target.the("First Name Input")
            .located(By.cssSelector("input[name='customer[first_name]']"));

    public static final Target LAST_NAME_INPUT = Target.the("Last Name Input")
            .located(By.cssSelector("input[name='customer[last_name]']"));

    public static final Target EMAIL_INPUT = Target.the("Email Input")
            .located(By.cssSelector("input[name='customer[email]']"));

    public static final Target PASSWORD_INPUT = Target.the("Password Input")
            .located(By.cssSelector("input[name='customer[password]']"));

    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Create Account Button")
            .located(By.cssSelector(".Form__Submit.Button.Button--primary.Button--full"));
}
