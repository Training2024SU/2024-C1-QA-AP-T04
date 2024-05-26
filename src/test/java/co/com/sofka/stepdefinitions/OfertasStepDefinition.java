package co.com.sofka.stepdefinitions;

import co.com.sofka.models.FormularioTarjeta;
import co.com.sofka.stepdefinitions.setup.SetupPage;
import co.com.sofka.utils.CrearTarjeta;
import io.cucumber.java.es.Cuando;

import static co.com.sofka.tasks.pages.AgregarCesta.agregarCesta;
import static co.com.sofka.tasks.pages.LlenarTarjeta.llenarTarjeta;
import static co.com.sofka.tasks.pages.NavegarCesta.navegarCesta;
import static co.com.sofka.tasks.pages.NavegarInformatica.navegarInformatica;
import static co.com.sofka.tasks.pages.SeleccionarProductosInformatica.seleccionarProductosInformatica;
import static co.com.sofka.tasks.pages.TramitarPedido.tramitarPedido;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OfertasStepDefinition extends SetupPage {
    @Cuando("selecciona los productos finalizando su compra")
    public void seleccionaLosProductosFinalizandoSuCompra() {
        FormularioTarjeta datosTarjeta = CrearTarjeta.crearTarjeta();
        theActorInTheSpotlight().wasAbleTo(
                navegarInformatica(),
                seleccionarProductosInformatica(),
                agregarCesta(),
                navegarCesta(),
                tramitarPedido(),
                llenarTarjeta().conLaTarjeta(datosTarjeta)
        );
    }
}
