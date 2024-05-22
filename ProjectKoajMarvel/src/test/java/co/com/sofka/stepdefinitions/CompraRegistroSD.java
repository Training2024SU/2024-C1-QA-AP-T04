package co.com.sofka.stepdefinitions;

import co.com.sofka.models.ClientRegisterModel;
import co.com.sofka.tasks.*;
import co.com.sofka.ui.RegisterPage;
import io.cucumber.java.en.*;

import java.util.List;

import static co.com.sofka.questions.ConfirmationMessagePayco.confirmationMessagePayco;
import static co.com.sofka.questions.DownlableReceiptPayco.downlableReceiptPayco;
import static co.com.sofka.tasks.AddToCar.addToCar;
import static co.com.sofka.tasks.ChoosePickUpLocation.choosePickUpLocation;
import static co.com.sofka.tasks.ConfirmCheckBoxPaymentTerms.confirmCheckBoxPaymentTerms;
import static co.com.sofka.tasks.ConfirmPaymentMethod.confirmPaymentMethod;
import static co.com.sofka.tasks.FillRegisterForm.fillRegisterForm;
import static co.com.sofka.tasks.GeneratePaymentNumberPayco.generatePaymentNumberPayco;
import static co.com.sofka.tasks.OpenMainPage.openPage;
import static co.com.sofka.tasks.OpenRegisterForm.openRegisterForm;
import static co.com.sofka.tasks.RedirectMainPage.redirectMainPage;
import static co.com.sofka.tasks.RedirectRegister.redirectRegister;
import static co.com.sofka.tasks.RedirectToCar.redirectToCar;
import static co.com.sofka.tasks.SearchProduct.searchProduct;
import static co.com.sofka.utils.Util.createCartFormModel;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;

public class CompraRegistroSD extends SetUp{


    @Given("The user <name> is in the Web page {string}")
    public void theUserNameIsInTheWebPage(String url) {
        actorSetupTheBrowser("jorge");
        theActorInTheSpotlight().wasAbleTo(
                openPage().withTheUrl(url)
        );
    }
    @When("Registers and start session with the user information")
    public void registersAndStartSessionWithTheUserInformation() {
        ClientRegisterModel clientRegisterModel = createCartFormModel();
       theActorInTheSpotlight().attemptsTo(
                redirectRegister(),
                openRegisterForm(),
                fillRegisterForm().withTheCredentiasl(clientRegisterModel)
        );
    }
    @When("select the products and add them to the Car")
    public void selectTheProductsAndAddThemToTheCar(List<String> items) {
        items.forEach(itemName -> theActorInTheSpotlight().attemptsTo(
                searchProduct().withTheName(itemName),
                addToCar(),
                redirectMainPage()
        ));
    }
    @When("Redirects to the car")
    public void redirectsToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                redirectToCar()
        );
    }
    @When("confirm the pickup direction")
    public void confirmThePickupDirection() {
        theActorInTheSpotlight().attemptsTo(

                choosePickUpLocation()
        );
    }
    @When("confirm the payment method")
    public void confirmThePaymentMethod() {
        theActorInTheSpotlight().attemptsTo(
                confirmCheckBoxPaymentTerms(),
                confirmPaymentMethod(),
                generatePaymentNumberPayco()
        );
    }
    @Then("it should go to the order confirmation")
    public void itShouldGoToTheOrderConfirmation() {
        theActorInTheSpotlight().should(
                seeThat(confirmationMessagePayco(),equalTo("SOLO FALTA UN PASO"))
        );
    }
    @Then("be able to download the payment code")
    public void beAbleToDownloadThePaymentCode() {
        theActorInTheSpotlight().should(
                seeThat(downlableReceiptPayco(), is(true))
        );
    }
}
