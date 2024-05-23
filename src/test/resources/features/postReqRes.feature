Feature: pruebas del servicio POST
  yo como usuario de los servicios Reqres
  quiero poder crear una cuenta
  para poder acceder a los beneficios

  @rutafeliz
  Scenario: Creacion de usuario
    Given que el usuario esta en la pagina de "https://reqres.in"
    When envia una peticion de tipo Post al recurso "/api/users"
    Then deberia obtener un codigo de respuesta 201
    And deberia mostrar la informacion ingresada