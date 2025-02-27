
Feature: Accessing and viewing columns on the Vehicles Model page

  As a user,
  I want to view the columns presented on the Vehicles Model page
  So that I can verify contents on the page and check access permissions for different roles

  Background: User is already in the log in page
#    Given the user is logged in as a

  Scenario: Verify Stores Manager can view the 10 columns on the Vehicle Models page
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Then the user navigates to VehiclesModel page
    Then the following column should be displayed:

      | MODEL NAME                |
      | MAKE                      |
      | CAN BE REQUESTED          |
      | CVVI                      |
      | CO2 FEE (/MONTH)          |
      | COST (DEPRECIATED)        |
      | TOTAL COST (DEPRECIATED)  |
      | CO2 EMISSIONS             |
      | FUEL TYPE                 |
      | VENDORS                   |
#
#    @wip @store_manager
#      Scenario: Verify Stores Manager and Salthe following column should be displayed:es Manager can view the user is logged in as a the 10 columns on the Vehicle Models page
#      Given the user is on the Vehicles Model page
#      Then the following columns should be displayed:
#        | MODEL NAME                |
#        | MAKE                      |
#        | CAN BE REQUESTED          |
#        | CVVI                      |
#        | CO2 FEE (/MONTH)          |
#        | COST (DEPRECIATED)        |
#        | TOTAL COST (DEPRECIATED)  |
#        | CO2 EMISSIONS             |
#        | FUEL TYPE                 |
#        | VENDORS                   |
#
#    @wip @sales_manager
#      Scenario: Verify Stores Manager and Sales Manager can view the 10 columns on the Vehicle Models page
#      Given the user is on the Vehicles Model page
#      Then the following columns should be displayed:
#        | MODEL NAME                |
#        | MAKE                      |
#        | CAN BE REQUESTED          |
#        | CVVI                      |
#        | CO2 FEE (/MONTH)          |
#        | COST (DEPRECIATED)        |
#        | TOTAL COST (DEPRECIATED)  |
#        | CO2 EMISSIONS             |
#        | FUEL TYPE                 |
#        | VENDORS                   |
#
#    @wip @driver
#      Scenario: Verify Drivers cannot access the Vehicles Model page
#        Given user is logged in as a Driver
#        When user navigates to the Vehicles Model page
#        Then user should see the message "You do not have permission to perform this action."
