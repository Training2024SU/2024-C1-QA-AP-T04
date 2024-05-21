package co.com.sofka.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageCarrito extends PageObject {

    public static final Target CONTINUAR_COMPRA = Target.
            the("Continuar compra en carrito").located(By.xpath("//div[@class='jsx-2312483786 btn-container']"));
    public static final Target BTN_CERRAR_ALERTA_CARRITO_ID = Target.
            the("cerrar alerta que sale despues de confirmar carrito").located(By.id("close-button-1545222288830"));
    public static final Target BTN_CONTINUAR_COMO_INVITADO = Target.
            the("boton para continuar como invitado").located(By.xpath("//button[@id='testId-btn-no-action-btn']"));
    public static final Target SELECCIONAR_DEPARTAMENTO = Target.
            the("despiegla la lista de departamento").
            located(By.id("testId-Dropdown-testId-addressform-state-dropdown-value"));
    public static final Target SELECCIONAR_PRIMER_DEPARTAMENTO = Target.
            the("selecciono departamento").
            located(By.id("testId-li-testId-DropdownList-testId-Dropdown-testId-addressform-state-dropdown-dropdown-list-item-0"));
    public static final Target SELECCIONAR_CIUDAD = Target.
            the("Despliega la lista de ciudad").
            located(By.id("testId-Dropdown-testId-addressform-zone-dropdown-value"));
    public static final Target SELECCIONAR_PRIMER_CIUDAD = Target.
            the("selecciono departamento").
            located(By.id("testId-li-testId-DropdownList-testId-Dropdown-testId-addressform-zone-dropdown-dropdown-list-item-0"));
    public static final Target INPUT_DEPARTAMENTO_CIUDAD_CALLE = Target.
            the("escribe ciudad o departamento o calle").located(By.id("testId-input-dropdown-search-box"));
    public static final Target SELECCIONAR_CALLE = Target.
            the("Despliega la lista de ciudad").
            located(By.id("testId-Dropdown-testId-addressform-adressline1-type-value"));
    public static final Target SELECCIONAR_PRIMER_CALLE = Target.
            the("selecciono departamento").
            located(By.id("testId-li-testId-DropdownList-testId-Dropdown-testId-addressform-adressline1-type-dropdown-list-item-0"));
    public static final Target ESCRIBIR_NUMERO_CALLE = Target.
            the("selecciono calle").located(By.id("testId-testId-addressform-addressline1-input"));
    public static final Target NUMERO_DIRECCION1 = Target.
            the("Escribe primer numero").located(By.id("testId-testId-addressform-numberAddress1-input"));
    public static final Target NUMERO_DIRECCION2 = Target.
            the("Escribe segundo numero").located(By.id("testId-testId-addressform-numberAddress2-input"));
    public static final Target BTN_USA_DIRECCION = Target.
            the("boton de usar esta direccion").located(By.id("testId-btn-testId-addressform-useAddressBtn"));

}
