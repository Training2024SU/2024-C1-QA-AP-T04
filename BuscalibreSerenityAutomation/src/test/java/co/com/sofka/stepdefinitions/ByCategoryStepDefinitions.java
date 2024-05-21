package co.com.sofka.stepdefinitions;

import co.com.sofka.setup.SetUpSelection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.Constants.*;
import static co.com.sofka.questions.PurchaseSummary.purchaseSummary;
import static co.com.sofka.questions.Title.title;
import static co.com.sofka.tasks.AddProductToCart.addProductToCart;
import static co.com.sofka.tasks.FillOutAccountForm.fillOutAccountForm;
import static co.com.sofka.tasks.FillOutDeliveryForm.fillOutDeliveryForm;
import static co.com.sofka.tasks.FinishPurchase.finishPurchase;
import static co.com.sofka.tasks.OpenHomePage.openPage;
import static co.com.sofka.tasks.SelectARandomBook.selectARandomBook;
import static co.com.sofka.tasks.SelectRandomCategory.selectRandomCategory;
import static co.com.sofka.util.Util.createUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ByCategoryStepDefinitions extends SetUpSelection {
    @Given("selects a random category")
    public void selectsARandomCategory() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    selectRandomCategory()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @When("adds a random book to the carth with {int} additional specimens")
    public void addsARandomBookToTheCarthWithAdditionalSpecimens(Integer specimens) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    selectARandomBook(),
                    addProductToCart().withQuantity(specimens)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @When("finish the purchase filling out the delivery and payment forms")
    public void finishThePurchaseFillingOutTheDeliveryAndPaymentForms() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    finishPurchase(),
                    fillOutAccountForm().withUserInformation(createUser()),
                    fillOutDeliveryForm().withUserInformation(createUser())
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }


    @Then("should see the message {string} in the payment page")
    public void shouldSeeTheMessageInThePaymentPage(String expectedMessage) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(purchaseSummary(), equalTo(expectedMessage))
            );
            System.out.println(ACTUAL_MESSAGE + purchaseSummary().answeredBy(theActorInTheSpotlight()));
            System.out.println(EXPECTED_MESSAGE + expectedMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }
}
