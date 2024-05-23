package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class PageMonky extends PageObject {

    public static final Target SECCION_MUJER = Target
            .the("seccion Tenis para Mujer")
            .located(By.xpath("//*[@id=\"HeaderMenu-tenis-para-mujer\"]/span"));

    public static final Target SELECCIONAR_PRODUCTO =  Target.the("Tenis para Mujer")
            .located(By.xpath("//*[@id=\"CardLink-template--21209849463105__product-grid-9147265679681\"]"));

    public static final Target SECCION_TOPS = Target
            .the("seccion Tops")
            .located(By.xpath("//*[@id=\"HeaderMenu-tops\"]"));

    public static final Target SELECCIONAR_PRODUCTO_TOPS =  Target.the("Seleccionar Tops")
            .located(By.xpath("//*[@id=\"CardLink-template--21209849463105__product-grid-8972741640513\"]"));

    public static final Target CAMPO_TALLA = Target
            .the("Campo talla")
            .located(By.xpath("//*[@id=\"variant-radios-template--21209849889089__main\"]/fieldset/label[3]"));

    public static final Target CAMPO_CANTIDAD = Target
            .the("Campo cantidad")
            .located(By.xpath("//*[@id=\"Quantity-Form-template--21209849889089__main\"]/div[1]/quantity-input/button[2]"));

    public static final Target BOTON_AGREGAR_AL_CARRITO = Target
            .the("Botón agregar al carrito")
            .located(By.xpath("//*[@id=\"ProductSubmitButton-template--21209849889089__main\"]"));

    public static final Target BOTON_VER_CARRITO = Target.the("Botón ver carrito")
            .located(By.xpath("//*[@id=\"cart-icon-bubble\"]/div/span[1]"));

    public static final Target BOTON_PAGAR_PEDIDO = Target.the("Botón pagar pedido")
            .located(By.xpath("//*[@id=\"checkout\"]"));

}

