package co.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.StaleElementReferenceException;
import static co.com.sofkau.ui.PaginaInformacionAutenticacion.BOTON_CONTINUAR_AUTENTICACION_INFORMACION;
import static co.com.sofkau.ui.PaginaInformacionAutenticacion.CAMPO_EMAIL_INFORMACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AutenticarseAlPagar implements Task {
    String correo_registrado;

    public AutenticarseAlPagar conElCorreoRegistrado(String correo_registrado){
        this.correo_registrado = correo_registrado;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int retries = 10;

        while(retries > 0){
            try {
                actor.attemptsTo(
                        WaitUntil.the(CAMPO_EMAIL_INFORMACION, isVisible()).forNoMoreThan(10).seconds()
                );
                actor.attemptsTo(
                        Enter.theValue(correo_registrado).into(CAMPO_EMAIL_INFORMACION),
                        Click.on(BOTON_CONTINUAR_AUTENTICACION_INFORMACION)
                );
                break;
            } catch (StaleElementReferenceException e) {
                retries--;
                System.out.println("Elemento no disponible, reintentando... Intentos restantes: " + retries);
                if (retries == 0) {
                    throw e;
                }
            }
        }
    }
    public static AutenticarseAlPagar autenticarseAlPagar(){
        return new AutenticarseAlPagar();
    }
}
