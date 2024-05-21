package co.com.sofka.ui;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PageLogin extends PageObject {
    public static final Target BUSCADOR = Target.
            the("buscador principal").located(By.xpath  ("//input[@class='DesktopSearchBar-module__searchbox-input___1C9jN']"));

    public static final Target BUSCAR = Target.
            the("lupa busvar").located(By.xpath("//svg[contains(@class, 'DesktopSearchBar-module__lens-icon___3t6ak')]"));
}
