#Author: Andreina Iglesias

Feature: Agregar productos al carrito en pagina de Alkosto
  Yo como usuario de la pagina de Alkosto
  Quiero poder agregar productos a mi carrito y comprarlos
  Para adquirir los productos que necesito

# Usar 1 para seleccionar el navegador Chrome y 2 para Edge

  Background:
    Given que el usuario "actor1" selecciona el navegador 1 e ingresa al sitio web
@RutaFeliz
  Scenario Outline: Agregar productos al carrito
    When navega a la pagina principal y busca el producto deseado <producto>
    And selecciona el producto en la posicion <posicion>
    Then entonces deberia visualizar un mensaje que confirme que se agrego el producto satisfactoriamente
    Examples:
    |producto|posicion|
    |"usb"   |    2   |
    |"camara"|    3   |

  @RutaFeliz
  Scenario Outline: Agregar productos al carrito y modificar la cantidad
    When navega a la pagina principal y busca el producto deseado <producto>
    And selecciona el producto en la posicion <posicion>
    And modifica la cantidad <cantidad> del producto agregado
    Then entonces deberia visualizar un mensaje que confirme que se modifico la cantidad del producto exitosamente
    Examples:
      |producto|posicion|cantidad|
      |"usb"   |    5   | 3      |