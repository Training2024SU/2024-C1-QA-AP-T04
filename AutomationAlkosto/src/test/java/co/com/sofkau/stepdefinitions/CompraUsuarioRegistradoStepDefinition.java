package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.sofkau.questions.ObtenerMensajeDeOrdenRealizada.obtenerMensajeDeOrdenRealizada;
import static co.com.sofkau.tasks.AgregarProducto.buscarProducto;
import static co.com.sofkau.tasks.AutenticarseAlPagar.autenticarseAlPagar;
import static co.com.sofkau.tasks.ConfirmarMetodoDeEnvio.confirmarMetodoDeEnvio;
import static co.com.sofkau.tasks.ConfirmarRevisionYAprobacion.confirmarRevisionYAprobacion;
import static co.com.sofkau.tasks.IrAPagar.irAPagar;
import static co.com.sofkau.tasks.IrAPagarCarritoDesdeModal.irAPagarCarritoDesdeModal;
import static co.com.sofkau.tasks.LlenarAutenticacionPasswordRegistrado.llenarAutenticacionPasswordRegistrado;
import static co.com.sofkau.tasks.LlenarDireccionDeEnvio.llenarDireccionDeEnvio;
import static co.com.sofkau.tasks.LlenarNumeroDocumento.llenarNumeroDocumento;
import static co.com.sofkau.tasks.NavegarALogin.navegarALogin;
import static co.com.sofkau.tasks.SeleccionarFormaDePago.seleccionarFormaDePago;
import static co.com.sofkau.tasks.SeleccionarProductoPorPosicion.seleccionarProductoPorPosicion;
import static co.com.sofkau.ui.constantes.ConstanteMensajeDeConfirmacion.Mensaje_esperado_de_orden_realizada;
import static co.com.sofkau.ui.constantes.ConstanteUsuarioRegistrado.*;
import static co.com.sofkau.utils.Util.crearDireccionDeEnvio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraUsuarioRegistradoStepDefinition extends Setup {

    @Given("busca el producto {string} deseado")
    public void navegaALaPaginaPrincipalSeleccionandoElProductoDeseado(String producto){
        try {
            theActorInTheSpotlight().attemptsTo(
                    buscarProducto().conElProducto(producto)
            );
        } catch (Exception e) {
            System.err.println("Error al buscar el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Given ("selecciona el producto que se encuentra en la posicion {int}")
    public void seleccionaElProductoQueSeEncuentraEnLaPosicion(Integer posicionDeProducto){
        try {
            theActorInTheSpotlight().attemptsTo(
                    seleccionarProductoPorPosicion()
                            .conElProductoEnPosicion(posicionDeProducto),
                    irAPagarCarritoDesdeModal(),
                    irAPagar()
            );
        } catch (Exception e) {
            System.err.println("Error al autenticarse con los datos correctamente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Given("se autentica e ingresa sus datos correctamente")
    public void seAutenticaEIngresaSusDatosCorrectamente(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    autenticarseAlPagar()
                            .conElCorreoRegistrado(nuevo_correo_registrado),
                    navegarALogin(),
                    llenarAutenticacionPasswordRegistrado()
                            .conElPasswordRegistrado(nuevo_password_registrado)
            );
        } catch (Exception e) {
            System.err.println("Error al autenticarse con los datos correctamente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @When ("confirma los productos llenando los formularios requeridos para el envio")
    public void confirmaLosProductosLLenandoLosFormulariosParaElEnvio(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    llenarNumeroDocumento().conElDocumento(crearDireccionDeEnvio()),
                    llenarDireccionDeEnvio().conLaDireccion(crearDireccionDeEnvio()),
                    confirmarMetodoDeEnvio(),
                    seleccionarFormaDePago(),
                    confirmarRevisionYAprobacion()
            );
        } catch (Exception e) {
            System.err.println("Error al navegar a la página principal o buscar el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    @Then ("deberia visualizar un mensaje confirmando la orden de compra")
    public void entoncesDeberiaVisualizarUnMensajeConfirmandoLaOrden(){
        try {
            theActorInTheSpotlight().should(
                    seeThat(obtenerMensajeDeOrdenRealizada(), equalTo(Mensaje_esperado_de_orden_realizada))
            );
        } catch (Exception e) {
            System.err.println("Error al verificar el mensaje esperado de orden realizada: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
