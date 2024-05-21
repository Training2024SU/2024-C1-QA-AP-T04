package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PageEntrega extends PageObject {
;
    public static final Target BTN_QUIEN_RECIBE = Target.
            the("boton de usar esta direccion").
            located(org.openqa.selenium.By.id("testId-btn-chooseReceiverDetail-f820d7d0-3f65-4aac-9851-b4115c2981b0-homeDelivery"));
    public static final Target BTN_QUIEN_RECIBE_X = Target.
            the("boton de usar esta direccion").
            located(org.openqa.selenium.By.xpath("//div[@class='jsx-902609922 choose-missing-step-wrapper']"));
    public static final Target BTN_DEJAR_PORTERIA = Target.
            the("boton de usar esta direccion").
            located(org.openqa.selenium.By.xpath("//label[@for='testId-leaveAtReception']"));
    public static final Target BTN_GUARDARYSALIR = Target.
            the("boton de usar esta direccion").
            located(org.openqa.selenium.By.id("testId-btn-receiverDetailsContinueButton"));
    public static final Target CONTINUAR_AL_PAGO = Target.
            the("boton de usar esta direccion").
            located(org.openqa.selenium.By.id("testId-btn-continueToPaymentButton"));




}
