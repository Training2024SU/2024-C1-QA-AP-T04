package co.com.sofka.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageSeleccion extends PageObject {
    public static final Target BOTON_INFORMATICA = Target
            .the("boton informatica")
            .located(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
    public static Target retornarTargetOferta(int fila, int columna) {
        String itemComprado = "//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[%s]/div/div/div[%s]";
        itemComprado = String.format(itemComprado, fila, columna);
        return Target.the("Elementos")
                .located(By.xpath(itemComprado));
    }
    public static final Target CAMPO_BUSQUEDA = Target
            .the("campo de busqueda")
            .located(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    public static Target retornarTargetBusqueda(int posicion) {
        String itemComprado = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[%s]";
        itemComprado = String.format(itemComprado, posicion);
        return Target.the("Elementos")
                .located(By.xpath(itemComprado));
    }
    public static final Target BOTON_BUSCAR = Target
            .the("botonb buscar")
            .located(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
}
