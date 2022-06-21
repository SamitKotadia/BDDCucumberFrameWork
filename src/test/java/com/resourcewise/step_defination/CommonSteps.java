package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.*;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CommonSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Then("^The url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {
//        switch (expectedUrl) {
//            case "/login":
                String myActualUrl = driverManager.getUrl();
                assertThat(myActualUrl, containsString(expectedUrl));

//                break;
//            case "/registerresult":
//                String myActualregiMassage = registrationPage.actualRegiMassage();
//                assertThat(myActualregiMassage, containsString(expectedUrl));
//                System.out.println(myActualregiMassage);
//                break;
//        }
    }


    @Then("^I should see \"([^\"]*)\" text on \"([^\"]*)\" page$")
    public void i_should_see_text_on_page(String expectedText, String pageType) throws Throwable {
        switch (pageType) {
            case "login":
                String myActualMassage = loginPage.getWelcomeMassageOnLoginPage();
                assertThat(myActualMassage, is(equalToIgnoringCase(expectedText)));
                System.out.println(myActualMassage);
                break;
            case "registration":
                String myRegistrationMassage = registrationPage.registrationMassage();
                assertThat(myRegistrationMassage, is(equalToIgnoringCase(expectedText)));
                System.out.println(myRegistrationMassage);
                break;
            case "confirmation":
               String myCheckOutMassage = checkOutPage.getThankYouMassage();
                assertThat(myCheckOutMassage,is(equalToIgnoringCase(expectedText)));
                System.out.println(myCheckOutMassage);
                break;
            case "Privacy":
                String myPrivacyTextMassage = homePage.getPrivacyTextOnDisplay();
                assertThat(myPrivacyTextMassage, is(equalToIgnoringCase(expectedText)));
                break;
            case "Contact Us":
                String myContactUsTextMassage = contactUsPage.getContactUsDisplayMassage();
                assertThat(myContactUsTextMassage, is(containsString(expectedText)));
                break;


        }

    }

}
