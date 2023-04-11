Feature: Testing Database

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: States Testing with JDBC
    Given Navigate to States page
    When Send the query "select * from states"
    Then Check if they match with UI

