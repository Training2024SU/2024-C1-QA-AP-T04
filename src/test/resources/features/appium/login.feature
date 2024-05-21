Feature: Login en la aplicacion Android
  Como usuario de la aplicacion Android,
  Quiero iniciar sesion en la aplicacion,
  Para acceder a mis datos y funcionalidades personalizadas.

  Background:
    Given que el usuario "usuario" en el home eligio la opcion de login

  @TestLogin
  Scenario: Login con credenciales validas
    When el usuario inicia sesion ingresando su nombre "alice" y contrasena "mypassword"
    Then el usuario "alice" deberia ser redirigido a la pagina de inicio de la aplicacion

