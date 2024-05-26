package co.com.sofka.stepdefinitions;

import co.com.sofka.models.FormularioTarjeta;
import co.com.sofka.stepdefinitions.setup.SetupPage;
import co.com.sofka.utils.CrearTarjeta;
import io.cucumber.java.es.Cuando;

import static co.com.sofka.tasks.pages.AgregarCesta.agregarCesta;
import static co.com.sofka.tasks.pages.BuscarProducto.buscarProducto;
import static co.com.sofka.tasks.pages.LlenarTarjeta.llenarTarjeta;
import static co.com.sofka.tasks.pages.NavegarCesta.navegarCesta;
import static co.com.sofka.tasks.pages.SeleccionarProductosBuscados.seleccionarProductosBuscados;
import static co.com.sofka.tasks.pages.TramitarPedido.tramitarPedido;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaStepDefinition extends SetupPage {
    @Cuando("busca los productos {string} finalizando su compra")
    public void buscaLosProductosFinalizandoSuCompra(String nombreProducto) {
        FormularioTarjeta datosTarjeta = CrearTarjeta.crearTarjeta();
        theActorInTheSpotlight().wasAbleTo(
                buscarProducto().por(nombreProducto),
                seleccionarProductosBuscados(),
                agregarCesta(),
                navegarCesta(),
                tramitarPedido(),
                llenarTarjeta().conLaTarjeta(datosTarjeta)
        );
    }
}
