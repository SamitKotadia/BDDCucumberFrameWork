@Login
Feature: Login feature
  As a customer
  I want to login
  So that i can see my Emails

  Scenario: Validate login page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on login page
    And The url should contain with "/login"
#
#  Scenario: Login with valid credentials
#    Given I am on home page
#    When I entre user name and password
#    And I Click on login button
#    Then I should be logged in
