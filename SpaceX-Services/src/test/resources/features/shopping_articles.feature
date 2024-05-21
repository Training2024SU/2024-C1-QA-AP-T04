Feature: SpaceX Shop User Experience

  As a user,
  I want to register and shop on the SpaceX website
  So that I can explore and purchase space-related merchandise.

  Background:
    Given I am on the main SpaceX website and ready to shop

  @Registration
    @Shopping
  Scenario Outline: Registration Process
    When the user selects creates a new account
    And enters their "<firstname>" "<lastname>" "<email>" "<password>"
    Then they should be directed to the main page

    Examples:
      | firstname | lastname | email                | password |
      | John      | Doe      | johnddddoe@example.com  | ##pass123##"$%dD  |

  @Purchase
  @Shopping
  Scenario: Purchasing an Item
    When the user adds an article to their cart
    And enters their shipping information
    And enters their payment information
    Then they should see a message with the total purchase amount

