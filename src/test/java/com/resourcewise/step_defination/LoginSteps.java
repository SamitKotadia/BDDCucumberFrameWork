package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expectedMassage) throws Throwable {
        String myActualWelcomeMsg = loginPage.getWelcomeMassageOnLoginPage();
        assertThat(myActualWelcomeMsg, is(equalToIgnoringCase(expectedMassage)));

    }
    @When("^I click on the Log in$")
    public void i_click_on_the_Log_in() throws Throwable {
       loginPage.clickOnLoginBtn();
    }



//    @Then("^i can add email Samit@samit\\.com$")
//    public void i_can_add_email_Samit_samit_com() throws Throwable {
//    loginPage.mail();
//    Thread.sleep(3000);
//    }

    @When("^I enter my username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void i_enter_my_username_and_Password(String actualEmail, String actualPassword) throws Throwable {
    loginPage.enterLoginCredential(actualEmail, actualPassword);


    }

    @When("^I click on login button on login page$")
    public void i_click_on_login_button_on_login_page() throws Throwable {
    loginPage.clickOnLoginSubmitButton();
    }
}
