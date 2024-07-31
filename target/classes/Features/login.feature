# Author
# Date
# Description
@SmokeScenario
Feature: feature test login functionality

  @SmokeTest
  Scenario: Check login successful with valid credential
    Given user is login page
    When user input username and password
    And click to button login
    Then user is navigate homepage


#  Scenario Outline: Check login successful with valid credential
#    Given user is login page
#    When user enter <username> and <password>
#    And click to button login
#    Then user is navigate homepage
#    Examples:
#      | username | password |
#      | hoan     | 123456   |