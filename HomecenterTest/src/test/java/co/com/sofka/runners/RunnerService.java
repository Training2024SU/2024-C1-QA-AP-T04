package co.com.sofka.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@CompraHomecenter",
        features = {"src/test/resources/features/compra_producto.feature"},
        glue = {"co.com.sofka.stepdefinitions"}

)

public class RunnerService {
}
