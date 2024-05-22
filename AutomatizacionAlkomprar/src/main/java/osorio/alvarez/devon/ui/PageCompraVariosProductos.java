package osorio.alvarez.devon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageCompraVariosProductos {
    public static final Target OPTION_MAIL_PASSWORD = Target
            .the("Option mail password")
            .located(By.xpath("//*[@id='js-loginEmailPass']/div"));
    public static final Target CAMPO_PASSWORD = Target
            .the("campo password")
            .located(By.id("j_password"));
    public static final Target BOTON_INICIAR_SESION = Target
            .the("boton iniciar sesion")
            .located(By.cssSelector("button[class='button-primary js-login-email-password']"));
public static final Target OPTION_ADD_CARRITO_1 = Target
            .the("boton agregar al carrito")
            .located(By.xpath("//*[@id='js-add-cart-6941812762721']/i"));
public static final Target OPTION_CONTINUAR_COMPRANDO = Target
            .the("opcion continuar comprando")
            .located(By.xpath("//span[text()='Continuar comprando']"));
public static final Target OPTION_ADD_CARRITO_2 = Target
            .the("boton agregar al carrito")
            .located(By.id("js-add-cart-6941812758915"));
public static final Target CAMPO_BUSQUEDA_ALTERNO = Target
            .the("campo busqueda")
            .located(By.xpath("//*[@id='search-input']/input"));
public static final Target OPTION_ADD_CARRITO_3 = Target
            .the("producto")
            .located(By.cssSelector("button[id='js-add-cart-195161814662']"));
public static final Target BOTON_IR_CARRITO_PAGAR = Target
            .the("boton ir a pagar")
            .located(By.xpath("//*[@id='js-cart-modal']/div/div/div[3]/a"));

}
