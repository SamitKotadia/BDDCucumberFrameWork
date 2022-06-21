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
    @Given("^I scroll to \"([^\"]*)\" on home page$")
    public void i_scroll_to_on_home_page(String footerText) throws Throwable {
      switch (footerText){
          case "Privacy policy":
              homePage.scrollToPrivacyPolicy();
              break;
          case "Contact Us":
              homePage.scrollToContactUs();
              break;
      }
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String footerElementClick) throws Throwable {
        switch (footerElementClick){
            case "Privacy policy":
                homePage.clickToPrivacyPolicy();
                break;
            case "Contact Us":
                homePage.clickToContactUs();
                break;
        }
    }



    @Then("^I take screenshot of search field$")
    public void iTakeScreenshotOfSearchField() throws IOException {
        homePage.takeSearchFieldScreenshot();
    }




}

