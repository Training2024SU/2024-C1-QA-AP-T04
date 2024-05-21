#Author: Andreina Iglesias

Feature: Formulario de inicio de sesion
  Yo como usuario sin registrar en la pagina alkosto
  quiero llenar el formulario de registro
  para poder ingresar y obtener los beneficios de la página

#Usar 1 para navegador Chrome y 2 para Edge

  @RutaFeliz
  Scenario: Login
    Given que el usuario "actor1" selecciona el navegador 1 e ingresa al sitio web
    And se autentica con sus datos correctamente
    When ingresa sus credenciales de usuario registrado correctamente
    Then deberia ser redirigido a la pagina con su sesion iniciada
