
Feature: Access control for Vehicle Contracts page

  Background: User is already on the login page
    Given the user is on the login page
@wip
  @vehicle_contracts @access
  Scenario: Verify sales manager access to the Vehicle Contracts page
   When the user logs in with "salesmanager101" and "UserUser123"
   And the user navigates to the Vehicle Contracts page
   Then the user should have access to the Vehicle Contracts page
@wip
  Scenario: Verify store manager access to the Vehicle Contracts page
    When the user logs in with "storemanager85" and "UserUser123"
    And the user navigates to the Vehicle Contracts page
    Then the user should have access to the Vehicle Contracts page
  @wip
   Scenario: Driver tries to access the Vehicle Contracts page
     When the user logs in with "user1" and "UserUser123"
     And the user cannot access the Vehicle Contracts page
     Then the Driver should see the error message "You do not have permission to perform this action."







