Feature: Exploring Rockets

  As a user,
  I want to view details about SpaceX rockets
  So that I can learn more about each rocket model.

  Background:
    Given I am on the main SpaceX webpage rockets

  @ViewingRockets
  Scenario Outline: Viewing SpaceX's Rockets
    When the user selects a "<rocket>"
    Then they should see the rocket name

    Examples:
      | rocket  |
      | Falcon  |
