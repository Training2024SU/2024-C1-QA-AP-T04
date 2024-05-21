package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageProducto extends PageObject {

    public static Target BTN_AGREGAR_CARRITO = Target.the("lista de productos").
            located(By.xpath("//button[contains(@class, 'jsx-1539199139') and contains(@class, 'button') and contains(@class, 'button-primary') and contains(@class, 'jsx-441486922')]"));

    public static Target MENSAJE_AGREGADO = Target.the("Confirmacion Carrito").located(By.xpath("//span[contains(@class, 'message-text') and text()='Producto agregado al carro']"));
    public static Target CERRAR_ALERTA = Target.the("cerrar alerta de confirmacion").located(By.xpath("//span[contains(@class, 'jsx-223591986') and contains(@class, 'cs-icon-close') and contains(@class, 'modal-close')]"));
}
