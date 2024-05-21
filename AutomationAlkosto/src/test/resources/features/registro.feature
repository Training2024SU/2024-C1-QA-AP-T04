#Autor: Andreina Iglesias

Feature: Formulario de registro
  Yo como usuario sin registrar en la pagina alkosto
  quiero llenar el formulario de registro
  para poder ingresar y obtener los beneficios de la página

#Usar 1 para navegador Chrome y 2 para Edge

  @RutaFeliz
  Scenario: Inscripcion correcta
    Given que el usuario "actor1" selecciona el navegador 1 e ingresa al sitio web
    When ingresa su informacion correctamente
    Then deberia ser redirigido a la pagina con la sesion iniciada
