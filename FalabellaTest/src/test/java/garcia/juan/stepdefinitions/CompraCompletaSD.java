package garcia.juan.stepdefinitions;

import garcia.juan.models.PersonaModel;
import garcia.juan.tasks.NavegarACarrito;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static garcia.juan.questions.MensajeConfirmacionSolicitud.mensajeConfirmacionSolicitud;
import static garcia.juan.tasks.AbrirPaginaInicial.abrirUrl;
import static garcia.juan.tasks.AceptarAlertaDespachos.aceptarAlertaDespachos;
import static garcia.juan.tasks.AgregarAlCarrito.agregarAlCarrito;
import static garcia.juan.tasks.ConfirmarDireccion.confirmarDireccion;
import static garcia.juan.tasks.ContinuarCompra.continuarCompra;
import static garcia.juan.tasks.EsperarConfirmacion.esperarConfirmacion;
import static garcia.juan.tasks.IngresarDireccion.ingresarDireccion;
import static garcia.juan.tasks.IrAComprar.irAComprar;
import static garcia.juan.tasks.NavegarACarrito.navegarACarrito;
import static garcia.juan.tasks.NavegarAPagar.navegarAPagar;
import static garcia.juan.tasks.NavegarARegistro.navegarARegistro;
import static garcia.juan.tasks.OrdenarMayorPrecio.ordenarMayorPrecio;
import static garcia.juan.tasks.RealizarBusqueda.realizarBusqueda;
import static garcia.juan.tasks.RegistrarPersona.registrarPersona;
import static garcia.juan.tasks.SeleccionarMetodoPago.seleccionarMetodoPago;
import static garcia.juan.tasks.SeleccionarPrimero.seleccionarPrimero;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraCompletaSD extends SetUp {
    net.datafaker.Faker faker = new net.datafaker.Faker();

    PersonaModel persona;

    @Given("que el usuario esta en la pagina inicial de Falabella en {string}")
    public void queElUsuarioEstaEnLaPaginaInicialDeFalabella(String navegador) {
        actorSetUpTheBrowser(navegador);
        theActorInTheSpotlight().wasAbleTo(
                abrirUrl("https://www.falabella.com.co/falabella-co")
        );
    }
    @Given("Se encuentra registrado y con sesion iniciada")
    public void seEncuentraRegistradoYConSesionIniciada() {
        persona = PersonaModel.crearUsuario();
        theActorInTheSpotlight().attemptsTo(
                navegarARegistro(),
                registrarPersona().conLaPersona(persona),
                irAComprar()
        );
    }
    @When("busca {string} seleccionando el mas costoso")
    public void seleccionaSusProductos(String producto) {
        theActorInTheSpotlight().attemptsTo(

                realizarBusqueda().elProducto(producto),
                ordenarMayorPrecio(),
                seleccionarPrimero(),
                agregarAlCarrito(),
                navegarACarrito(),
                continuarCompra()
        );
    }
    @When("completa su informacion de envio y pago")
    public void completaSuInformacionDeEnvioYPago() {
        theActorInTheSpotlight().attemptsTo(
                ingresarDireccion(),
                confirmarDireccion(),
                aceptarAlertaDespachos(),
                navegarAPagar(),
                seleccionarMetodoPago(),
                esperarConfirmacion()
        );
    }

    @When("busca y agrega diferentes items al carrito")
    public void buscaYAgregaDiferentesItemsAlCarrito(List<String> productos) {
        for(String item : productos){
            theActorInTheSpotlight().attemptsTo(
                    realizarBusqueda().elProducto(item),
                    seleccionarPrimero(),
                    agregarAlCarrito()
            );
        }
        theActorInTheSpotlight().attemptsTo(
                navegarACarrito(),
                continuarCompra()
        );

    }


    @Then("deberia observar un mensaje confirmando la compra")
    public void deberiaObservarUnMensajeConfirmandoLaCompra() throws InterruptedException {
        theActorInTheSpotlight().should(
                seeThat(mensajeConfirmacionSolicitud(),
                        equalTo("¡"+persona.getNombre()+", recibimos tu solicitud de compra!"))
        );
    }
}
