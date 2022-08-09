@EndToEnd
Feature: End to End testing

  Scenario:
    Given I am on the home page
    When I click on registration
    And I select Gender as "male"
    And I enter following details to register
      | firstName | lastName | email         | password  | confirmPassword |
      | sam       | sam      | sam@gmail.com | hello@123 | hello@123       |
    And I select my Day of Birth, Month of Birth and Year of Birth
    And I enter Company name as "Marvel"
    And I select newsletter
    Then I click on registration button
    And I should see "Your registration completed" text on "registration" page
    And The url should contain with "/registerresult"
    When I click Desktop form header menu
    And I select on "Build your own computer"
    And I select "2.2 GHz Intel Pentium Dual-Core E2200" processor
    And I select "8GB [+$60.00]" RAM
    And I select "400 GB" hard drive
    And I select "Vista Home [+$50.00]" operating system
    And I click on "Microsoft Office" and "Total Commander" software
    And I twice the same product quantity
    When I click on add to cart button
    Then I click on Shopping cart button
    And I should see "Build your own computer" product in cart page
    And I click to accept term and condition
    And I click on checkout button
    And I enter following details on checkout page
      | country        | state | city   | address1       | address2 | postcode | phoneNumber |
      | United Kingdom | Other | london | 3 Albany court | Kenton   | HA3 9BH  | 01234567891 |
    And I click on continue button
    And I click on "Next Day Air ($0.00)" option
    And I click on continue button on shipping method
    And I select credit card
    And I click on continue button on payment method
    And I enter following details on the payment page
      | cardType | cardName  | cardNumber       | cardCode |
      | Amex     | s kotadia | 1111222233334444 | 122      |
    And I click on continue button on payment information
    When I click on confirm button
    Then I should see "Thank you" text on "confirmation" page
    And I should see "Your order has been successfully processed!" text on confirmation page
    And The url should contain with "checkout/completed"

