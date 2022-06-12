package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.CheckOutPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CheckOutSteps extends DriverManager{

    DriverManager driverManager = new DriverManager();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Then("^I enter following details on checkout page$")
    public void i_enter_following_details_on_checkout_page(DataTable checkoutDataTable) throws Throwable {
        List<Map<String, String>> data =  checkoutDataTable.asMaps(String.class, String.class);
        System.out.println(data);
        checkOutPage.setCountrySelection(data.get(0).get("country"));
        checkOutPage.setStateSelection(data.get(0).get("state"));
        checkOutPage.enterCityName(data.get(0).get("city"));
        checkOutPage.enterAddress1(data.get(0).get("address1"));
        checkOutPage.enterAddress2(data.get(0).get("address2"));
        checkOutPage.enterZipCode(data.get(0).get("postcode"));
        checkOutPage.enterPhoneNumber(data.get(0).get("phoneNumber"));

    }

    @Then("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
     checkOutPage.clickOnContinueOnCheckOut();
    }

    @Then("^I click on \"([^\"]*)\" option$")
    public void i_click_on_option(String actualShippingMethod) throws Throwable {
        Thread.sleep(3000);
        switch (actualShippingMethod){
            case "Ground ($0.00)":
                checkOutPage.groundShippingBtn();
                break;
            case "Next Day Air ($0.00)":
                checkOutPage.nextDayShippingBtn();
                break;
            case "2nd Day Air ($0.00)":
                checkOutPage.secondDayShippingBtn();
                break;

        }Thread.sleep(3000);
    }
    @Then("^I click on continue button on shipping method$")
    public void i_click_on_continue_button_on_shipping_method() throws Throwable {
      checkOutPage.ClickShippingContinueBtn();
    }

    @Then("^I select credit card$")
    public void i_select_credit_card() throws Throwable {
    checkOutPage.selectCreditCardPaymentMethod();
    }

    @Then("^I click on continue button on payment method$")
    public void i_click_on_continue_button_on_payment_method() throws Throwable {
    checkOutPage.clickContinueOnPaymentMethod();
    }

    @Given("^I enter following details on the payment page$")
    public void i_enter_following_details_on_the_payment_page(DataTable paymentCardTable) throws Throwable {
        List<Map<String, String>> data =  paymentCardTable.asMaps(String.class, String.class);
        checkOutPage.setSelectPaymentCardType(data.get(0).get("cardType"));
        checkOutPage.setTxtCardHolderName(data.get(0).get("cardName"));
        checkOutPage.setTxtCardNumber(data.get(0).get("cardNumber"));
        checkOutPage.enterExpMonth("07");
        checkOutPage.enterExpYear("2025");
        checkOutPage.enterCVVNumber(data.get(0).get("cardCode"));
    }

    @Given("^I click on continue button on payment information$")
    public void i_click_on_continue_button_on_payment_information() throws Throwable {
        checkOutPage.clickPaymentContinueBtn();
    }
    @When("^I click on confirm button$")
    public void i_click_on_confirm_button() throws Throwable {
        checkOutPage.clickOnConfirmOrder();
    }
    @Then("^I should see \"([^\"]*)\" text on confirmation page$")
    public void i_should_see_text_on_confirmation_page(String expConfirmationMassage) throws Throwable {
        String actualConfirmation = checkOutPage.getOrderPassMassage();
        assertThat(actualConfirmation, is(equalToIgnoringCase(expConfirmationMassage)));
        System.out.println(actualConfirmation);
    }

    }

