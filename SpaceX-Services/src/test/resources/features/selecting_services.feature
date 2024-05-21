Feature: Accessing SpaceX Main Services

  As a user,
  I want to easily access SpaceX's main services
  So that I can learn about their offerings.

  Background:
    Given I am on the main SpaceX webpage

  @AccessServices
  Scenario Outline: Accessing SpaceX Main Services
    When the user selects the service "<option>"
    Then should leave the main page

    Examples:
      | option|
      | Rideshare|
      |Starshield|



