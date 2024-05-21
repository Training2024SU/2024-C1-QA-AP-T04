package co.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseItemPage {

    // Selectin Product Process

    public static final Target STARSHIP_T_SHIRT_LINK = Target.the("Unisex Starship Test Flight T-Shirt link")
            .located(By.cssSelector("a[href='/collections/trending/products/mens-starship-test-flight-t-shirt']"));

    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .located(By.cssSelector("button.ProductForm__AddToCart.Button.Button--primary.Button--full"));

    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button")
            .located(By.cssSelector("button.Cart__Checkout.Button.Button--primary.Button--full"));

    // Shipping Product Process

    public static final Target EMAIL_SHIPPING = Target.the("Shipping email")
            .located(By.cssSelector("input[data-backup='customer_email']"));

    public static final Target FIRST_NAME_SHIPPING = Target.the("First name input field")
            .located(By.cssSelector("input[data-backup='first_name']"));

    public static final Target LAST_NAME_SHIPPING = Target.the("Last name input field")
            .located(By.cssSelector("input[data-backup='last_name']"));

    public static final Target ADDRESS_SHIPPING = Target.the("Address input field")
            .located(By.cssSelector("input[data-backup='address1']"));

    public static final Target ADDRESS_2_SHIPPING = Target.the("Address 2 input field")
            .located(By.cssSelector("input[data-backup='address2']"));

    public static final Target CITY_SHIPPING = Target.the("City input field")
            .located(By.cssSelector("input[data-backup='city']"));

    public static final Target POSTAL_CODE_SHIPPING = Target.the("Postal code input field")
            .located(By.cssSelector("input[data-backup='zip']"));

    public static final Target PHONE_SHIPPING = Target.the("Phone input field")
            .located(By.cssSelector("input[data-backup='phone']"));

    public static final Target CONTINUE_BUTTON = Target.the("Continue to payment button")
            .located(By.id("continue_button"));

    public static final Target PROVINCE_DROPDOWN = Target.the("Province dropdown")
            .located(By.id("checkout_shipping_address_province"));

    public static final Target COUNTRY_DROPDOWN = Target.the("Province dropdown")
            .located(By.id("checkout_shipping_address_country"));


    // Payment Process
    
    public static final Target CREDIT_CARD_INPUT = Target.the("Credit card input field")
            .located(By.cssSelector("input[data-current-field='number']"));

    public static final Target NAME_ON_CARD_INPUT = Target.the("Name on card input field")
            .located(By.cssSelector("input[data-current-field='name']"));

    public static final Target EXPIRATION_DATE_INPUT = Target.the("Expiration date input field")
            .located(By.cssSelector("input[data-current-field='expiry']"));

    public static final Target SECURITY_CODE_INPUT = Target.the("Security code input field")
            .located(By.cssSelector("input[data-current-field='verification_value']"));

    // Purchase Confirmation

    public static final Target TOTAL_LABEL = Target.the("Total Label")
            .located(By.cssSelector("span.payment-due-label__total"));

    public static final Target SPACEX_LOGO_IMAGE = Target.the("SpaceX Logo Image")
            .located(By.cssSelector("img.Header__LogoImage.Header__LogoImage--primary"));


}
