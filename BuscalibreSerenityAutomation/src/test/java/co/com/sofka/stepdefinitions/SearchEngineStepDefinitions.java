package co.com.sofka.stepdefinitions;

import co.com.sofka.setup.SetUpSelection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.Constants.*;
import static co.com.sofka.questions.Title.title;
import static co.com.sofka.tasks.AddProductToCart.addProductToCart;
import static co.com.sofka.tasks.FillOutAccountForm.fillOutAccountForm;
import static co.com.sofka.tasks.FillOutDeliveryForm.fillOutDeliveryForm;
import static co.com.sofka.tasks.FinishPurchase.finishPurchase;
import static co.com.sofka.tasks.OpenHomePage.openPage;
import static co.com.sofka.tasks.SearchBook.searchBook;
import static co.com.sofka.tasks.SelectABook.selectABook;
import static co.com.sofka.tasks.SelectRandomState.selectRandomState;
import static co.com.sofka.util.Util.createUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SearchEngineStepDefinitions extends SetUpSelection {


    @Given("the user is in the Buscalibre web page with browser {int}")
    public void theUserIsInTheBuscalibreWebPageWithBrowser(Integer driverType) {
        try {
            setUpSelection(driverType);
            theActorInTheSpotlight().wasAbleTo(
                    openPage().withUrl(URL)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @Given("search {string} in the search engine selecting it")
    public void searchInTheSearchEngineSelectingIt(String book) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    searchBook().withName(book),
                    selectABook().named(book)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @When("adds it to the cart {int} additional specimens")
    public void addsItToTheCartAdditionalSpecimens(Integer specimens) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    addProductToCart().withQuantity(specimens)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @When("finish the purchase filling out the delivery and payment process")
    public void finishThePurchaseFillingOutTheDeliveryAndPaymentProcess() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    finishPurchase(),
                    fillOutAccountForm().withUserInformation(createUser()),
                    fillOutDeliveryForm().withUserInformation(createUser())

            );
            Thread.sleep(7000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }

    @Then("should see the message {string}")
    public void shouldSeeTheMessage(String expectedMessage) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(title(), equalTo(expectedMessage))
            );
            System.out.println(ACTUAL_MESSAGE + title().answeredBy(theActorInTheSpotlight()));
            System.out.println(EXPECTED_MESSAGE + expectedMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assertions.fail();
        }
    }
}
