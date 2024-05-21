package garcia.juan.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EnvioPage extends PageObject {

    public static final Target DROPDOWN_DEPARTAMENTO = Target.
            the("Boton para desplegar departamentos").
            located(By.xpath("//*[@placeholder='Selecciona un Departamento']/ancestor::button[@data-testid='testId-ExtendedDropdown']"));

    public static final Target SELECCION_DEPARTAMENTO = Target.
            the("departamento seleccionado").
            located(By.id("testId-Dropdown-ANTIOQUIA"));

    public static final Target DROPDOWN_CIUDAD = Target.
            the("Boton para desplegar ciudades").
            located(By.xpath("//*[@placeholder='Selecciona una Ciudad']/ancestor::button[@data-testid='testId-ExtendedDropdown']"));

    public static final Target DROPDOWN_BARRIO = Target.
            the("Boton para desplegar ciudades").
            located(By.xpath("//*[@placeholder='Selecciona un Barrio']/ancestor::button[@data-testid='testId-ExtendedDropdown']"));

    public static final Target INPUT_DIRECCION = Target.
            the("Campo para la direccion").located(By.id("testId-Input-street"));

    public static final Target BOTON_CONFIRMAR_DIRECCION1 =Target.
            the("Boton para confirmar direccion").located(By.id("testId-infoModalFooter-button"));

    public static final Target BOTON_CONFIRMAR_DIRECCION2 =Target.
            the("Boton para confirmar direccion").located(By.xpath("//button[text()='Confirmar y Guardar']"));

    public static final Target AVISO_DIRECCION_SIN_RECONOCER =Target.
            the("Aviso de que no se encontro la direccion").
            located(By.xpath("//span[@class='jsx-1832119342 body-copy-shade10-bold body-xs body-xl ' and text()='No hemos podido reconocer tu dirección.']"));

    public static final Target BOTON_IR_A_PAGAR =Target.
            the("Boton para ir a pagar").
            located(By.xpath("//button[text()='Ir a pagar']"));

    public static final Target ALERTA_DESPACHOS = Target.
            the("ALERTa").
            located(By.xpath("//div[@class='jsx-4222639790 jsx-2632970204 tooltip-message bottom cell']"));

    public static final Target ALERTA_DESPACHOS_frame = Target.
            the("ALERTa").
            located(By.xpath("//div[@class='jsx-4222639790 jsx-2632970204 tooltip-message bottom cell']"));


    public static final Target BOTON_ACEPTAR_ALERTA_DESPACHOS = Target.
            the("Alerta despachos").
            located(By.xpath("//p[text()='Entendido']"));


    public static final String SELECCION_DROPDOWN = "//*[@id='testId-Dropdown-%s']";

    public static Target AsignarPalabraXpath(String selector,String palabra){
        Target target = Target.the("Target generado").
                located(By.xpath(String.format(selector,palabra)));
        return target;
    }



}
