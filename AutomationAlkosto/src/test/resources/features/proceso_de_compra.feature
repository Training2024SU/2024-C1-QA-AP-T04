#Author: Andreina Iglesias

 Feature: Proceso de compra en pagina de Alkosto
    Yo como usuario de la pagina de Alkosto
    Quiero poder agregar productos a mi carrito y comprarlos
    Para adquirir los productos que necesito

#Usar 1 para navegador Chrome y 2 para Edge
#Para el scenario 1, crear nueva cuenta de correo y registrarlo en la pagina, cada que se ejecute.

   Background:
     Given que el usuario "actor1" selecciona el navegador 1 e ingresa al sitio web

   @rutacritica
   @flujoCompleto
   @RutaFeliz
   Scenario Outline: Realizar compra con usuario registrado
    And busca el producto "<producto>" deseado
    And selecciona el producto que se encuentra en la posicion <posicion>
    When se autentica e ingresa sus datos correctamente
    And confirma los productos llenando los formularios requeridos para el envio
    Then deberia visualizar un mensaje confirmando la orden de compra
     Examples:
     |producto  |posicion|
     |usb       |3       |

   @rutacritica
   @RutaFeliz
   Scenario: Realizar compra con usuario registrado modificando direccion de envio
     And inicia sesion con sus credenciales registradas
     And busca el producto "usb" deseado
     And selecciona el producto que se encuentra en la posicion 4
     When confirma los productos modificando la direccion en el formulario de envio
     Then deberia visualizar un mensaje confirmando la orden de compra




