Feature: pruebas al servicio gratutito weather api
  Yo como usuario del servicio de weather api
  quiero poder solicitar los servicios que ofrece
  para poder informarme sobre el clima en diversas partes del mundo

  @RutaFeliz
  Scenario Outline: Servicio retorna clima actual de la ciudad
    Given que el usuario esta en la pagina de weather api
    When el usuario solicita el clima actual de la ciudad "<ciudad>"
    Then deberia obtener un codigo de respuesta 200
    And deberia de retornar la informacion de la ciudad de "<ciudad>" del pais "<pais>"

    Examples:
    |ciudad         | pais      |
    |Sabaneta       | Colombia  |
    |Lima           | Peru      |
    |Bogota         | Colombia  |
    |Santiago       | Chile     |
    |Buenos Aires	| Argentina |
    |Rio de Janeiro	| Brazil    |
    |Montevideo	    | Uruguay   |
    |Quito	        | Ecuador   |
    |La Paz	        | Bolivia   |
    |Asuncion	    | Paraguay  |

  @RutaFeliz
  Scenario: Servicio genera error si el request no esta autenticado
    Given que el usuario esta en la pagina de weather api
    When el usuario solicita el clima actual de la ciudad "Cartagena" sin API KEY
    Then deberia obtener un codigo de respuesta 401
    And deberia retornar de no autorizado

@RutaFeliz
  Scenario: Servicio retorna la ciudad capital cuando se pregunta por el clima de una pais entero
    Given que el usuario esta en la pagina de weather api
    When el usuario solicita el clima actual de la ciudad "Colombia"
    Then deberia obtener un codigo de respuesta 200
    And deberia de retornar la informacion de la ciudad de "Bogota" del pais "Colombia"