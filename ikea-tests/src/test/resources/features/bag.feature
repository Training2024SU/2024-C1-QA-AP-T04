@web
Feature: Bag of products
  As a User of the IKEA online store
  I WANT to use a shopping bag to hold products
  SO THAT I can buy them all latter

  Background: Browsing the web
#    Given The user is browsing the web using the FIREFOX browser
    Given The user is browsing the web using the CHROME browser

  Scenario Outline: Add items to the shopping bag
    Given David has an empty shopping bag
    When he adds <quantity> products to his shopping bag
    Then he should see all the products in his bag
    And he should see the total price for all the products
    Examples:
      | quantity |
      | 1        |
      | 3        |