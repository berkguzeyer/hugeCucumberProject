Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Citizenships page

  Scenario Outline: Create a Citizenship
    Given Navigate to Citizenships page
    Then Click on add button
    Then Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
    When Click on save button
    Then Success message should be displayed


    Examples:
      | CitizenshipName | CitizenshipShortName |
      | BRK1            | brk1                 |
      | BRK2            | brk2                 |
      | BRK3            | brk3                 |
      | BRK4            | brk4                 |


    Scenario Outline:
      And Search for Citizenship with name as "<CitizenshipName>" and short name as "<CitizenshipShortName>"
      And Delete citizenship
      Then Success message should be displayed


      Examples:
        | CitizenshipName | CitizenshipShortName |
        | BRK1            | brk1                 |
        | BRK2            | brk2                 |
        | BRK3            | brk3                 |
        | BRK4            | brk4                 |