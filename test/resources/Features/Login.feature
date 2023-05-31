Feature: Nopcommerce Login


  @Login
  Scenario: Nopcommerce Valid Login Test
    When User click on Login link
    And User is on login page and verify the login page
    And User enter valid username and valid password and click on login button
    And User is on home page and verify the home page title
