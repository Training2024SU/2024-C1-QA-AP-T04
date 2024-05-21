package co.com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class PaginaDireccionDeEnvio extends PageObject {
    public static final Target SELECCIONAR_TIPO_DE_DOCUMENTO = Target.
            the("campo tipo de documento").located(By.
                    xpath("//div[@class ='float-select js-float-select js-float-group float-small']"));
    public static final Target SELECCIONAR_DOCUMENTO = Target.
            the("campo tipo de documento").located(By.
                    xpath("//div[@class = 'float-select--list js-float-list open']//li[@data-value= 'CC']"));
    public static final Target CAMPO_DOCUMENTO_IDENTIDAD = Target.
            the("campo documento de identidad").located(By.
                    xpath("//input[@name='idNumber']"));
    public static final Target SELECCIONAR_LISTA_DEPARTAMENTO = Target.
            the("seleccionar departamento").located(By.
                    xpath("//label[@for='address.provinceCode']/../.."));
    public static final Target SELECCIONAR_DEPARTAMENTO = Target.
            the("seleccionar departamento").located(By.
                    xpath("//div[@class= 'float-select--list js-float-list open']//li[contains(text(), 'Choco')]"));
    public static final Target SELECCIONAR_LISTA_CIUDAD = Target.
            the("seleccionar ciudad").located(By.
                    xpath("//label[@for='address.cityCode']"));
    public static final Target SELECCIONAR_CIUDAD = Target.
            the("seleccionar departamento").located(By.
                    xpath("//div[@class= 'float-select--list js-float-list open']//li[contains(text(), 'Quibdo')]"));
    public static final Target CAMPO_DIRECCION = Target.
            the("campo direccion de envio").located(By.
                    xpath("//input[@id= 'addressLine1']"));
    public static final Target CAMPO_BARRIO = Target.
            the("campo barrio de envio").located(By.
                    xpath("//input[@id= 'addressDistrict']"));
    public static final Target BOTON_CONTINUAR_DIRECCION_ENVIO= Target.
            the("boton continuar").located(By.
                    id("continueAddress"));
}
