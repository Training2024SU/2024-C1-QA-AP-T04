package co.com.sofka.stepdefinitions;

import co.com.sofka.models.UserModelPago;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.sofka.questions.VerificarConfirmacionCompra.verificarConfirmacionCompra;
import static co.com.sofka.taks.AbrirPaginaInicial.abrirUrl;
import static co.com.sofka.taks.AgregarAlCarrito.agregarAlCarrito;
import static co.com.sofka.taks.BuscarProducto.buscarProducto;
import static co.com.sofka.taks.ConfirmarCompra.confirmarCompra;
import static co.com.sofka.taks.IrAlCarrito.gotoCarrito;
import static co.com.sofka.taks.IrConfirmarCompra.irConfirmarCompra;
import static co.com.sofka.taks.LlenarDatosEntrega.llenarDatosEntrega;
import static co.com.sofka.taks.LlenarFormularioPago.llenarFormularioPago;
import static co.com.sofka.taks.MiniFormulario.miniFormulario;
import static co.com.sofka.taks.SeleccionMetodo.seleccionMetodo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class compraSD extends SetUp {
    @Given("el usuario esta en la pagina principal de Homecenter")
    public void elUsuarioEstaEnLaPaginaPrincipalDeHomecenter() {
        actorSetUpTheBrowser();
        theActorInTheSpotlight().wasAbleTo(
                abrirUrl("https://www.homecenter.com.co/homecenter-co/")
        );
    }

    @When("busco el producto {string}")
    public void buscoElProducto(String nombreProducto) {
        theActorInTheSpotlight().attemptsTo(
                buscarProducto().conElNombre(nombreProducto)
        );
    }

    @When("lo selecciona y anade al carrito")
    public void loSeleccionaYAnadeAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                agregarAlCarrito(),
                gotoCarrito()
        );

    }

    @When("procede al proceso de pago escogiendo Efecty como metodo de pago")
    public void procedeAlProcesoDePagoEscogiendoEfectyComoMetodoDePago() {

        theActorInTheSpotlight().attemptsTo(
                irConfirmarCompra(),
                confirmarCompra(),
                miniFormulario(),
                llenarDatosEntrega(),
                seleccionMetodo(),
                llenarFormularioPago()
        );
    }

    @Then("deberia recibir una confirmacion de compra exitosa por Efecty")
    public void deberiaRecibirUnaConfirmacionDeCompraExitosaPorEfecty() {
        UserModelPago  userModelPago = new UserModelPago();
        String expectedMessage = String.format("¡"+userModelPago.getNombre()+", gracias por preferirnos!");
        theActorInTheSpotlight().should(
                seeThat(verificarConfirmacionCompra(),containsString(expectedMessage))
        );
    }
}
