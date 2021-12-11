@retupskill
Feature: Retail Upskill Register and login

  Scenario: Retail Upskill Register
    Given I am on " http://retailm1.upskills.in/"
    When I perform "Register" to the website
      | User     | automationtvs51@gmail.com |
      | password | password                  |
    Then I successfully registerd
    And I perform Logout 
                      

  Scenario: Retail Upskill Login
    Given I am on " http://retailm1.upskills.in/"
    When I perform "Login" to the website
      | User     | automationtvs4@gmail.com |
      | password | password                 |
    Then My Account page should get displayed
