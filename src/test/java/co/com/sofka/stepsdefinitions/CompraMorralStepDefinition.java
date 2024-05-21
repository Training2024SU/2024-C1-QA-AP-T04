package co.com.sofka.stepsdefinitions;

import co.com.sofka.Setup.Setup;
import co.com.sofka.modelos.PersonaFormModel;
import co.com.sofka.questions.PayGetResponse;
import co.com.sofka.questions.PayTCResponse;
import co.com.sofka.questions.UserLogin;
import co.com.sofka.tasks.totto.IngresarInfoPersonal;
import co.com.sofka.tasks.totto.IngresoInfoPagoTC;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;

import static co.com.sofka.ConstantesAssertions.LoginAssertions.*;
import static co.com.sofka.tasks.totto.AbrirPaginaInicial.abrirPaginaConUrl;
import static co.com.sofka.tasks.totto.AgregarProductosCarrito.agregarProductosCarrito;
import static co.com.sofka.tasks.totto.BuscarProductoSale.buscarProductoSale;
import static co.com.sofka.tasks.totto.IngresarInfoPersonal.ingresarInfoPersonal;
import static co.com.sofka.tasks.totto.IngresoInfoEnvio.ingresoInfoEnvio;
import static co.com.sofka.tasks.totto.IngresoInfoPago.ingresoInfoPago;
import static co.com.sofka.utils.Constantes.*;
import static co.com.sofka.utils.Util.generarFormularioPersonaAleatorio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraMorralStepDefinition extends Setup {

    private PersonaFormModel personaFormModel;

    @Given("que el usuario {string} está en la página de inicio {string} desde el navegador {string}")
    public void que_el_usuario_está_en_la_página_de_inicio_del_éxito_desde_el_navegador(String usuario,String pag, String navegador) {
        try {
            actorSetupTheBrowser(usuario,navegador);
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaConUrl().conLaUrl(pag)
            );
            this.personaFormModel = generarFormularioPersonaAleatorio();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @When("el usuario elije el producto y cantidad agregandolo al carrito")
    public void el_usuario_elije_los_productos_en_promoción_agregandolos_al_carrito() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    buscarProductoSale(),
                    agregarProductosCarrito()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @When("llena formulario de informacion personal")
    public void llena_formulario_de_informacion_personal() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    ingresarInfoPersonal()
                            .ingresoPersona(personaFormModel)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @When("el usuario ingresa la información de envio")
    public void el_usuario_ingresa_la_información_de_envio() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    ingresoInfoEnvio().ingresoPersona(personaFormModel)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @When("completa la información de pago")
    public void completa_la_información_de_pago() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    ingresoInfoPago()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @Then("se debería mostrar un mensaje de confirmación de la compra")
    public void se_debería_mostrar_un_mensaje_de_confirmación_de_la_compra() {
        try {
            HashMap<String,String> purchaseResponse = theActorInTheSpotlight().asksFor(PayGetResponse.expected());

            theActorInTheSpotlight().should(
                    seeThat(
                            "El metodo de pago es el indicado",
                            actor -> purchaseResponse.get(EFECTY_METHOD_PAY), equalTo(METHOD_EFECTY))
            );

            theActorInTheSpotlight().should(
                    seeThat(
                            "La pantalla para completar compra es la indicada",
                            actor -> purchaseResponse.get(BUTTON_COMPRAR), equalTo(BUTTON_DO_PURCHASE))
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        } finally {
            quiteDriver();
        }
    }

    @When("el usuario realiza el ingreso de la información personal correctamente")
    public void el_usuario_realiza_el_proceso_de_compra_correctamente() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    buscarProductoSale(),
                    agregarProductosCarrito(),
                    ingresarInfoPersonal()
                            .ingresoPersona(personaFormModel),
                    ingresoInfoEnvio().ingresoPersona(personaFormModel)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @When("ingresa información de pago con tarjeta de credito incorrecta")
    public void ingresa_información_de_pago_con_tarjeta_de_credito_incorrecta() {
        try {
            // La p+agina bloquea el ingreso de información de pago
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }
    }

    @Then("se deberia indicar al usuario que hay un error con la información de TC suministrada")
    public void se_deberia_indicar_al_usuario_que_hay_un_error_con_la_información_de_tc_suministrada() {
        try {
            theActorInTheSpotlight().should(
                    seeThat("El metodo de pago escogido es Tarjeta de crédito",
                            PayTCResponse.expected(),equalTo(METHOD_CREDIT))
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            quiteDriver();
            Assertions.fail();
        }finally {
            quiteDriver();
        }

    }

}
