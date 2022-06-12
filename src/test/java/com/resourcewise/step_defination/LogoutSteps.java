package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LogoutPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogoutSteps extends DriverManager{
    LogoutPage logoutPage = new LogoutPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see logout button visible$")
    public void i_should_see_logout_button_visible() throws Throwable {
    boolean isLogoutButtonDisplyed = logoutPage.checkLogoutButtonIsDisplayed();
    assertThat(isLogoutButtonDisplyed, is(true));
    }

}
