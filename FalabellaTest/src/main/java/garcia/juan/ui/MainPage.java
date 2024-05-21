package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MainPage extends PageObject {

    public static final Target USER_ACTIONS_MAIN_PAGE = Target.
            the("User action").located(By.id("testId-UserAction-userinfo"));

    public static final Target REGISTRARSE_BOTON = Target.
            the("Boton de registrarse").located(By.id("testId-loggedout-item-1"));

    public static final Target SEARCH_BAR = Target.
            the("Barra de busqueda").located(By.id("testId-SearchBar-Input"));


}
