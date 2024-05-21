Feature: Compra de un producto

  #navegadores --> chrome y edge
  Background:
    Given que el usuario esta en la pagina inicial de Falabella en "chrome"
    And Se encuentra registrado y con sesion iniciada

  @CompraProductoMasCaro
  Scenario: Compra de producto mas caro
    When busca "air fryer" seleccionando el mas costoso
    And completa su informacion de envio y pago
    Then deberia observar un mensaje confirmando la compra

  @VariosPrimerosProductos
  Scenario: Compra de varios productos diferentes
    When busca y agrega diferentes items al carrito
    |  Locion moschino |
    | Crema ducray |
    | Shampoo Hys |
    And completa su informacion de envio y pago
    Then deberia observar un mensaje confirmando la compra

