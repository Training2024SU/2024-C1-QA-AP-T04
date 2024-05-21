@web
Feature: Purchases
  I as a user of the IKEA online store
  WANT TO buy products from the store
  SO THAT I receive them in my house

  Background: Browsing the web
#    Given The user is browsing the web using the FIREFOX browser
    Given The user is browsing the web using the CHROME browser

  @CriticalRoute
  Scenario: Successful purchase
    Given David is looking at the home page
    And he adds 2 products to his shopping bag
    When he completes the purchase process
    Then he should see a confirmation
