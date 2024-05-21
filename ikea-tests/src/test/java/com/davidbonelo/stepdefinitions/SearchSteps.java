package com.davidbonelo.stepdefinitions;

import com.davidbonelo.utils.Utils;
import com.davidbonelo.tasks.Search;
import com.davidbonelo.tasks.SelectMainCategory;
import com.davidbonelo.tasks.SelectSubCategory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.davidbonelo.ui.ProductsListPage.RESULT_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotEmpty;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SearchSteps {
    @When("{actor} selects one of the categories displayed")
    public void heSelectsOneOfTheCategoriesDisplayed(Actor actor) {
        actor.wasAbleTo(
                SelectMainCategory.any(), // main
                SelectSubCategory.any() // sub category
        );
    }

    @Then("{actor} should see the products related to that category")
    public void heShouldSeeTheProductsRelatedToThatCategory(Actor actor) {
        actor.should(
                seeThat(the(RESULT_PRODUCTS), isNotEmpty())
        );
    }

    @When("{actor} searches using a keyword")
    public void sheSearchesUsingAKeyword(Actor actor) {
        String searchTerm = Utils.getRandomSearchKeyword();
        actor.wasAbleTo(Search.byKeyword(searchTerm));
    }

    @Then("{actor} should see relevant products in the search result")
    public void sheShouldSeeRelevantProductsInTheSearchResult(Actor actor) {
        actor.should(
                seeThat(the(RESULT_PRODUCTS), isNotEmpty())
        );
    }
}
