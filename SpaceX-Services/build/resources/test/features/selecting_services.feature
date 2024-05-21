Feature: Accessing SpaceX Main Services

  As a user,
  I want to easily access SpaceX's main services
  So that I can learn about their offerings.

  Background:
    Given I am on the main SpaceX webpage

  @AccessServices
  Scenario Outline: Accessing SpaceX Main Services
    When the user selects the service "<option>"
    Then they should see a message indicating the selected service page

    Examples:
      | option          |
      | Rockets         |

