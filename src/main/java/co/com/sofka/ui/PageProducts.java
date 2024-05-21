package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageProducts extends PageObject {
    public static final Target productSale = Target.
            the("Producto en liquidación").located(By.xpath("(//div[@id='gallery-layout-container']//div[contains(@class,'vtex-search-result')])[3]//section"));

    public static final Target colorProduct = Target.
            the("Color del producto").located(By.xpath("(//p[contains(text(),'Color')]/ancestor::div[contains(@class,'similar-container')]//button)[1]"));

    public static final Target addToCartButton = Target.
            the("Botton agregar al carrito").located(By.xpath("//span[contains(@class,'add-to-cart')]"));

    public static final Target incrementProductButton = Target.
            the("Aumentar cantidad de producto carrito").located(By.xpath("//button[contains(@class,'button-increase')]"));

    public static final Target continueCompraButton = Target.
            the("Botón carrito finalizar compra").located(By.id("cart-to-orderform"));

    public static final Target goToCart = Target.
            the("Botton finalizar compra que lleva al carrito").located(By.xpath("//div[contains(text(),'checkout')]"));

}
