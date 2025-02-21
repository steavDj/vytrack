Feature: Vytrack vehicles page functionality
  Agile story: When I am on the Vytrack Vehicles page, I should have access to all features that
  are relevant to my user privileges

  Background: User is already in the log in page
    Given the user is on the login page

  @wipLas
  Scenario Outline: Each user should see edit car info icons on the Vehicles page
    Given the user logged in with username as "<username>" and password as "<password>"
    And user clicks to vehicles module
    Then user should see below options in the edit car info dropdown menu
    |View|
    |Edit|
    |Delete|
#    Then user should see edit icon
#    Then user should see delete icon
    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |
