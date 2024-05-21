package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static co.com.sofka.constants.ConstantsOperation.*;

public class HomePage extends PageObject {
    public static final Target SEARCH_ENGINE_INPUT = Target
            .the(SEARCH_ENGINE).located(By.xpath("//input[@placeholder='Título, Autor o ISBN']"));
    public static final Target SEARCH_BUTTON = Target
            .the(SEARCH_BUTTON_BOOK ).located(By.xpath("//button[text()='Buscar']"));
    public static final Target CATEGORIES = Target
            .the(CATEGORIES_THE).located(By.xpath("//ul/li[@class='category-li b']"));

}
