package co.com.sofka.tasks;

import net.datafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.RegisterPage.*;
import static co.com.sofka.ui.SmallFormPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillSmallForm implements Task {
    Faker faker = new Faker();
    private String email = faker.internet().emailAddress();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(I_AM_NEW_BUTTON),
                Enter.theValue(email).into(EMAIL_FIELD_FORM),
                Enter.theValue(email).into(EMAIL_CONFIRM_FIELD_FORM),
                Enter.theValue("jorge1234").into(PASSWORD_FIELD_FORM),
                Enter.theValue("jorge").into(NAME_FIELD_FORM),
                Enter.theValue("deNeiva").into(LAST_NAME_FIELD_FORM),
                SelectFromOptions.byValue("14").from(DAY_SELECT),
                SelectFromOptions.byValue("5").from(MONTH_SELECT),
                SelectFromOptions.byValue("1995").from(YEAR_SELECT),
                Click.on(MALE_GENDER_CHECKBOX),
                Click.on(CONTINUE_BUTTON_SMALL_FORM),
                WaitUntil.the(SMALL_FORM_PART_TWO, isClickable()).forNoMoreThan(4).seconds(),
                Scroll.to(ADRESS_SMALL_FORM_ONE),
                Enter.theValue("avenida 8 #10").into(ADRESS_SMALL_FORM_ONE),
                Enter.theValue("casa11a").into(ADRESS_SMALL_FORM_TWO),
                SelectFromOptions.byValue("1").from(DOCUMENT_TYPE_SMALL_FORM),
                Enter.theValue("1234234142").into(DOCUMENT_SMALL_FORM),
                SelectFromOptions.byValue("69").from(COUNTRY_SMALL_FORM),
                SelectFromOptions.byValue("379").from(STATE_SMALL_FORM),
                SelectFromOptions.byValue("155").from(CITY_SMALL_FORM),
                Enter.theValue("3195229961").into(PHONE_NUMBER_SMALL_FORM),
                Click.on(TERMS_CONDITIONS_SMALL_FORM),
                Click.on(SAVE_ACCOUNT_SMALL_FORM)
        );

    }
    public static FillSmallForm fillSmallForm(){return new FillSmallForm();}
}
