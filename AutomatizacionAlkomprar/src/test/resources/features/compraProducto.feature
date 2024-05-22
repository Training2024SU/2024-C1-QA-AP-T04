Feature: realizar compra de producto
  yo como usuario de la pagina https://www.alkomprar.com/
  quiero poder comprar productos
  para obtener los beneficios de la pagina

  Background:
    Given que el usuario se encuentra en la pagina web alkomprar.com

  @rutaCritica
    @compraUnProducto
  Scenario Outline:Realizar compra de producto con usuario registrado
    When se registra e inicia sesion con "<correo>","<nombre>","<apellido>","<telefono>"
    And selecciona un producto "<producto>" finalizando su compra
    Then deberia visualizar un mensaje con la finalizacion de su orden

    Examples:
      | correo                      | nombre     | apellido       | telefono   | producto  |
      | devonalvarez20245@gmail.com | devon jose | alvarez osorio | 3022430976 | televisor |

  @rutaCritica
    @compraVariosProductos
  Scenario Outline: compra de varios productos con inicio sesion
    When inicia sesion con correo "<correo>" y password "<password>"
    And selecciona varios productos finalizando su compra
    Then deberia ver la factura de pago con los productos
    Examples:
      | correo                    | password        |
      | osorioalvarez20@gmail.com | C7dZq*73GwiCQYK |
