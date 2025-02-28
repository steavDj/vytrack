# US12: As a user, I want to filter customer's info on the Accounts page.
# AC #1: Verify that users see 8 filter items on the Accounts page
# Expected filter names: Account Name, Contact Name, Contact Email, Contact Phone, Owner, Business Unit,
# Created At, Updated At
# After done, create AC #2 and #3 to test if 8 filter items on the Accounts page are displayed to sale and store manager

Feature:

  Background: User is already in the log in page
    Given the user is on the login page

  @us12
  Scenario Outline: Each user should see 8 filter items on the Account page
    Given the user logged in with username as "<username>" and password as "<password>"
    When user hovers over to the Customers
    And user clicks on the Accounts
    Then user should see below options on the Account page
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |