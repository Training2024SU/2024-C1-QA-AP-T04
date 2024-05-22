package co.com.sofka.tasks;

import co.com.sofka.models.ClientRegisterModel;
import co.com.sofka.ui.RegisterPage;
import co.com.sofka.utils.Util;
import net.datafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static co.com.sofka.ui.RegisterPage.*;
import static co.com.sofka.utils.Util.setImplicitTimeout;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FillRegisterForm implements Task {
    private RegisterPage registerPage;
    private ClientRegisterModel clientRegisterModel;
    Faker faker = new Faker();

    public FillRegisterForm withTheCredentiasl(ClientRegisterModel clientRegisterModel){
        this.clientRegisterModel = clientRegisterModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GENDER_OPTION),
                Enter.theValue(clientRegisterModel.getName(), Keys.ENTER).into(FIRST_NAME_FIELD),
                Enter.theValue(clientRegisterModel.getLastName()).into(LAST_NAME_FIELD),
                Enter.theValue(faker.internet().emailAddress()).into(EMAIL_FIELD),
                Enter.theValue(clientRegisterModel.getPassword()).into(PASSWORD_FIELD),
                Enter.theValue(clientRegisterModel.getPassword()).into(REPEAT_PASSWORD_FIELD),
                SelectFromOptions.byValue("8").from(DAY_SELECTOR),
                SelectFromOptions.byValue("1").from(DOCUMENT_TYPE_SELECT),
                SelectFromOptions.byValue("3").from(MONTH_SELECTOR),
                SelectFromOptions.byValue("1999").from(YEAR_SELECTOR),
                Enter.theValue(clientRegisterModel.getId()).into(ID_FIELD),
                Scroll.to(NEXT_FORM_BUTTON),
                WaitUntil.the(NEXT_FORM_BUTTON, isClickable()).forNoMoreThan(2).seconds(),
                Click.on(NEXT_FORM_BUTTON),
                Enter.theValue(clientRegisterModel.getPhoneNumber()).into(PHONE_FIELD),
                Enter.theValue(clientRegisterModel.getAddress()).into(ADDRESS_FIELD),
                SelectFromOptions.byValue("69").from(COUNTRY_OPTION),
                SelectFromOptions.byValue("379").from(STATE_OPTION),
                SelectFromOptions.byValue("155").from(CITY_OPTION),
                Click.on(CHECK_BOX_TERMS_CONDITIONS),
                Click.on(CHECK_BOX_POLICIES),
                Scroll.to(SUBMIT_REGISTER),
                Click.on(SUBMIT_REGISTER)
        );
    }

    public static FillRegisterForm fillRegisterForm() {
        return new FillRegisterForm();
    }
}
