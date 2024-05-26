package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageProducto extends PageObject {
    public static final Target BOTON_AGREGAR_CESTA = Target
            .the("boton agregar a la cesta")
            .located(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    public static final Target BOTON_NAVEGAR_CESTA = Target
            .the("boton navegar a la cesta")
            .located(By.xpath("//*[@id=\"sw-gtc\"]/span"));
    public static final Target BOTON_TRAMITAR_PEDIDO = Target
            .the("boton tramitar pedido")
            .located(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span"));
}
