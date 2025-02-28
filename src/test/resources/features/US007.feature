Feature:As a user (Sales and Store manager), I should be able to select any vehicle from the
  Vehicles page (web table)

  Background: User is already in the login page
    Given the user is on the login page


  Scenario Outline:Verify that once the users launch on the Vehicles page,they can see all the checkboxes
  as unchecked.
    When  user logged in with username as "<userName>" and password as "<password>"
    When user hover the Fleet icon on base page
    And user can see Vehicles icon and click on it
    When user launch on the Vehicles page
    And  user can see all the checkboxes
    Then Verify that  all the checkboxes as unchecked

    Examples:
      | userName        | password    |
      | salesmanager102 | UserUser123 |
      | storemanager51  | UserUser123 |

  @vcheck
    Scenario Outline: Verify that users can check the first checkbox to select all the cars
      When  user logged in with username as "<userName>" and password as "<password>"
      When user hover the Fleet icon on base page
      And user can see Vehicles icon and click on it
      When user launch on the Vehicles page
      And  user can see first checkboxes
      Then Verify that users can check the first checkbox to select all the cars

      Examples:
        | userName        | password    |
        | salesmanager102 | UserUser123 |
        | storemanager51  | UserUser123 |


  Scenario Outline: Verify that users can select any car(checkboxes)
    When  user logged in with username as "<userName>" and password as "<password>"
    When user hover the Fleet icon on base page
    And user can see Vehicles icon and click on it
    When user launch on the Vehicles page
    And  user can select any car_checkbox
    Then Verify that users can select any car

    Examples:
      | userName        | password    |
      | salesmanager102 | UserUser123 |
      | storemanager51  | UserUser123 |
