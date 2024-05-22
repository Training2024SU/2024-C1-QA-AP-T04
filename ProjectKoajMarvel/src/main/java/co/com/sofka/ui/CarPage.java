package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarPage extends PageObject {

    public static final Target INCREASE_BUTTON_ONE = Target.
            the("Increase button product one").located
                    (By.xpath("(//*[@class='cart_quantity_up'])[1]"));

    public static final Target DECREASE_BUTTON_ONE = Target.
            the("Increase button product one").located
                    (By.xpath("(//*[@class='cart_quantity_down'])[1]"));

    public static final Target PICKUP_OPTION = Target.
            the("Pickup product option").located
                    (By.xpath("//*[@class='box row _sd_user_location_popup__show_stores']"));

    public static final Target SEARCH_FIELD_PICKUP = Target.
            the("Search Field pickup").located
                    (By.xpath("//*[@class='_sd_user_location_popup__select-your-store__input']"));

    public static final Target CONFIRM_PICKUP_DIRECTION = Target.
            the("Search Field pickup").located
                    (By.xpath("(//button[text() = ' Continuar'])[2]"));







}
