Feature: pruebas del servicio GET
  yo como usuario de los servicios Reqres
  quiero poder obtener los datos personales
  para estar informado y actualizado

  @rutafeliz
  Scenario Outline: Solicitud de usuario por id
    Given que el usuario esta en la pagina de "https://reqres.in"
    When envia una peticion de tipo Get al recurso "/api/users/" y el id <id>
    Then deberia obtener un codigo de respuesta <respuesta>
    And deberia obtener la informacion del usuario <usuario>
    Examples:
      | id | respuesta | usuario   |
      | 1  | 200       | "George"  |
      | 2  | 200       | "Janet"   |
      | 3  | 200       | "Emma"    |
      | 4  | 200       | "Eve"     |
      | 5  | 200       | "Charles" |
      | 6  | 200       | "Tracey"  |
      | 7  | 200       | "Michael" |