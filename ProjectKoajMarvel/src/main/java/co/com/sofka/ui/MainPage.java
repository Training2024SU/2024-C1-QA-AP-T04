package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage extends PageObject {
    public static final Target BOTON_SIGN_UP = Target.
            the("boton inicio de sesion").located
                    (By.xpath("(//*[@title ='Log in to your customer account'])[1]"));
    public static final Target BUTTON_REDIRECT_MAIN_PAGE = Target.
            the("Boton main menu").located
                    (By.id("logo_center"));
    public static final Target BUTTON_CAR_POPUP = Target.
            the("Boton main menu").located
                    (By.id("shopping_cart"));
    public static final Target BUTTON_REDIRECT_CAR = Target.
            the("Boton main menu").located
                    (By.xpath("//*[@class='button_order_cart btn btn-primary btn-bootstrap']"));

    


}
