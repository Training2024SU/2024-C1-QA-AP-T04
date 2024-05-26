package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageTramitarPedido extends PageObject {

    public static final Target BOTON_CAMBIAR_DIRECCION = Target
            .the("boton cambiar a esta direccion")
            .located(By.xpath("//*[@id=\"addressChangeLinkId\"]"));

    public static final Target BOTON_ENVIAR_DIRECCION = Target
            .the("boton enviar a esta direccion")
            .located(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span"));

    public static final Target BOTON_AGREGAR_TARJETA = Target
            .the("boton añadir una tarjeta de credito")
            .located(By.xpath("//*[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));

}
