 Feature: Get information about Marvel characters

  As a Marvel fan
  I want to be able to retrieve information about characters
  So that I can learn more about the Marvel universe

   @Marvel
   @Services
   Scenario: Get information about characters
     Given the user is on the "https://gateway.marvel.com/"
     When makes a get request "docs/public"
     Then the response should have a status code 200
     And the response should include information about characters
