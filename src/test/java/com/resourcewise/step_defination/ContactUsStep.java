package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.ContactUsPage;
import cucumber.api.java.en.*;

public class ContactUsStep extends DriverManager {
    DriverManager driverManager = new DriverManager();
    ContactUsPage contactUsPage = new ContactUsPage();

    @When("^I enter my name as \"([^\"]*)\" on Contact Us page$")
    public void i_enter_my_name_as_on_Contact_Us_page(String enterActualName) throws Throwable {
    contactUsPage.enterNameOnContactUs(enterActualName);
    }

    @When("^I enter text in \"([^\"]*)\" box as \"([^\"]*)\"$")
    public void i_enter_text_in_box_as(String textBoxName, String actualTextMassage) throws Throwable {
    switch (textBoxName){
        case "Enquiry":
            contactUsPage.enterTextInEnquiryBox(actualTextMassage);
            break;
    }
    }

    @Then("^I click on the submit button on Contact us page$")
    public void i_click_on_the_submit_button_on_Contact_us_page() throws Throwable {
        contactUsPage.clickOnSubmitOnContactUs();

    }
    @When("^I enter Email Address as \"([^\"]*)\" on Contact us page$")
    public void i_enter_Email_Address_as_on_Contact_us_page(String actualEmail) throws Throwable {
    contactUsPage.enterContactUsEmail(actualEmail);
    }

}
