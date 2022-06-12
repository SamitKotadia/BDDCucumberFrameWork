package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends DriverManager {
    @FindBy(css = ".ico-logout")
    WebElement logoutButton;

    public boolean checkLogoutButtonIsDisplayed(){
       return logoutButton.isDisplayed();
    }
}

