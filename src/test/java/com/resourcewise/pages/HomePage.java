package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(css =".ico-login")
    WebElement loginButton;

    public void clickOnLoginButton(){
        loginButton.click();
    }
}
