Feature: pruebas del servicio PUT
  yo como usuario de los servicios Reqres
  quiero poder actualizar los datos personales
  para estar actualizado y seguro

  @rutafeliz
  Scenario Outline: Solicitud de usuario por id
    Given que el usuario esta en la pagina de "https://reqres.in"
    When con los datos nombre <usuario> y el trabajo <trabajo>
    And envia una peticion de tipo put al recurso "/api/users/" y el id <id>
    Then deberia obtener un codigo de respuesta 201
    And deberia obtener la informacion del usuario <usuario> y trabajo <trabajo>
    Examples:
      | id | usuario  | trabajo      |
      | 1  | "Julio"  | "ingeniero"  |
      | 2  | "Jose"   | "carpintero" |
      | 3  | "Juan"   | "pintor"     |
      | 4  | "Pedro"  | "cantante"   |
      | 5  | "Andres" | "musico"     |
      | 6  | "Torres" | "joyero"     |
      | 7  | "Laura"  | "modista"    |