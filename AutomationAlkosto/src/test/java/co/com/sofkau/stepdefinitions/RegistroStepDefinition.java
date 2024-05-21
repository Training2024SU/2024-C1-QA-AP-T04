package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.sofkau.questions.ObtenerMensajeInicioDeSesion.obtenerMensajeInicioDeSesion;
import static co.com.sofkau.tasks.LlenarRegistro.llenarRegistro;
import static co.com.sofkau.ui.constantes.ConstanteMensajeDeConfirmacion.Mensaje_esperado_de_login;
import static co.com.sofkau.ui.constantes.constanteUrl.url_pagina_principal;
import static co.com.sofkau.utils.Util.crearUsuario;
import static co.com.sofkau.tasks.AbrirPaginaInicial.abrirPagina;
import static co.com.sofkau.tasks.LlenarAutenticacionUsuarioSinRegistrar.llenarAutenticacion;
import static co.com.sofkau.tasks.NavegarAAutenticacion.navegarAAutenticacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroStepDefinition extends Setup {

    @Given("que el usuario {string} selecciona el navegador {int} e ingresa al sitio web")
    public void queElUsuarioSeEncuentraEnElSitioWeb(String actor, int navegador){
        try {
            actorSetupTheBrowser(actor, navegador);
            theActorInTheSpotlight().wasAbleTo(
                    abrirPagina().conLaUrl(url_pagina_principal)
            );
        } catch (Exception e) {
            System.err.println("Error al seleccionar el navegador e ingresar al sitio web: " + e.getMessage());
            e.printStackTrace();
        }
    }
    @When("ingresa su informacion correctamente")
    public void ingresaSuInformacionCorrectamente(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAAutenticacion(),
                    llenarAutenticacion().conElCorreo(crearUsuario()),
                    llenarRegistro().conElUsuario(crearUsuario())
            );
        } catch (Exception e) {
            System.err.println("Error al ingresar la información correctamente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Then ("deberia ser redirigido a la pagina con la sesion iniciada")
    public void deberiaSerRedirigidoALaPaginaConLaSesionIniciada(){
        try {
            theActorInTheSpotlight().should(
                    seeThat(obtenerMensajeInicioDeSesion(), equalTo(Mensaje_esperado_de_login))
            );
        } catch (Exception e) {
            System.err.println("Error al verificar el mensaje de inicio de sesión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
