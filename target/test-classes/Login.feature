
Feature: Login feature
  As a customer
  I want to login
  So that i can see my Email

  Scenario: Validate login page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on "login" page
    And The url should contain with "/login"


  Scenario: Login with valid Email and Password
    Given I am on the home page
    When I click on the Log in
    And I enter my username "samit@samit.com" and Password "12345678"
    And I click on login button on login page
    Then I should see logout button visible


  Scenario Outline: Login with more then one Email and Password
    Given I am on the home page
    When I click on the Log in
    And I enter my username "<Email>" and Password "<Password>"
    And I click on login button on login page
    Then I should see logout button visible

    Examples:
      | Email             | Password   |
      | samit@samit.com   | 12345678   |
      | sa@sa.com         | 87654321   |
      | kotadia@gmail.com | Samit@0304 |






