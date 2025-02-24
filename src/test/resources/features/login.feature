@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify login with different user types
    Given the user logged in as "driver"

  Scenario: Verify login with different credentials
    Given the user logged in with username as "User1" and password as "UserUser123"

  Scenario Outline: Each user should see edit car info icons on the Vehicles page
    Given the user logged in with username as "<username>" and password as "<password>"
    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |





