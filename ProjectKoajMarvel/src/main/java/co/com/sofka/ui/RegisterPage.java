package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {



    public static final Target BUTTON_REGISTER = Target.
            the("Register Button").located
                    (By.xpath("(//*[@class='btn btn-primary'])[2]"));

    public static final Target GENDER_OPTION = Target.
            the("male gender option").located
                    (By.id("id_gender1"));

    public static final Target FIRST_NAME_FIELD = Target.
            the("First Name Field").located
                    (By.id("customer_firstname"));

    public static final Target LAST_NAME_FIELD = Target.
            the("Last name field").located
                    (By.id("customer_lastname"));

    public static final Target EMAIL_FIELD = Target.
            the("email field").located
                    (By.id("email-register"));

    public static final Target PASSWORD_FIELD = Target.
            the("password field").located
                    (By.id("passwd"));

    public static final Target REPEAT_PASSWORD_FIELD = Target.
            the("Repeat password field").located
                    (By.id("repeat_passwd"));

    public static final Target DOCUMENT_TYPE_SELECT = Target
            .the("Document type select")
            .locatedBy("#document_type");

    public static final Target ID_FIELD = Target
            .the("Id client information")
            .located(By.id("dni"));

    public static final Target DAY_SELECTOR = Target
            .the("Document type select")
            .located(By.id("days"));
    public static final Target MONTH_SELECTOR = Target
            .the("Document type select")
            .located(By.id("months"));
    public static final Target YEAR_SELECTOR = Target
            .the("Document type select")
            .located(By.id("years"));

    public static final Target NEXT_FORM_BUTTON = Target
            .the("Document type select")
            .located(By.id("continue_first_part"));

    public static final Target PHONE_FIELD = Target.
            the("phone number field").located
                    (By.id("phone_mobile"));

    public static final Target ADDRESS_FIELD = Target.
            the("address field").located
                    (By.id("address1"));

    public static final Target COUNTRY_OPTION = Target.
            the("country option is only colombia").located
                    (By.id("id_country"));
    public static final Target STATE_OPTION = Target.
            the("country option is only colombia").located
                    (By.id("id_state"));
    public static final Target CITY_OPTION = Target.
            the("country option is only colombia").located
                    (By.id("id_city"));

    public static final Target CHECK_BOX_TERMS_CONDITIONS = Target.
            the("Check box terms and conditions").located
                    (By.id("uniform-fake_lopd"));

    public static final Target CHECK_BOX_POLICIES = Target.
            the("Check box store policies").located
                    (By.id("uniform-acceptLopd"));

    public static final Target SUBMIT_REGISTER = Target.
            the("Submit new register").located
                    (By.id("submitAccount"));


    public void selectDocumentType(String value) {
        $(DOCUMENT_TYPE_SELECT).selectByValue(value);
    }
    public void selectDay(String value) {
        $(DAY_SELECTOR).selectByValue(value);
    }
    public void selectMonth(String value) {
        $(MONTH_SELECTOR).selectByValue(value);
    }
    public void selectYear(String value) {
        $(YEAR_SELECTOR).selectByValue(value);
    }
    public void selectCountry(String value) {
        $(COUNTRY_OPTION).selectByValue(value);
    }
    public void selectState(String value) {
        $(STATE_OPTION).selectByValue(value);
    }
    public void selectCity(String value) {
        $(CITY_OPTION).selectByValue(value);
    }



}
