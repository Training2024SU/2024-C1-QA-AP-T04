Feature:  prueba del servicio GET pagina marvel
  yo como usuario de la pagina de marvel
  quiero probar un servicio de tipo get
  para obtener una lista de comics

  @prueba1
  Scenario: solicitud de comics
    Given que el usuario esta en la pagina de "https://gateway.marvel.com:443/v1/public"
    When envia una peticion de tipo get al recurso "/series"
    Then deberia obtener un codigo de respuesta 200
    And deberia obtener una lista de los comics