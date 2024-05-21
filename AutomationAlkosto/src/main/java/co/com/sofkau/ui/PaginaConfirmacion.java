package co.com.sofkau.ui;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaConfirmacion extends PageObject {
    public static final Target MENSAJE_CONFIRMACION_INICIO_SESION = Target.the("mensaje de confirmacion inicio de sesion despues de registro")
            .located(By.xpath("//h4[contains(text(),'Mi perfil')]"));

    public static final Target MENSAJE_CONFIRMACION_LOGIN = Target.the("mensaje de confirmacion inicio de sesion despues de login")
            .located(By.xpath("//li[@id='js-myaccount-header']"));

    public static final Target MENSAJE_CONFIRMACION_PRODUCTO_AGREGADO = Target.the("mensaje de confirmacion producto agregado exitosamente")
            .located(By.xpath("//div[@class='sucess-message sucess-message-alkosto']"));

}
