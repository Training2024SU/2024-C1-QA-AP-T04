@web
Feature: Products search
  I as a user of the IKEA online store
  WANT TO search for products in the store
  SO THAT I can find the one I'm looking for

  Background: Browsing the web
#    Given The user is browsing the web using the FIREFOX browser
    Given The user is browsing the web using the CHROME browser

  Scenario: Searching by category
    Given David is looking at the home page
    When he selects one of the categories displayed
    Then he should see the products related to that category

  Scenario: Searching by keyword
    Given Maria is looking at the home page
    When she searches using a keyword
    Then she should see relevant products in the search result
