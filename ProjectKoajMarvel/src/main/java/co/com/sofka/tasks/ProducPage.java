package co.com.sofka.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProducPage extends PageObject {

    public static final Target ADD_CAR_BUTTON = Target.
            the("Submit to the car").located
                    (By.xpath("//*[@name='Submit']"));

}
