Feature: Get service Marvel Events
  I as the user of the web page Marvel Developers
  want to be able to use the get services
  For having access to the information of the events
  @happyEnd1
  Scenario: Get all events information
    Given the user is in the web page Marvel Developers
    When sent a GET petition to the resource "/v1/public/events"
    Then it should obtain a answer code 200
    And it should be able to see the information of the events