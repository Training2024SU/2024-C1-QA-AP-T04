Feature: Servicios

  @rutaExitosa
  Scenario Outline: Obtener comics donde aparece heroe
    Given el usuario accede al servicio de busqueda de marvel
    When hace una peticion de tipo get con el id de heroe <ID>
    Then deberia obtener un codigo de respuesta 200
    And deberia obtener objetos json con su formato de tipo "Comic"
    Examples:
    |   ID     |
    | 1011334  |



