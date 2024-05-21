package co.com.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/selecting_services.feature",
        glue = "co.com.demo.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class SelectingServicesXRunner {
}
