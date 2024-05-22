package osorio.alvarez.devon.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import osorio.alvarez.devon.questions.GetText;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static osorio.alvarez.devon.tasks.compraproducto.AbrirPaginaInicial.abrirPagina;
import static osorio.alvarez.devon.tasks.compraproducto.CompletarDatosPago.completarDatosDePago;
import static osorio.alvarez.devon.tasks.compraproducto.LlenarRegistro.llenarRegistro;
import static osorio.alvarez.devon.tasks.compraproducto.NavegarARegistro.navegarARegistro;
import static osorio.alvarez.devon.tasks.compraproducto.SeleccionarProducto.seleccionarProducto;
import static osorio.alvarez.devon.utils.ConstantAssertions.EXPECTED_MESSAGE;
import static osorio.alvarez.devon.utils.ConstantesTask.URL;

public class CompraProductoStepDefinitions extends Setup{
    private Actor actor;

    @Given("que el usuario se encuentra en la pagina web alkomprar.com")
    public void que_el_usuario_se_encuentra_en_la_pagina_web_alkomprar_com() {
        actorSetupTheBrowser();
        theActorInTheSpotlight().wasAbleTo(
                abrirPagina().conLaUrl(URL)
        );
    }
    
    @When("se registra e inicia sesion con {string},{string},{string},{string}")
    public void seRegistraEIniciaSesionCon(String correo, String nombre, String apellido, String telefono) {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    navegarARegistro(),
                    llenarRegistro()
                            .conElcorreo(correo)
                            .conElNombre(nombre)
                            .conElApellido(apellido)
                            .yConEltelefono(telefono)
            );
        }catch (Exception e){
            e.getMessage();
        }
    }

    @When("selecciona un producto {string} finalizando su compra")
    public void seleccionaUnProductoFinalizandoSuCompra(String producto) {
           theActorInTheSpotlight().wasAbleTo(
                   seleccionarProducto()
                           .conNombre(producto),
                   completarDatosDePago()
           );
    }
    @Then("deberia visualizar un mensaje con la finalizacion de su orden")
    public void deberiaVisualizarUnMensajeConLaFinalizacionDeSuOrden() {
        theActorInTheSpotlight().should(
                seeThat("el texto de la factura ", GetText.getText(),equalTo(EXPECTED_MESSAGE))
        );
    }
}
