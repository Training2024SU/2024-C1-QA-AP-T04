Feature: Compra de productos en Homecenter Colombia con pago por Efecty

  yo como usuario de la plataforma homecenter.com.co
  quiero buscar un pedido y realizar el proceso de pago efecty
  para disfrutar de un producto de esta empresa


  @CompraHomecenter
  Scenario: Seleccion de producto y compra por Efecty
    Given el usuario esta en la pagina principal de Homecenter
    When busco el producto "nevera frost"
    And lo selecciona y anade al carrito
    And procede al proceso de pago escogiendo Efecty como metodo de pago
    Then deberia recibir una confirmacion de compra exitosa por Efecty

