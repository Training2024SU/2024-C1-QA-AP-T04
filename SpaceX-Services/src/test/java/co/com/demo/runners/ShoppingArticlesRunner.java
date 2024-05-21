package co.com.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_articles.feature",
        glue = "co.com.demo.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
       //tags = "@Registration"
       //tags = "@Purchase"
        tags = "@Shopping"


)

public class ShoppingArticlesRunner {
}
