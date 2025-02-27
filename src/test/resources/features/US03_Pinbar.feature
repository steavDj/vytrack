Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @pinbar
  Scenario Outline: Learn how to use the pinbar as a user.
    Given the user logged in with username as "<username>" and password as "<password>"
    When user click the Learn how to use this space link on the homepage
    Then user sees "How To Use Pinbar" as a main header
    Then user sees "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user sees an image on the page

    Examples:
      | username        | password    |
      | user3           | UserUser123 |
      | storemanager53  | UserUser123 |
      | salesmanager103 | UserUser123 |
