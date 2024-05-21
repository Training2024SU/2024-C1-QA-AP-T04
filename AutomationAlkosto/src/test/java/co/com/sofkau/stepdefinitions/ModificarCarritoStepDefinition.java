package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;

import static co.com.sofkau.questions.ObtenerMensajeCarritoModificado.obtenerMensajeCarritoModificado;
import static co.com.sofkau.tasks.ModificarCantidadProductoAgregado.modificarCantidadProductoAgregado;
import static co.com.sofkau.tasks.IrAPagarCarritoDesdeModal.irAPagarCarritoDesdeModal;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ModificarCarritoStepDefinition extends Setup {

    @When("modifica la cantidad {int} del producto agregado")
    public void modificaLaCantidadDelProductoAgregado(Integer cantidadDeseadaDelProducto){
        try {
            theActorInTheSpotlight().attemptsTo(
                    irAPagarCarritoDesdeModal(),
                    modificarCantidadProductoAgregado().conLaCantidad(cantidadDeseadaDelProducto)
            );
        } catch (Exception e) {
            System.err.println("Error al modificar la cantidad del producto agregado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Then("entonces deberia visualizar un mensaje que confirme que se modifico la cantidad del producto exitosamente")
    public void entoncesDeberiaVisualizarUnMensajeQueConfirmeQueSeModificoLaCantidadDelProducto(){
        try {
            theActorInTheSpotlight().should(
                    seeThat(obtenerMensajeCarritoModificado(), CoreMatchers.notNullValue())
            );
        } catch (Exception e) {
            System.err.println("Error al verificar el mensaje de confirmación de cantidad modificada: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
