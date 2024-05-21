package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static co.com.sofkau.tasks.IrAActualizarDatosDeEnvio.actualizarDatosDeEnvio;
import static co.com.sofkau.tasks.ConfirmarMetodoDeEnvio.confirmarMetodoDeEnvio;
import static co.com.sofkau.tasks.ConfirmarRevisionYAprobacion.confirmarRevisionYAprobacion;
import static co.com.sofkau.tasks.LlenarAutenticacionEmailRegistrado.llenarAutenticacionEmailRegistrado;
import static co.com.sofkau.tasks.LlenarAutenticacionPasswordRegistrado.llenarAutenticacionPasswordRegistrado;
import static co.com.sofkau.tasks.LlenarDireccionDeEnvio.llenarDireccionDeEnvio;
import static co.com.sofkau.tasks.NavegarAAutenticacion.navegarAAutenticacion;
import static co.com.sofkau.tasks.NavegarALogin.navegarALogin;
import static co.com.sofkau.tasks.NavegarAPaginaPrincipal.navegarAPaginaPrincipal;
import static co.com.sofkau.tasks.SeleccionarFormaDePago.seleccionarFormaDePago;
import static co.com.sofkau.ui.constantes.ConstanteUsuarioRegistrado.correo_registrado;
import static co.com.sofkau.ui.constantes.ConstanteUsuarioRegistrado.password_registrado;
import static co.com.sofkau.utils.Util.crearDireccionDeEnvio;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraActualizandoDatosDeEnvioStepDefinition extends Setup {

    @Given ("inicia sesion con sus credenciales registradas")
    public void iniciaSesionConSusCredencialesRegistradas(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAAutenticacion(),
                    llenarAutenticacionEmailRegistrado()
                            .conElCorreoRegistrado(correo_registrado),
                    navegarALogin(),
                    llenarAutenticacionPasswordRegistrado()
                            .conElPasswordRegistrado(password_registrado),
                    navegarAPaginaPrincipal()
            );
        } catch (Exception e) {
            System.err.println("Error al autenticarse con los datos correctamente: " + e.getMessage());
            e.printStackTrace();
        }

    }

    @When ("confirma los productos modificando la direccion en el formulario de envio")
    public void confirmaLosProductosModificandoLaDireccion(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    actualizarDatosDeEnvio(),
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
}
