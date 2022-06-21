package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(css =".ico-login")
    WebElement loginButton;
    @FindBy(css = "//a[@href='/']")
    WebElement homePage;
    @FindBy(xpath = "//a[contains(text(),'Privacy notice')]")
    WebElement privacyText;
    @FindBy(id = "small-searchterms")
    private WebElement searchInputField;
    @FindBy(xpath = "//h1[contains(text(),'Privacy notice')]")
    WebElement privacyTextOnDisplay;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement contactUsText;

    public String getPrivacyTextOnDisplay(){
    return    privacyTextOnDisplay.getText();
    }

    public void takeSearchFieldScreenshot() throws IOException {
        takeElementScreenshot(searchInputField, "search");
    }

    public void clickOnHomePage(){
        homePage.click();
    }

    public void clickOnLoginButton(){

        loginButton.click();
    }
    public void scrollToPrivacyPolicy(){
      driverManager.scrollTo(privacyText);
    }

    public void scrollToContactUs(){
        driverManager.scrollTo(contactUsText);
    }

    public void clickToContactUs(){
        contactUsText.click();
    }

    public void clickToPrivacyPolicy(){
        privacyText.click();
    }
}
