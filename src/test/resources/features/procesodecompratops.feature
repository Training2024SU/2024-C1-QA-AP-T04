# language: es
# Author: Katherin Oquendo

Característica: Realizar adiciones al carrito
  Como usuario de la página https://monky.com.co/
  Quiero agregar productos al carrito de compras
  Para poder realizar mi pedido

  Antecedentes:

  @test2
  Esquema del escenario: Realizar compra de tops
    Dado que el usuario se encuentra en la página de Monky
    Y navega a la seccion de "Tops"
    Cuando selecciona los tops para mujer con la cantidad deseada
    Y agrega los tops al carrito confirmando la compra
    Y llena el formulario de pago y entrega con el correo electronico <correoElectronico> y el nombre <nombre>
    Entonces deberia visualizar un mensaje con la informacion de su orden
    Ejemplos:
      | correoElectronico | nombre   |
      | "andrea@ejm.com"  | "Andrea" |
