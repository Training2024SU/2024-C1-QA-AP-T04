package co.com.demo.stepsdefinitions;

import co.com.demo.models.CreditCardInformation;
import co.com.demo.models.ShippingInformation;
import co.com.demo.tasks.EnterCreditCardInformation;
import co.com.demo.tasks.EntersShippingInformation;
import co.com.demo.utils.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;

import static co.com.demo.tasks.OpenInitialPage.openPage;
import static co.com.demo.tasks.SelectProducts.selectProducts;
import static co.com.demo.tasks.VerifyTotal.verifyTotal;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingItemStepsDefinitions extends Setup {

    @Given("I am on the main SpaceX website and ready to shop")
    public void iAmOnTheMainSpaceXWebsiteAndReadyToShop() {
        actorSetupTheBrowser();
        theActorInTheSpotlight().wasAbleTo(
              openPage().withURL("https://shop.spacex.com/")
        );
    }
    @When("the user adds an article to their cart")
    public void theUserAddsAnArticleToTheirCart() {
        theActorInTheSpotlight().attemptsTo(
                selectProducts()
        );

    }
    @When("enters their shipping information")
    public void entersTheirShippingInformation() {
        ShippingInformation shippingInfo = Util.createRandomShippingInformation();
        Performable entersShippingInfoTask = EntersShippingInformation.withDetails(shippingInfo);
        theActorInTheSpotlight().attemptsTo(entersShippingInfoTask);

    }

    @When("enters their payment information")
    public void entersTheirPaymentInformation() {
    // CreditCardInformation creditCardInformation = Util.createRandomCreditCardInformation();
    // Performable enterCreditCardInfoTask = EnterCreditCardInformation.withDetails(creditCardInformation);
    // theActorInTheSpotlight().attemptsTo(enterCredritCardInfoTask);
    }

    @Then("they should see a message with the total purchase amount")
    public void theyShouldSeeAMessageWithTheTotalPurchaseAmount() {
            theActorInTheSpotlight().attemptsTo(
                    verifyTotal()
            );
    }
}
