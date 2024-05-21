package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaListaDeProducto extends PageObject {
    public static final Target MODAL_CARRITO_DE_COMPRAS = Target.
            the("modal del carrito de compras").located(By.
                    xpath("//*[contains(text(), 'Ir al carrito y pagar')]"));

    public static Target retornarProductos(int posicionDeProducto){
        String productoAComprar = "(//div[@class='product__item__information']//button)[%s]";
        productoAComprar = String.format(productoAComprar, posicionDeProducto);

        return Target.
                the("shopping cart").located(org.openqa.selenium.By.
                        xpath(productoAComprar));
    }
}
