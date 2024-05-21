Feature: Purchase books in Buscalibre
  i as a user of Buscalibre
  want to navigate through the page
  to buy books

  Background:
    Given the user is in the Buscalibre web page with browser 2

  @RutaCritica1
  Scenario: Purchase a book through the search engine with no registered user
    And search "LA BRUJA" in the search engine selecting it
    When adds it to the cart 2 additional specimens
    And finish the purchase filling out the delivery and payment process
    Then should see the message "Selecciona Forma de Pago:"

  @RutaCritica2
  Scenario: Purchase a book searching it by category with no registered user
    And selects a random category
    When adds a random book to the carth with 3 additional specimens
    And finish the purchase filling out the delivery and payment forms
    Then should see the message "Pago" in the payment page



