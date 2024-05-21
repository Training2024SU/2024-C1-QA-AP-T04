package co.com.sofkau.stepdefinitions;

import co.com.sofkau.stepdefinitions.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofkau.questions.ObtenerMensajeInicioDeSesion.obtenerMensajeInicioDeSesion;
import static co.com.sofkau.tasks.LlenarAutenticacionEmailRegistrado.llenarAutenticacionEmailRegistrado;
import static co.com.sofkau.tasks.LlenarAutenticacionPasswordRegistrado.llenarAutenticacionPasswordRegistrado;
import static co.com.sofkau.tasks.NavegarAAutenticacion.navegarAAutenticacion;
import static co.com.sofkau.tasks.NavegarALogin.navegarALogin;
import static co.com.sofkau.ui.constantes.ConstanteMensajeDeConfirmacion.Mensaje_esperado_de_login;
import static co.com.sofkau.ui.constantes.ConstanteUsuarioRegistrado.correo_registrado;
import static co.com.sofkau.ui.constantes.ConstanteUsuarioRegistrado.password_registrado;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinition extends Setup {
    @Given ("se autentica con sus datos correctamente")
    public void seAutenticaConSusDatosCorrectamente(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAAutenticacion(),
                    llenarAutenticacionEmailRegistrado()
                            .conElCorreoRegistrado(correo_registrado)
            );
        } catch (Exception e) {
            System.err.println("Error al autenticarse con los datos correctamente: " + e.getMessage());
            e.printStackTrace();
        }
    }
    @When("ingresa sus credenciales de usuario registrado correctamente")
    public void ingresaSusCredencialesDeUsuarioRegistraedoCorrectamente(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarALogin(),
                    llenarAutenticacionPasswordRegistrado()
                            .conElPasswordRegistrado(password_registrado)
            );
        } catch (Exception e) {
            System.err.println("Error al ingresar las credenciales de usuario registrado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Then ("deberia ser redirigido a la pagina con su sesion iniciada")
    public void deberiaSerRedirigidoALaPaginaConSuSesionIniciada(){
        try {
            theActorInTheSpotlight().should(
                    seeThat(obtenerMensajeInicioDeSesion(), equalTo(Mensaje_esperado_de_login))
            );
        } catch (Exception e) {
            System.err.println("Error al verificar el inicio de sesión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
