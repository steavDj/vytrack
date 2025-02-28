Feature: Display main modules select bar for logged-in users


  Scenario: Driver sees the correct modules.
    Given the user is logged in as driver
    Then user should see four modules in the select bar

  Scenario: Sales Manager sees the correct modules

    Given the user is logged in as sales manager
    Then user should see eight modules in the select bar
  @driverWipMansur
  Scenario: Store Manager sees the correct modules

    Given the user is logged in as store manager
    Then user logged in as store manager should see eight modules in the select bar