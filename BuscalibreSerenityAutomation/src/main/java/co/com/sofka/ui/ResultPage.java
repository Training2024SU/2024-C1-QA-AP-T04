package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.sofka.constants.ConstantsOperation.BOOK_NAME;

public class ResultPage extends PageObject {
    public static Target selectsBook(String bookName) {
        String xpath = "//h3[text()=' %s ']";
        String formattedXpath = String.format(xpath, bookName);
        return Target.the(BOOK_NAME).located(By.xpath(formattedXpath));
    }
}
