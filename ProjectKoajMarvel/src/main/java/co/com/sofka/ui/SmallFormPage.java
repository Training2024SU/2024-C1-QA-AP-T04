package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SmallFormPage extends PageObject {

    public static final Target I_AM_NEW_BUTTON = Target.
            the("Small form button").located
                    (By.xpath("//*[text() = 'Soy nuevo']"));

    public static final Target EMAIL_FIELD_FORM = Target.
            the("email field").located
                    (By.id("email"));

    public static final Target EMAIL_CONFIRM_FIELD_FORM = Target.
            the("email confirm field").located
                    (By.id("email-confirm"));

    public static final Target PASSWORD_FIELD_FORM = Target.
            the("password field").located
                    (By.id("passwd"));

    public static final Target NAME_FIELD_FORM = Target.
            the("name field").located
                    (By.id("customer_firstname"));

    public static final Target LAST_NAME_FIELD_FORM = Target.
            the("customer_lastname").located
                    (By.id("customer_lastname"));

    public static final Target DAY_SELECT = Target.
            the("day select").located
                    (By.id("days"));

    public static final Target MONTH_SELECT= Target.
            the("month select").located
                    (By.id("months"));

    public static final Target YEAR_SELECT = Target.
            the("year select").located
                    (By.id("years"));

    public static final Target MALE_GENDER_CHECKBOX = Target.
            the("male gender checkbox").located
                    (By.id("id_gender1"));

    public static final Target CONTINUE_BUTTON_SMALL_FORM = Target.
            the("continue button small form").located
                    (By.id("opcRegisterNext"));

    public static final Target SMALL_FORM_PART_TWO = Target.
            the("second part of the form").located
                    (By.id("opcRegisterBack"));

    public static final Target ADRESS_SMALL_FORM_ONE = Target.
            the("Adress one small form").located
                    (By.id("address1"));

    public static final Target ADRESS_SMALL_FORM_TWO = Target.
            the("Adress two small form").located
                    (By.id("address2"));

    public static final Target DOCUMENT_TYPE_SMALL_FORM = Target.
            the("type of document small form").located
                    (By.id("document_type"));

    public static final Target DOCUMENT_SMALL_FORM = Target.
            the("document information small form").located
                    (By.id("dni"));

    public static final Target COUNTRY_SMALL_FORM = Target.
            the("Country small form").located
                    (By.id("id_country"));

    public static final Target STATE_SMALL_FORM = Target.
            the("state small form").located
                    (By.id("id_state"));

    public static final Target CITY_SMALL_FORM = Target.
            the("city small form").located
                    (By.id("id_city"));

    public static final Target PHONE_NUMBER_SMALL_FORM = Target.
            the("phone number small form").located
                    (By.id("phone_mobile"));

    public static final Target TERMS_CONDITIONS_SMALL_FORM = Target.
            the("Terms and conditions small form").located
                    (By.id("pconditions"));



    public static final Target SAVE_ACCOUNT_SMALL_FORM = Target.
            the("Save account information small form").located
                    (By.id("submitAccount"));



}
