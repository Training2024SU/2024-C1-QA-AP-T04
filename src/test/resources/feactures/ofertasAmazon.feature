#language:es
#Author: Julio Vasquez

Característica: realizar adiciones al carrito de compras
  yo como usuario de la pagina https://www.amazon.com/
  quiero aqreqar productos en oferta al carrito de compras
  para poder realizar el pedido

  @test1
  Esquema del escenario: Realizar compra de Electronicos con usuario logueados
    Dado que el usuario <usuario> se encuentra en el sitio web
    Cuando se inicia sesion en la plataforma con el correo <correo> y la contraseña <contrasena>
    Y selecciona los productos finalizando su compra
    Entonces deberia visualizar un mensaje con la informacion de su orden
    Ejemplos:
      | usuario  | correo                | contrasena |
      | "Fulano" | "varobass0@gmail.com" | "123456"   |


