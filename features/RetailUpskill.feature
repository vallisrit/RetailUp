@retupskill
Feature: Retail Upskill Register and login

  Scenario: Retail Upskill Register
    Given I am on " http://retailm1.upskills.in/"
    When I perform "Register" to the website
      | User     | automationtvs6@gmail.com |
      | password | **milk123                |
    Then I successfully registerd

  Scenario: Retail Upskill Login
    Given I am on " http://retailm1.upskills.in/"
    When I perform "Login" to the website
      | User     | automationtvs6@gmail.com |
      | password | **milk123                |
    Then My Account page should get displayed