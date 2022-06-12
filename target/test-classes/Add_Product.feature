@nv
Feature: Add product in Basket

  Scenario: Add "Build your own computer" product in cart

    Given I am on the home page
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
#    And I update quantity to "1"
#    And I click to accept term and condition
#    And I click on checkout button
#    And I enter following details on checkout page
#      | country        | state | city   | address1       | address2 | postcode | phoneNumber |
#      | United Kingdom | Other | london | 3 Albany court | Kenton   | HA3 9BH  | 01234567891 |
#    And I click on continue button
#    And I click on "Next Day Air ($0.00)" option
#    And I click on continue button on shipping method
#    And I select credit card
#    And I click on continue button on payment method
#    And I enter following details on the payment page
#      | cardName | cardNumber       | cardCode |
#      | nk khunt | 4444333322221111 | 111      |
#    And I click on continue button on payment information
#    When I click on confirm button
#    Then I should see "Thank you" text on confirmation page
#    And I should see "Your order has been successfully processed!" text on confirmation page
#    And the url should contain with "checkout/completed"

