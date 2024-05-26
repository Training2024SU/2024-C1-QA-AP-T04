package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageTarjeta extends PageObject {
    public static final Target CAMPO_NUMERO_TARJETA = Target
            .the("campo numero tarjeta")
            .located(By.xpath("//*[@name='addCreditCardNumber']"));
    public static final Target CAMPO_NOMBRE_EN_TARJETA = Target
            .the("campo nombre en la tarjeta")
            .located(By.xpath("//*[@name='ppw-accountHolderName']"));
    public static final Target MES_DE_VENCIMIENTO = Target
            .the("campo mes de vencimiento")
            .located(By.xpath("(//*[@class='a-button-text a-declarative']/..)[1]"));
    public static final Target SELECCION_MES_DE_VENCIMIENTO = Target
            .the("campo seleccion mes de vencimiento")
            .located(By.xpath("(//*[@class='a-dropdown-item'])[4]"));
    public static final Target ANNO_DE_VENCIMIENTO = Target
            .the("campo año de vencimiento")
            .located(By.xpath("(//*[@class='a-button-text a-declarative']/..)[2]"));
    public static final Target SELECCION_ANNO_DE_VENCIMIENTO = Target
            .the("campo seleccion año de vencimiento")
            .located(By.xpath("(//*[@class='a-dropdown-item'])[15]"));
    public static final Target CODIGO_SEGURIDAD = Target
            .the("campo codigo seguridad")
            .located(By.xpath("//*[@name='addCreditCardVerificationNumber']"));
    public static final Target GUARDAR_FUTURAS_COMPRAS = Target
            .the("boton no guardar futuras compras")
            .located(By.xpath("(//*[@name='ppw-storageConsent']/..)[2]"));
    public static final Target ANADIR_TARJETA = Target
            .the("boton añadir tarjeta")
            .located(By.xpath("//*[@name='ppw-widgetEvent:AddCreditCardEvent']"));
}

