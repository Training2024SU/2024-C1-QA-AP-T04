package co.com.sofka.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;



public class PageSearch extends PageObject {

    //public static Target CELDAS_PRODUCTOS = Target.the("Celdas de productos").located(By.xpath("//div[@class='jsx-2096706859 product ie11-product-container']"));
    public static Target CELDAS_PRODUCTOS = Target.the("Celdas de productos").located(By.xpath("//div[contains(@class, 'jsx-165692325') and contains(@class, 'jsx-2813139842') and contains(@class, 'normal-class')]\n"));
    public static Target CARRITO_DE_COMPRAS = Target.the("Ir al carrito de compras").located(By.id("mini-cart"));





  //  public List<WebElementFacade> BotonesProductos = LISTA_PRODUCTOS.resolveAllFor(getDriver());


}
