Feature: Login Functionality

  Scenario Outline: User login with valid credentials
    Given user visits the websites
    When user enter username "<username>" and password "<password>"
    Then user can view the Home page
    And browser closes
    Examples:
      | username      | password     |
      | release3410lea1@mailinator.com | Test@123 |
      | release3410lea1@mailinator.com  | Test@123 |

  Scenario Outline: User login with invalid credentials
    Given user visits the websites
    When user enter username "<username>" and password "<password>"
    Then user can't view the Home page
    And browser closes
    Examples:
      | username      | password    |
      | standar_user | secret_sauce |
      | proble_user  | secret_sauce |