Feature: Compra de producto en tienda Totto
  Como usuario del aplicativo de la tienda Totto
  Quiero comprar productos en promoción
  Para aprovechar descuentos y ofertas

  Background:
    Given que el usuario "usuario" está en la página de inicio "https://co.totto.com" desde el navegador "edge"

  @RutaCritica
  @compraPromocion
  Scenario: Comprar un morral en promoción con envío al hogar
    When el usuario elije el producto y cantidad agregandolo al carrito
    And llena formulario de informacion personal
    And el usuario ingresa la información de envio
    And completa la información de pago
    Then se debería mostrar un mensaje de confirmación de la compra

  @RutaCritica
  @compraErronea
  Scenario: Comprar un morral en promoción con envío al hoogar
    When el usuario realiza el ingreso de la información personal correctamente
    And ingresa información de pago con tarjeta de credito incorrecta
    Then se deberia indicar al usuario que hay un error con la información de TC suministrada