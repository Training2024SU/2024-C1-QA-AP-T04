package osorio.alvarez.devon.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static osorio.alvarez.devon.ui.PageCompraProducto.RECIBO_PAGO;

public class GetText {
    public static Question<String> getText() {
        return actor -> TextContent.of(RECIBO_PAGO).answeredBy(actor).trim();
    }
}
