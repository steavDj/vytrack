@us08
Feature: Vytrack calendar page functionality
  Agile story: As a user, I want to create a recurring(repetitive) calendar event.

  Background: User is already in the log in page
    Given the user is on the login page

  @us08-ac01
  Scenario Outline: Each user can see number "1" in the Repeat Every option
    Given the user logged in with username as "<username>" and password as "<password>"
    And user click to the Calendar Events
    Then user click to the Create Calendar Event
    When user click on the Repeat checkbox
    Then user see "1" in the Repeat Every option

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |

  @us08-ac02
  Scenario Outline: Each user see error message Repeat Every option is empty
    Given the user logged in with username as "<username>" and password as "<password>"
    And user click to the Calendar Events
    Then user click to the Create Calendar Event
    When user click on the Repeat checkbox
    And user clear Repeat Every field
    Then user see error message "This value should not be blank."

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |
