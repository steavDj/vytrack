@QuestionMark
  Feature: User should access to the Oroinc Documentation page.

    Background: User is already in the log in page
      Given the user is on the login page

    Scenario Outline: User access to the Oroinc Documentation page by clicking the
    question mark icon.
      Given the user logged in with username as "<username>" and password as "<password>"
      When User click the question mark icon
      Then  Verify User access to the Oronic Documentation page

      Examples:
        | username        | password    |
        | user1           | UserUser123 |
        | salesmanager101 | UserUser123 |
        | storemanager85  | UserUser123 |

