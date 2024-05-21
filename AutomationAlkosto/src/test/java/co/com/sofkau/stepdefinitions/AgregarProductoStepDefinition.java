package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.sofkau.questions.ObtenerMensajeDeProductoAgregado.obtenerMensajeDeProductoAgregado;
import static co.com.sofkau.tasks.AgregarProducto.buscarProducto;
import static co.com.sofkau.tasks.NavegarAPaginaPrincipal.navegarAPaginaPrincipal;
import static co.com.sofkau.tasks.SeleccionarProductoPorPosicion.seleccionarProductoPorPosicion;
import static co.com.sofkau.ui.constantes.ConstanteMensajeDeConfirmacion.Mensaje_esperado_de_producto_agregado;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AgregarProductoStepDefinition extends Setup {
    @When("navega a la pagina principal y busca el producto deseado {string}")
        public void navegaALaPaginaPrincipaYBuscaElProductoDeseado(String producto){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAPaginaPrincipal(),
                    buscarProducto().conElProducto(producto)
            );
        } catch (Exception e) {
            System.err.println("Error al navegar a la página principal o buscar el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @When ("selecciona el producto en la posicion {int}")
    public void seleccionaLosProductos(Integer posicionDeProducto){
        try {
            theActorInTheSpotlight().attemptsTo(
                    seleccionarProductoPorPosicion()
                            .conElProductoEnPosicion(posicionDeProducto)
            );
        } catch (Exception e) {
            System.err.println("Error al seleccionar el producto en la posición " + posicionDeProducto + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Then("entonces deberia visualizar un mensaje que confirme que se agrego el producto satisfactoriamente")
    public void entoncesDeberiaVisualizarUnMensajeConLaInformacionDeSuOrden(){
        try {
            theActorInTheSpotlight().should(
                    seeThat(obtenerMensajeDeProductoAgregado(), equalTo(Mensaje_esperado_de_producto_agregado))
            );
        } catch (Exception e) {
            System.err.println("Error al verificar el mensaje de confirmación del producto agregado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
