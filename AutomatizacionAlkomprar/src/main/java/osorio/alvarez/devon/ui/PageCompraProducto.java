package osorio.alvarez.devon.ui;

import net.datafaker.Faker;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Locale;
import java.util.Random;

public class PageCompraProducto {
    public static final Target BUTTON_MY_ACCOUNT = Target.
            the("Boton mi cuenta").located(By.id("js-myaccount-header"));
    public static final Target CAMPO_EMAIL_REGISTER = Target.
            the("campo email").located(By.id("js-login-email"));
    public static final Target BOTON_CONTINUAR_REGISTRO = Target.
            the("boton continuar").located(By.id("js-login-continue"));
    public static final Target CAMPO_NOMBRE_REGISTRO = Target.
            the("campo nombre").located(By.id("register.firstName"));
    public static final Target CAMPO_APELLIDO_REGISTRO = Target.
            the("campo apellido").located(By.id("register.lastName"));
    public static final Target CAMPO_TELEFONO_REGISTRO = Target.
            the("campo telefono").located(By.id("register.mobileNumber"));
    public static final Target CHECK_TERMINOS = Target.
            the("campo terminos y condiciones").located(By.cssSelector("label[for='registerChkTermsConditions']"));
    public static final Target BOTON_CONTINUAR_FIN_REGISTRO = Target.
            the("boton continuar registro").located(By.cssSelector("button[class='button-primary btn-block js-btn-register-myaccount']"));
    public static final Target CAMPO_BUSQUEDA_PRODUCTO = Target.
            the("campo busqueda producto").located(By.id("js-site-search-input"));
    public static final Target SCROLL_TEXT_PRODUCT = Target.
            the("scroll a producto").located(By.id("js-stats"));
    public static final Target PRODUCTO = Target.
            the(" producto").located(By.cssSelector("form[id='addToCartForm7705946478144']"));
    public static final Target IR_AL_CARRITO = Target.
            the(" ir a carrito ").located(By.cssSelector("a[class='button-primary cart-pop-up-warrantyFooter_cartRedirect js-warrantyRedirect-overlay js-sf-go-to-cart js-animateBeforeSend']"));
    public static final Target BOTON_IR_A_PAGAR = Target.
            the(" boton ir a pagar ").located(By.id("js-go-to-pay"));
    public static final Target CAMPO_TIPO_DOCUMENTO = Target.
            the(" campo tipo documento ").located(By.xpath("//*[@id='i18nAddressForm']/div[1]/div[1]/div[1]/div/div"));
    public static final Target SELECT_TIPO_DOCUMENTO = Target.
            the(" select tipo documento ").located(By.xpath("//*[@id='i18nAddressForm']/div[1]/div[1]/div[1]/div/div/div[2]/ul/li[2]"));
    public static final Target CAMPO_NUMERO_DOCUMENTO = Target.
            the(" campo numero documento ").located(By.id("address.idNumber"));
    public static final Target CAMPO_DEPARTAMENTO = Target.
            the(" campo departamento ").located(By.xpath("//*[@id='i18nAddressForm']/div[1]/div[5]/div[1]/div/div"));
    public static final Target SELECT_DEPARTAMENTO = Target.
            the(" select departamento ").located(By.xpath("//*[@id='i18nAddressForm']/div[1]/div[5]/div[1]/div/div/div/div[2]/ul/li[" + escogerDepartamento() + "]"));
    public static final Target CAMPO_DIRECCION = Target.
            the("campo direccion ").located(By.id("addressLine1"));
    public static final Target CAMPO_BARRIO = Target.
            the("campo barrio ").located(By.id("addressDistrict"));
    public static final Target CHECK_GUARDAR_DIRECCION = Target.
            the("check guardar direccion ").located(By.xpath("//div[text()=' Guardar dirección de envío ']"));
    public static final Target BOTON_CONTINUAR_PAGO = Target.
            the("boton continuar pago").located(By.cssSelector("button[id='continueAddress']"));
    public static final Target CHECK_CONFIRMAR_DIRECCION = Target.
            the("check confirmar direccion").located(By.xpath("//*[@id='new-address-sugestion']/div/div/div[2]/div[3]/div[2]/div/div[1]"));
    public static final Target BOTON_CONFIRMAR_DIRECCION = Target.
            the("boton confirmar direccion").located(By.xpath("//button[text()='Confirmar Dirección']"));
    public static final Target BOTON_METODO_ENVIO_CONTINUAR = Target.
            the("boton continuar").located(By.xpath("//*[@id='deliveryMethodSubmit']"));
    public static final Target CAMPO_METODO_DE_PAGO = Target.
            the("campo metodo pago").located(By.xpath("//*[@id='payment-method-tabs']/ul[2]/li[8]/a"));
    public static final Target CAMPO_SELECT_PAGO = Target.
            the("campo metodo pago").located(By.cssSelector("label[for='efecty'][class='custom-radio__label']"));
    public static final Target BOTON_CONTINUAR_REVISAR_PEDIDO = Target.
            the("boton continuar y revisar pedido").located(By.xpath("//*[@id='payment-method-tabs']/div/div[8]/div/div/div[4]/button"));
    public static final Target BOTON_GENERAR_RECIBO_PAGO = Target.
            the("boton continuar").located(By.xpath("//button[text()=' Continuar']"));
    public static final Target RECIBO_PAGO = Target.
            the("recibo pago").located(By.xpath("//p[text()='Ver mi recibo de pago']"));


    public static String escogerDepartamento() {
        Random random = new Random();
        String departamento = String.valueOf(random.nextInt((31 - 5) + 1) + 5);
        return departamento;
    }

    public static String direccion() {
        Random random = new Random();
        String numCalle = String.valueOf(random.nextInt((99 - 10) + 1) + 10);
        String numCarrera = String.valueOf(random.nextInt((50 - 1) + 1) + 1);
        String numCasa = String.valueOf(random.nextInt((50 - 1) + 1) + 1);
        String direccion = "Calle " + numCalle + " # " + numCarrera + " - " + numCasa;
        return direccion;
    }

    public static String barrio(){
        Faker faker = new Faker(new Locale("es"));
        String nombreBarrio = faker.address().cityName();
        return nombreBarrio;
    }

}
