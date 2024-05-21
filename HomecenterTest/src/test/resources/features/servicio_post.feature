Feature: Create an user in reqres.in

  como usuario de la plataforma reqres.in ,
  quiero registrar una cuenta exitosametente
  So that I can use the platform services

  @ServicioPost
  Scenario: Successfully create a new account
    Given el usuario esta en la plataforma "https://reqres.in/"
    When un POST request servicio es enviado "api/users"
    Then deberia de recibir un code 201
    And el usuario deberia ver la asociacion de la informacion