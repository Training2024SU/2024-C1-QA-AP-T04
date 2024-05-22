Feature: Buy products
  I as the user of the web page Koaj
  want to be able to Buy products without login or register
  For getting products delivered to my house

  @happyEnd2
  Scenario: Buy 2 products with Efecty and register after adding the products
    Given The user <name> is in the Web page "https://www.koaj.co/"
    When select the products and add them to the Car
      | Buzo unicolor con acabados en rib, bolsillo y capota         |
      | Tenis planos unicolores con texturas perforadas y plataforma |
    And Redirects to the car
    And fill the small form with correct information
    And confirm the pickup direction
    And confirm the payment method
    Then it should go to the order confirmation
    And be able to download the payment code