Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And Navigate to Country Page
    When Create a new country
    Then Success message should be displayed

  Scenario: Delete Country
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And Navigate to Country Page