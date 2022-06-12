package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(className = "ico-register")
    WebElement registrationBtn;

    @FindBy(css = "#gender-male")
    WebElement maleGenderSelect;

    @FindBy(css = "gender-female")
    WebElement femaleGenderSelect;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMsg;

    @FindBy(id = "FirstName")
    WebElement myFirstName;

    @FindBy(css = "#LastName")
    WebElement myLastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirth;

    @FindBy(id = "Email")
    WebElement myEmail;

    @FindBy(id = "Company")
    WebElement companyName;

    @FindBy(css = "input#Newsletter")
    WebElement newsLetterBtn;

    @FindBy(id = "Password")
    WebElement myPassword;

    @FindBy(id = "ConfirmPassword")
    WebElement myConfirmPassword;

    @FindBy(id = "register-button")
    WebElement regiSubmit;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement getRegiMassage;

    public String actualRegiMassage(){
       getRegiMassage.getText();
        return null;
    }

    public void clickRegistrationBtn(){
        registrationBtn.click();
    }
    public void maleGender(){
     maleGenderSelect.click();
        }
     public void femaleGender(){
        femaleGenderSelect.click();
     }
    public String registrationMassage(){
      return registrationMsg.getText();
    }
    public void enterFirstName(String firstName){
        myFirstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        myLastName.sendKeys(lastName);
    }
    public void dateOfBirth(){
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByIndex(3);
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByValue("4");
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByVisibleText("2000");
    }
    public String enterEmail(String email){
        int myRandomNumber = driverManager.generateRandomNumber();
        myEmail.sendKeys(myRandomNumber+email);
        return email;
    }

    public void enterCompanyName(String myCompanyName){
        companyName.sendKeys(myCompanyName);
    }

    public void newLetter(){
        //newsLetterBtn.clear();
        newsLetterBtn.click();
    }

    public void enterPassword(String pass){
        myPassword.sendKeys(pass);
    }
    public void enterConfirmPassword(String confirmPass){
        myConfirmPassword.sendKeys(confirmPass);
    }

    public void submitRegistration(){
        regiSubmit.submit();
    }
    }





