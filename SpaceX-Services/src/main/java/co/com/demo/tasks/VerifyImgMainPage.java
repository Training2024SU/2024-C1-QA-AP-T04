package co.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.demo.ui.PurchaseItemPage.SPACEX_LOGO_IMAGE;

public class VerifyImgMainPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(SPACEX_LOGO_IMAGE).isDisplayed()
        );
    }

    public static VerifyImgMainPage verifyImgMainPage(){
        return new VerifyImgMainPage();
    }
}
