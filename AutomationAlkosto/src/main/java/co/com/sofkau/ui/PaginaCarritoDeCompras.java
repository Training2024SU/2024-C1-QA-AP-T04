package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;


public class PaginaCarritoDeCompras extends PageObject {
    public static final Target CARRITO_DE_COMPRAS = Target.
            the("boton carrito de compras").located(By.
                    id("js-mycart-header"));
    public static final Target CAMPO_CANTIDAD_PRODUCTO_AGREGADO = Target.
            the("campo cantidad del carrito de compras").located(By.
                    xpath("(//span[@class = 'plain-select']/select)[1]"));

    public static final Target BOTON_IR_A_PAGAR = Target.
            the("modal del carrito de compras").located(By.
                    id("js-go-to-pay"));

    public static final Target MENSAJE_CANTIDAD_MODIFICADA_EXITOSAMENTE = Target.
            the("modal del carrito de compras").located(By.
                    xpath("/html/body/main/section/div[1]/div/div[1]/div/div[1]"));

}
