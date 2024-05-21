package co.com.sofka.stepsdefinitions;

import co.com.sofka.Setup.AppiumSetup;
import co.com.sofka.questions.UserLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.Format;
import java.util.HashMap;

import static co.com.sofka.ConstantesAssertions.LoginAssertions.*;
import static co.com.sofka.tasks.Appium.Login.doLogin;
import static co.com.sofka.tasks.Appium.NavigateTo.navigateTo;
import static co.com.sofka.utils.Constantes.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInStepDefinitions extends AppiumSetup {

    @Given("que el usuario {string} en el home eligio la opcion de login")
    public void usuarioHomeEligioOpcionLogin(String usuario) {
        actorSetupTheBrowser(usuario);
        theActorInTheSpotlight().wasAbleTo(
                navigateTo()
        );

    }

    @When("el usuario inicia sesion ingresando su nombre {string} y contrasena {string}")
    public void elUsuarioIniciaSesionIngresandoSuNombreYContrasena(String userName, String password) {
        theActorInTheSpotlight().wasAbleTo(
                doLogin().ingresoUser(userName,password)
        );
    }

    @Then("el usuario {string} deberia ser redirigido a la pagina de inicio de la aplicacion")
    public void verificarPagInicio(String userName) {
           HashMap<String,String> loginHome = theActorInTheSpotlight().asksFor(UserLogin.expected());

           // Se asegura que las etiquetas correspondan a home del perfil de usuario

        theActorInTheSpotlight().should(
                seeThat(
                        "La etiqueta del home Secreat area es la correspondiente",
                        actor -> loginHome.get(SECRET_AREA_LABEL), equalTo(SECRET_AREA))
        );

        System.out.println(String.format(LOGED_USER,userName));

        theActorInTheSpotlight().should(
                seeThat(
                        "La etiqueta del usuario logueado es la correspondiente",
                        actor -> loginHome.get(LOGIN_USER), equalTo(String.format(LOGED_USER,userName)))
        );

        theActorInTheSpotlight().should(
                seeThat(
                        "La etiqueta del boton logout es la correspondiente",
                        actor -> loginHome.get(LOGOUT_BUTTON), equalTo(LOGOUT))
        );
    }
}
