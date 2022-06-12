package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();


    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
    String myActualUrl= driverManager.getUrl();
        System.out.println(myActualUrl);
        //assertThat(myActualUrl,is(endsWith("nopcommerce.com")));
        assertThat(myActualUrl,is(endsWith("nopcommerce.com/")));

    }
    @Given("^I scroll to footer$")
    public void i_scroll_to_footer() throws Throwable {
    homePage.scrollToPrivacyPolicy();
    }

    @When("^I click on privacy policy$")
    public void i_click_on_privacy_policy() throws Throwable {
    homePage.clickToPrivacyPolicy();
    }

    @Then("^I take screenshot of search field$")
    public void iTakeScreenshotOfSearchField() throws IOException {
        homePage.takeSearchFieldScreenshot();
    }




}

