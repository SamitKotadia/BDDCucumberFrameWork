package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.RegistrationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class RegistrationSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    RegistrationPage registrationPage = new RegistrationPage();

    @When("^I click on registration$")
    public void i_click_on_registration() throws Throwable {
     registrationPage.clickRegistrationBtn();
    }

    @When("^I select Gender as \"([^\"]*)\"$")
    public void i_select_Gender_as(String gender) throws Throwable {
    switch (gender){
        case "male":
            registrationPage.maleGender();
            break;
        case "female":
            registrationPage.femaleGender();
            break;
    }
    }

    @When("^I enter my First \"([^\"]*)\" name and Last name \"([^\"]*)\"$")
    public void i_enter_my_First_name_and_Last_name(String firstName, String lastName) throws Throwable {
    registrationPage.enterFirstName(firstName);
    registrationPage.enterLastName(lastName);
    }

    @When("^I select my Day of Birth, Month of Birth and Year of Birth$")
    public void i_select_my_Day_of_Birth_Month_of_Birth_and_Year_of_Birth() throws Throwable {
    registrationPage.dateOfBirth();
    }

    @When("^I enter valid Email Address \"([^\"]*)\"$")
    public void i_enter_valid_Email_Address(String email) throws Throwable {
    String myActualEmailAdd = registrationPage.enterEmail(email);
    }

    @When("^I enter Company name as \"([^\"]*)\"$")
    public void i_enter_Company_name_as(String companyName) throws Throwable {
    registrationPage.enterCompanyName(companyName);
    }

    @When("^I select newsletter$")
    public void i_select_newsletter() throws Throwable {
    registrationPage.newLetter();
    }

    @When("^I enter my Password as \"([^\"]*)\" and confirm password as \"([^\"]*)\"$")
    public void i_enter_my_Password_as_and_confirm_password_as(String password, String confirmPassword) throws Throwable {
    registrationPage.enterPassword(password);
    registrationPage.enterConfirmPassword(confirmPassword);
    }

    @Then("^I click on registration button$")
    public void i_click_on_registration_button() throws Throwable {
    registrationPage.submitRegistration();
    }

    @When("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable registrationTable) throws Throwable {
        List<Map<String, String>> data;
        data =  registrationTable.asMaps(String.class, String.class);
        System.out.println(data);
        registrationPage.enterFirstName(data.get(0).get("firstName"));
        registrationPage.enterLastName(data.get(0).get("lastName"));
        registrationPage.enterEmail(data.get(0).get("email"));
        registrationPage.enterPassword(data.get(0).get("password"));
        registrationPage.enterConfirmPassword(data.get(0).get("confirmPassword"));


        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }

}
