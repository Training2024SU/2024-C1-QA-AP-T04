package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaPage extends PageObject {

    public static final Target DESPLEGABLE_ORDERBY = Target.
            the("Categorias de ordenado").
            located(By.id("testId-Dropdown-desktop-button"));

    public static final Target ORDENAR_PRECIO_DESCENDENTE = Target.
            the("Boton ordenar precio mayor a menor").
            located(By.id("testId-Dropdown-Precio de mayor a menor"));

    public static final Target PRIMER_ITEM_BUSQUEDA = Target.
            the("Primer elemento de la busqueda").
            located(By.xpath("(//div[@id='testId-searchResults-products']/child::div)[1]"));

    public static final Target ICONO_CARRITO = Target.
            the("Botom de Carrito").
            located(By.id("testId-UserAction-basket"));

}
