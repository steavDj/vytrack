
@us01
Feature: Display main modules depending on the logged in user

  As a user,
  I want to view and verify the main modules on the navigation bar
  So that I can validate different modules appearing for each user type

  Background: User is already in the login page

  @us01_ac1 @us01_storeManager
  Scenario Outline: Verify that Store Manager can see the 8 Main Modules
  Given the user logged in with username as "<username>" and password as "<password>"
  Then the User should see the following main modules:

    | Dashboards         |
    | Fleet              |
    | Customers          |
    | Sales              |
    | Activities         |
    | Marketing          |
    | Reports & Segments |
    | System             |

    Examples:
      | username        | password    |
      | storemanager85  | UserUser123 |
      | storemanager90  | UserUser123 |

  @us01_ac1 @us01_salesManager
  Scenario Outline: Verify that Store Manager can see the 8 Main Modules
    Given the user logged in with username as "<username>" and password as "<password>"
    Then the User should see the following main modules:

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | username        | password    |
      | salesmanager85  | UserUser123 |
      | storemanager90  | UserUser123 |

  @us01_ac2 @us01_driver
  Scenario Outline: Verify that Store Manager can see the 4 Main Modules
    Given the user logged in with username as "<username>" and password as "<password>"
    Then the User should see the following main modules:

      | Fleet              |
      | Customers          |
      | Activities         |
      | System             |

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | user2           | UserUser123 |
