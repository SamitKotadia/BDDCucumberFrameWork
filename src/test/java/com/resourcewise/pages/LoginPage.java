package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(css=".page-title")
    WebElement welcomeSignInText;

    @FindBy(css = "#Email")
    WebElement mymail;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy (id = "Password")
    WebElement passwordInputField;

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(css = ".login-button")
    WebElement loginSubmitButton;

    public void clickOnLoginBtn(){
        waitUntilElementIsVisible(loginButton,20,"Login button is not visible");
        loginButton.click();
    }

    public String getWelcomeMassageOnLoginPage(){
        return welcomeSignInText.getText();
    }

    public void mail(){
        mymail.sendKeys("kotadia@kotadia.com");
    }

    public void enterLoginCredential(String email, String password){
        emailInputField.clear();
        emailInputField.sendKeys(email);
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }
    public void clickOnLoginSubmitButton(){
        loginSubmitButton.click();
    }


}


