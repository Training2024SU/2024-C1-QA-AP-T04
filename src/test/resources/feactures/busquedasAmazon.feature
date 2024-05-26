#language:es
#Author: Julio Vasquez

Característica: realizar compras por busquedas
  yo como usuario de la pagina https://www.amazon.com/
  quiero aqreqar productos encontrados por su nombre
  para poder realizar la compra

  @test1
  Esquema del escenario: Realizar compra de prendas con usuario loguados
    Dado que el usuario <usuario> se encuentra en el sitio web
    Cuando se inicia sesion en la plataforma con el correo <correo> y la contraseña <contrasena>
    Y busca los productos <productos> finalizando su compra
    Entonces deberia visualizar un mensaje con la informacion de su orden
    Ejemplos:
      | usuario  | correo                | contrasena | productos  |
      | "Fulano" | "varobass0@gmail.com" | "123456"   | "camisa"   |
      | "Julio"  | "varobass0@gmail.com" | "123456"   | "pantalon" |
      | "Jose"   | "varobass0@gmail.com" | "123456"   | "zapato"   |
