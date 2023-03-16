Feature: Data Table Usage

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | Brian            |
      | Doe              |
      | 5214 Spring Ave. |
      | 5874584129       |
    Then Save the form

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | John             |
      | Snow             |
      | 2356 Spring Ave. |
      | 8654123658       |
    And Enter Valid information
      | Name      | John             |
      | Last Name | Snow             |
      | Address   | 2356 Spring Ave. |
      | Phone     | 8654123658       |
    Then Save the form

#    `Scenario outline` runs the entire scenario for each set of data
#    `Data table` sends the data only one step at a time and scenario only runs once