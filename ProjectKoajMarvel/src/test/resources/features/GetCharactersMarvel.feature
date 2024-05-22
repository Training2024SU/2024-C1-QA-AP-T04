Feature: Get service Marvel Characters
  I as the user of the web page Marvel Developers
  want to be able to use the get services
  For having access to the information of the characters
  @happyEnd1
  Scenario: Get all characters information
    Given the user is in the web page Marvel Developers
    When sent a GET petition to the resource "/v1/public/characters"
    Then it should obtain a answer code 200
    And it should be able to see the information of the characters