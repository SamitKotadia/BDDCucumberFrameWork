package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps extends DriverManager {
    LoginPage loginPage =new LoginPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expectedMassage) throws Throwable {
    String myActualWelcomeMsg =loginPage.getWelcomeMassageOnLoginPage();
        assertThat(myActualWelcomeMsg,is(equalToIgnoringCase(expectedMassage)));

    }

    @Then("^The url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {
    String myActualUrl=driverManager.getUrl();
        assertThat(myActualUrl,containsString(expectedUrl));
    }
}
