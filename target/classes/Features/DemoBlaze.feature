Feature: Login demoblaze page
  Scenario: Login success demo blaze page
    Given open browser
    Given open demo blaze page
    When enter username and password
    Then verify login
