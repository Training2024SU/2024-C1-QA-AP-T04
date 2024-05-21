package garcia.juan.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_completa.feature",
        glue= "garcia.juan.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@CompraProductoMasCaro"
        //tags = "@VariosPrimerosProductos"
)
public class CompraCompletaTest {
}
