
@us05
Feature: Accessing and viewing columns on the Vehicles Model page

  As a user,
  I want to view the columns presented on the Vehicles Model page
  So that I can verify contents on the page and check access permissions for different roles

  Background: User is already in the log in page

  @us05_ac1 @us05_storeManager
  Scenario Outline: Verify Store Manager can view the 10 columns on the Vehicle Models page
    Given the user logged in with username as "<username>" and password as "<password>"
    Then the user navigates to VehiclesModel page
    Then the following Store Manager column should be displayed:

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | username        | password    |
      | storemanager85  | UserUser123 |
      | storemanager90  | UserUser123 |
      | storemanager95  | UserUser123 |

  @us05_ac1 @us05_salesManager
  Scenario Outline: Verify Sales Manager can view the 10 columns on the Vehicle Models page
    Given the user logged in with username as "<username>" and password as "<password>"
    Then the user navigates to VehiclesModel page
    Then the following Sales Manager column should be displayed:

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | username       | password    |
      | salesmanager85 | UserUser123 |
      | salesmanager90 | UserUser123 |
      | salesmanager95 | UserUser123 |

  @us05_ac2 @us05_driver
  Scenario Outline: Verify Driver cannot access the Vehicles Model page and gets an error message
    Given the user logged in with username as "<username>" and password as "<password>"
    Then the user navigates to VehiclesModel page
    Then the user gets the error "You do not have permission to perform this action."

    Examples:
      | username       | password    |
      | user1          | UserUser123 |
      | user2          | UserUser123 |
      | user3          | UserUser123 |
