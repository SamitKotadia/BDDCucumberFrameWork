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


