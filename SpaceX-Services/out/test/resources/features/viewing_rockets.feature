Feature: Exploring Rockets

  As a user,
  I want to view details about SpaceX rockets
  So that I can learn more about each rocket model.

  Background:
    Given I am on the main SpaceX webpage

  @ViewingRockets
  Scenario Outline: Viewing SpaceX's Rockets
    When the user selects a "<rocket>"
    Then should leave the main page

    Examples:
      | rocket  |
      |FALCON HEAVY|
      |DRAGON|
      |FALCON 9|
      |STARSHIP|



