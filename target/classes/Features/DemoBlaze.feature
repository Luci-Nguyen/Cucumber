Feature: Login demoblaze page

  @SmokeTest
  Scenario Outline: Login success demo blaze page
    Given open demo blaze page url "<url>"
    And click button login
    When input username "<username>" and password "<password>"
    And click button submit login
    Then verify login
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | hoan     | 123456   |