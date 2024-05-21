package co.com.sofka.constants;

import java.util.Calendar;

import static co.com.sofka.util.Util.generateMD5Hash;

public class ConstantsOperation {
    public static final String SEARCH_ENGINE = "Search engine";
    public static final String SEARCH_BUTTON_BOOK = "Search engine";
    public static final String BOOK_NAME = "Search engine";
    public static final String BUY_BUTTON_NAME = "buy button";
    public static final String DROPDOWN = "dropdown";
    public static final String FINISH_PURCHASE_BUTTON = "finish purchase button";
    public static final String EMAIL_INPUT_THE = "email input";
    public static final String CONTINUE_BUTTON_THE = "continue button";
    public static final String EMAIL_CONFIRMATION_THE = "confirm your email input";
    public static final String NAME_THE = "name input";
    public static final String LAST_NAME_THE = "last name input";
    public static final String PASSWORD_THE = "password input";
    public static final String CONFIRM_PASSWORD_THE = "password input";
    public static final String CREATE_ACCOUNT_THE = "create account button";
    public static final String STATE_THE = "state dropdown";
    public static final String CITY_THE = "city dropdown";
    public static final String ID_THE = "id input";
    public static final String ADDRESSEE_THE = "addressee input";
    public static final String ADDRESS_THE = "address input";
    public static final String PHONE_THE = "phone input";
    public static final String VALIDATE_ADDRESS_THE = "validate address button";
    public static final String SEND_HERE_THE = "send here button";
    public static final String PAY_METHOD_TITLE_THE = "pay method title";
    public static final String CATEGORIES_THE = "categories list";
    public static final String BOOKS_BY_CATEGORY_THE = "books by category list";
    public static final String PURCHASE_SUMMARY_THE = "purchase summary text";
    public static final String PUBLIC_KEY = "3fbf240604c72fa056b3103dbca0e58e";
    public static final String PRIVATE_KEY = "8113749f365621a4130395e3497d667c7e34d0d1";
    public static final int TIMESTAMP = (int) Calendar.getInstance().getTimeInMillis();
    public static final String HASH = generateMD5Hash(TIMESTAMP, PUBLIC_KEY, PRIVATE_KEY);

}
