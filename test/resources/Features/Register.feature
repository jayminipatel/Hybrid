Feature: Nopcommerce RegisterPage
  @Register
  Scenario: Nopcommerce Valid Register Test
    When User click on Register Link
    And Enter Firstname and Lastname and Email and Password and ConfirmPassword
    And click on Register button