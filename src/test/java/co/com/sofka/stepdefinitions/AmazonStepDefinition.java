package co.com.sofka.stepdefinitions;

import co.com.sofka.models.FormularioTarjeta;
import co.com.sofka.stepdefinitions.setup.SetupPage;
import co.com.sofka.utils.CrearTarjeta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.questions.page.ObtenerMensaje.obtenerMensaje;
import static co.com.sofka.questions.page.ObtenerMensajeTarjeta.obtenerMensajeTarjeta;
import static co.com.sofka.tasks.pages.AbrirPaginaInicial.abrirPagina;
import static co.com.sofka.tasks.pages.AgregarCesta.agregarCesta;
import static co.com.sofka.tasks.pages.LlenarInicioSesion.llenarInicioSesion;
import static co.com.sofka.tasks.pages.LlenarTarjeta.llenarTarjeta;
import static co.com.sofka.tasks.pages.NavegarCesta.navegarCesta;
import static co.com.sofka.tasks.pages.NavegarInformatica.navegarInformatica;
import static co.com.sofka.tasks.pages.NavegarInicioSesion.navegarInicioSesion;
import static co.com.sofka.tasks.pages.SeleccionarProductosInformatica.seleccionarProductosInformatica;
import static co.com.sofka.tasks.pages.TramitarPedido.tramitarPedido;
import static co.com.sofka.utils.Constants.RESPUESTA_FINAL_TARJETA;
import static co.com.sofka.utils.Constants.RESPUESTA_INICIO_SESION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AmazonStepDefinition extends SetupPage {
    @Dado("que el usuario {string} se encuentra en el sitio web")
    public void queElUsuarioSeEncuentraEnElSitioWeb(String actor) {
        actorSetupTheBrowser(actor);
        theActorInTheSpotlight().wasAbleTo(
                abrirPagina().conLaUrl("https://www.amazon.es/")
        );
    }

    @Cuando("se inicia sesion en la plataforma con el correo {string} y la contraseña {string}")
    public void seIniciaSesionEnLaPlataformaConElCorreoYLaContrasena(String email, String password) {
        theActorInTheSpotlight().wasAbleTo(
                navegarInicioSesion(),
                llenarInicioSesion()
                        .conEmail(email)
                        .yPassword(password)
        );
        theActorInTheSpotlight().should(
                seeThat(obtenerMensaje(), equalTo(RESPUESTA_INICIO_SESION))
        );
    }

    @Entonces("deberia visualizar un mensaje con la informacion de su orden")
    public void deberiaVisualizarUnMensajeConLaInformacionDeSuOrden() {
        theActorInTheSpotlight().should(
                seeThat(obtenerMensajeTarjeta(), equalTo(RESPUESTA_FINAL_TARJETA))
        );
    }
}
