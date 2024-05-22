package osorio.alvarez.devon.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import osorio.alvarez.devon.questions.GetText;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static osorio.alvarez.devon.tasks.compraproducto.NavegarARegistro.navegarARegistro;
import static osorio.alvarez.devon.tasks.compravariosproductos.IniciarSesion.iniciarSesion;
import static osorio.alvarez.devon.tasks.compravariosproductos.LlenarDatosDePago.llenarDatosDePago;
import static osorio.alvarez.devon.tasks.compravariosproductos.SeleccionarProductos.seleccionarProductos;
import static osorio.alvarez.devon.utils.ConstantAssertions.EXPECTED_MESSAGE;

public class CompraVariosProductosStepDefinitions extends Setup{

    @When("inicia sesion con correo {string} y password {string}")
    public void inicia_sesion_con_correo_y_password(String correo, String password) {
        theActorInTheSpotlight().wasAbleTo(
                navegarARegistro(),
                iniciarSesion().conCorreo(correo).yPassword(password)
        );

    }

    @When("selecciona varios productos finalizando su compra")
    public void selecciona_varios_productos_finalizando_su_compra() {
        theActorInTheSpotlight().wasAbleTo(
                seleccionarProductos(),
                llenarDatosDePago()
        );
    }

    @Then("deberia ver la factura de pago con los productos")
    public void deberiaVerLaFacturaDePagoConLosProductos() {
        theActorInTheSpotlight().should(
                seeThat("el texto de la factura ", GetText.getText(),equalTo(EXPECTED_MESSAGE))
        );
    }

}
