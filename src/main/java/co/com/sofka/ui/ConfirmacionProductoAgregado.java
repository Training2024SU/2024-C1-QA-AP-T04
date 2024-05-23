package co.com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionProductoAgregado {

        public static final Target AL_CARRITO =  Target.the("Confirmación de producto agregado al carrito")
                .locatedBy("//*[@id=\"cart-notification\"]/div[1]/h2");
}


