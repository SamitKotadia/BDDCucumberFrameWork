Feature:Contact Us feature
  As a customer
  I want to send my enquiry

  @ContactUs
  Scenario: Contact us feature without login
    Given I am on the home page
    And I scroll to "Contact Us" on home page
    When I click on "Contact Us"
    And I enter my name as "Samit Kotadia" on Contact Us page
    And I enter Email Address as "Samit@sa.com" on Contact us page
    And I enter text in "Enquiry" box as "I want to purchase product"
    Then I click on the submit button on Contact us page
    And I should see "Your enquiry has been successfully sent to the store owner" text on "Contact Us" page