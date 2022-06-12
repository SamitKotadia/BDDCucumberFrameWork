
Feature: Registration feature

  Scenario: Successful registration
    Given I am on the home page
    When I click on registration
    And I select Gender as "male"
    And I enter my First "Samit" name and Last name "Kotadia"
    And I select my Day of Birth, Month of Birth and Year of Birth
    And I enter valid Email Address "samit@samit.com"
    And I enter Company name as "Marvel"
    And I select newsletter
    And I enter my Password as "12345678" and confirm password as "12345678"
    Then I click on registration button
    And I should see "Your registration completed" text on "registration" page
    And The url should contain with "/registerresult"



  Scenario: Successful registration with data table
    Given I am on the home page
    When I click on registration
    And I select Gender as "male"
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | sam    | sam    | sam@gmail.com | hello@123 | hello@123       |
    And I select my Day of Birth, Month of Birth and Year of Birth
    And I enter Company name as "Marvel"
    And I select newsletter
    Then I click on registration button
    And I should see "Your registration completed" text on "registration" page
    And The url should contain with "/registerresult"