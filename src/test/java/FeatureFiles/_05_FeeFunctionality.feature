Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Navigate to the fee page

  Scenario: Create a Fee
    And Click on add button
    And Fill the add fee form
      | Bryan      |
      | Test321AS654 |
      | A7F23dfZ   |
      | 4799        |
    When Click on save button
    Then Success message should be displayed

    Scenario: Delete a Fee
      Given Search for the fee
        | Bryan      |
        | Test321AS654 |
        | 4799   |
      When Delete fee
      Then Success message should be displayed
