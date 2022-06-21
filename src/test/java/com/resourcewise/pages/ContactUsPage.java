package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage extends DriverManager {

    @FindBy(how = How.XPATH,using = "//input[@id='FullName']")
    WebElement nameOnContactUs;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement textContactUsEmail;

    @FindBy(how = How.XPATH,using = "//textarea[@id='Enquiry']")
    WebElement enquiryTextBox;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitButtonOnContactUs;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Your enquiry has been successfully sent to the sto')]")
    WebElement contactUsDisplayMassage;

    public String getContactUsDisplayMassage(){
        return contactUsDisplayMassage.getText();
    }

    public void clickOnSubmitOnContactUs(){
        submitButtonOnContactUs.submit();
    }

    public void enterTextInEnquiryBox(String myText){
        enquiryTextBox.sendKeys(myText);
    }

    public void enterContactUsEmail(String myEmail){
        textContactUsEmail.sendKeys(myEmail);
    }

    public void enterNameOnContactUs(String enterName){
        nameOnContactUs.sendKeys(enterName);
    }
}
