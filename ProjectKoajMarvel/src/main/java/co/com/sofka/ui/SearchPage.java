package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class SearchPage extends PageObject {

    public static final Target SEARCH_BAR = Target.
            the("Main Search bar").located
                    (By.id("searchbox_inner"));

    public static final Target SEARCH_BAR_HIDDEN = Target.
            the("Second Search bar").located
                    (By.xpath("//*[@type='search']"));

    public static final Target SERACH_RESULT_FIRST = Target.
            the("First result of the search").located
                    (By.xpath("(//*[@class='dfd-card dfd-card-preset-product dfd-card-type-product'])[1]"));


}
