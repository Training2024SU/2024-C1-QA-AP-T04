package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import static co.com.sofkau.ui.PaginaCarritoDeCompras.CAMPO_CANTIDAD_PRODUCTO_AGREGADO;
import static co.com.sofkau.ui.PaginaDireccionDeEnvio.CAMPO_DOCUMENTO_IDENTIDAD;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProcesoDePagoStepDefinition extends Setup {

    @When("el usuario llena la informacion de envio para el pago")
    public void completarInformacionoDeEnvio() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    SelectFromOptions.byValue("CC").from(CAMPO_CANTIDAD_PRODUCTO_AGREGADO),
                    SendKeys.of("1128441794").into(CAMPO_DOCUMENTO_IDENTIDAD)
            );
        } catch (Exception e) {
            System.err.println("Error al completar la información de envío: " + e.getMessage());
            e.printStackTrace();
        }
    }
}