Feature: Buy products and Register
  I as the user of the web page Koaj
  want to be able to Register and Buy products
  For having access to the services and deliveries of the webpage

  @happyEnd
  Scenario: Buy 2 products with Efecty and register a new account
    Given The user <name> is in the Web page "https://www.koaj.co/"
    When Registers and start session with the user information
    And select the products and add them to the Car
      | Buzo unicolor con acabados en rib, bolsillo y capota |
      | Tenis planos unicolores con texturas perforadas      |
    And Redirects to the car
    And confirm the pickup direction
    And confirm the payment method
    Then it should go to the order confirmation
    And be able to download the payment code
