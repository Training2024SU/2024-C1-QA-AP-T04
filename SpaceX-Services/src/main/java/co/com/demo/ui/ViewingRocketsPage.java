package co.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ViewingRocketsPage extends PageObject {

    public static final Target FALCON_9_LINK = Target.the("Falcon 9 Link")
            .located(By.cssSelector("a[href='/vehicles/falcon-9/']"));

    public static final Target FALCON_HEAVY_LINK = Target.the("Falcon Heavy Link")
            .located(By.cssSelector("a[href='/vehicles/falcon-heavy/']"));

    public static final Target DRAGON_LINK = Target.the("Dragon Link")
            .located(By.cssSelector("a[href='/vehicles/dragon/']"));

    public static final Target STARSHIP_LINK = Target.the("Starship Link")
            .located(By.cssSelector("a[href='/vehicles/starship/']"));

    // Pages texts Expected
    public static final Target HEADER_TITLE = Target.the("Main page Title")
            .locatedBy("//h2[contains(@class, 'animate') and text()='ADVANCING HUMAN SPACEFLIGHT']");


}
