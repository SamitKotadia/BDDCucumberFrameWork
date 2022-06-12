package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.BasketPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class BasketSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    BasketPage basketPage = new BasketPage();

    @Then("^I click on Shopping cart button$")
    public void i_click_on_Shopping_cart_button() throws Throwable {
    basketPage.clickOnShoppingCartBtn();
    }

    @Then("^I should see \"([^\"]*)\" product in cart page$")
    public void i_should_see_product_in_cart_page(String productTitle) throws Throwable {
     boolean actualProductTitle= basketPage.searchBasketByProduct(productTitle);
        Assert.assertEquals(true,actualProductTitle);
        System.out.println(actualProductTitle);
    }
    @Then("^I update quantity to \"([^\"]*)\"$")
    public void i_update_quantity_to(String value) throws Throwable {
     basketPage.updateQuantity(value);
    }

    @Then("^I click to accept term and condition$")
    public void i_click_to_accept_term_and_condition() throws Throwable {
     basketPage.clickContinueShoppingCheckBox();
    }

    @Then("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {
        basketPage.clickContinueShoppingBtn();
    }


}
