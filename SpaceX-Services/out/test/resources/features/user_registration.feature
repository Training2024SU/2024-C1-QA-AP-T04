Feature: User Registration
  As an user of the app
  I want to be able to register a new user
  So that can use the app's services

  @RegisterUser
  @Services
  Scenario: Register a new user
    Given the user is on the "https://reqres.in/" in page
    When makes a post request to "api/register"
    Then it should receive a code 200
    And should get an id and a token
