package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(css=".page-title")
    WebElement welcomeSignInText;

    public String getWelcomeMassageOnLoginPage(){
        return welcomeSignInText.getText();
    }
}
