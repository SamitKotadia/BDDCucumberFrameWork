Feature: Privacy Policy feature
  As a customer
  I want to see privacy policy

  @Privacy
  Scenario: Validate login page
    Given I am on the home page
    And I scroll to "Privacy policy" on home page
    When I click on "Privacy policy"
   Then I should see "Privacy notice" text on "Privacy" page