@wipOl

Feature: The user should be able to type into the Description field when the user create a calendar event

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline:
    Given the user logged in as "<userType>"
    And the user navigates to "Activities" under "Calendar Events"
    And the user navigates to "Create Calendar Event"
    When the user writes the "Hello from batch 38" in "Description"
    Then the user should see the "Hello from batch 38"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |