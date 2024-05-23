Feature: pruebas del servicio GET
  yo como usuario de los servicios Reqres
  quiero poder obtener los datos
  para estar informado

  @rutafeliz
 Scenario: Solicitud de usuarios
    Given que el usuario esta en la pagina de "https://reqres.in"
    When envia una peticion de tipo Get al recurso "/api/users?page=2"
    Then deberia obtener un codigo de respuesta 200
    And deberia obtener una lista con la informacion de los usuarios