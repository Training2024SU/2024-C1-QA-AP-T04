package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static co.com.sofka.constants.ConstantsOperation.BOOKS_BY_CATEGORY_THE;

public class CategoryPage extends PageObject {
    public static final Target BOOKS_BY_CATEGORY = Target
            .the(BOOKS_BY_CATEGORY_THE).located(By.xpath("//div[@class='productos pais46']/div"));
}
