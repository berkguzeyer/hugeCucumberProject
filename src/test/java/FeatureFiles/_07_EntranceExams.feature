Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario Outline: Create an Entrance Exam
    Given Go to Entrance Exams page
    And Click on add button
    And Fill the Create Exam form
    |<Exam Name>|
    And Create a description
    |<Description>|
    And Create a note
      |<Note>|
    When Click on save button
    Then Success message should be displayed

    Examples:
      | Exam Name | Description      | Note                |
      | B7 Exam 1 | B7 is good       | Batch will end soon |
#      | B7 Exam 2 | B7 is the best   | Coming soon         |
#      | B7 Exam 3 | B7 is fun        | Get prepared        |
#      | B7 Exam 4 | B7 never give up | Don't give up       |
#      | B7 Exam 5 | B7 is alright    | You can do it       |

