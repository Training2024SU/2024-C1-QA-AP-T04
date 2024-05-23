package co.com.sofka.stepdefinitions;

import co.com.sofka.stepdefinitions.setup.SetupPage;
import co.com.sofka.tasks.pages.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.questions.ConfirmacionCompra.confirmacionCompra;
import static co.com.sofka.tasks.pages.LlenarFormularioEntregaYPago.llenarFormularioEntregaYPago;
import static co.com.sofka.tasks.pages.VerificarOrdenDeCompra.verificarOrdenDeCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class ProcesoDeCompraTopsStepDefinition extends SetupPage {

    @Cuando("navega a la seccion de {string}")
    public void navegaALaSeccionDe(String seccionTops) {
        theActorInTheSpotlight().attemptsTo(
                NavegaAlProductoTops.aLaSeccionTops(seccionTops));

    }

    @Cuando("selecciona los tops para mujer con la cantidad deseada")
    public void seleccionaLosTopsParaMujerConLaCantidadDeseada() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTops.enLaSeccionTops()
        );

    }

    @Cuando("agrega los tops al carrito confirmando la compra")
    public void agregaLosTopsAlCarritoConfirmandoLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.alCarrito(),
                VerCarrito.verCarrito(),
                PagarPedido.pagarPedido());
    }

    @Cuando("llena el formulario de pago y entrega con el correo electronico {string} y el nombre {string}")
    public void llenaElFormularioDePagoYEntregaConElCorreoElectronicoYElNombre(String correoElectronico, String nombre) {
        theActorInTheSpotlight().attemptsTo(
                llenarFormularioEntregaYPago(),
                verificarOrdenDeCompra()
        );
    }

    @Entonces("deberia visualizar un mensaje con la informacion de la orden")
    public void deberiaVisualizarUnMensajeConLaInformacionDeLaSuOrden() {
        String expectedMessage = String.format("Gracias por usar nuestro servicio");
        theActorInTheSpotlight().should(
                seeThat(confirmacionCompra(), containsString(expectedMessage))

        );
    }
}

