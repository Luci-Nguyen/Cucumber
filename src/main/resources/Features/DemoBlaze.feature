Feature: Login demoblaze page

  Scenario Outline: Login success demo blaze page
    Given open browser
    And open demo blaze page
    When enter <username> and <password>
    And click login button
    Then verify login
    Examples:
      | username | password |
      | hoan     | 123456   |