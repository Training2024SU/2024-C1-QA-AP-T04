# language: es
# Author: Katherin Oquendo

#Característica: Realizar adiciones al carrito
#  Como usuario de la página https://monky.com.co/
#  Quiero agregar productos al carrito de compras
#  Para poder realizar mi pedido
#
#  Antecedentes:
#
#  @test1
#  Escenario: Realizar compra de tenis
#    Dado que el usuario se encuentra en la página de Monky
#    Cuando navega a la sección de "Tenis para mujer"
#    Y selecciona los tenis para mujer
#    Y elige la talla con la cantidad deseadas
#    Y agrega los tenis al carrito
#    Entonces deberia de ver la confirmacion de la orden

    #completo


  # language: es
# Author: Katherin Oquendo

#Característica: Realizar adiciones al carrito
#  Como usuario de la página https://monky.com.co/
#  Quiero agregar productos al carrito de compras
#  Para poder realizar mi pedido
#
#  Antecedentes:
#
#  @test1
#  Escenario: Realizar compra de tenis
#    Dado que el usuario se encuentra en la página de Monky
#    Y navega a la sección de "Tenis para mujer"
#    Cuando selecciona los tenis para mujer eligiendo la talla con la cantidad deseada
#    Y agrega los tenis al carrito confirmando la compra
#    Y llena el formulario de entrega y pago con los siguientes datos
#      | Correo electronico | nombre | Apellidos | Direccion       | Casa Apartamento | ciudad | Provincia | codigo postal | telefono   |
#      | andres@ejm.com     | Andres | Perez     | Calle Falsa 123 | Casa primer piso | Bello  | Antioquia | 12345         | 1234567890 |
#
#   Entonces deberia visualizar un mensaje con la informacion de su orden


Característica: Realizar adiciones al carrito
  Como usuario de la página https://monky.com.co/
  Quiero agregar productos al carrito de compras
  Para poder realizar mi pedido

  Antecedentes:

  @test1
  Esquema del escenario: Realizar compra de tenis
    Dado que el usuario se encuentra en la página de Monky
    Y navega a la sección de "Tenis para mujer"
    Cuando selecciona los tenis para mujer eligiendo la talla con la cantidad deseada
    Y agrega los tenis al carrito confirmando la compra
    Y llena el formulario de entrega y pago con el correo electronico <correoElectronico> y el nombre <nombre>
    Entonces deberia visualizar un mensaje con la informacion de su orden
    Ejemplos:
      | correoElectronico | nombre   |
      | "andres@ejm.com"  | "Andres" |