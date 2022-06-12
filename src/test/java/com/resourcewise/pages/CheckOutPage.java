package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

public class CheckOutPage extends DriverManager {

    @FindBy (how = How.XPATH, using = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countrySelection;
    @FindBy(how = How.XPATH, using = "//select[@id='BillingNewAddress_StateProvinceId']")
    WebElement stateSelection;
    @FindBy(how = How.XPATH, using = "//input[@id='BillingNewAddress_City']")
    WebElement txtCity;
    @FindBy (how = How.XPATH, using = "//input[@id='BillingNewAddress_Address1']")
    WebElement txtAddress1;
    @FindBy (how = How.XPATH, using = "//input[@id='BillingNewAddress_Address2']")
    WebElement txtAddress2;
    @FindBy (xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement txtZipCode;
    @FindBy (xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement txtPhoneNumber;
    @FindBy (xpath = "//button[@class='button-1 new-address-next-step-button' and @onclick='Billing.save()']")
    WebElement continueOnCheckOut;
    @FindBy(xpath = "//input[@id='shippingoption_0']")
    WebElement groundShipping;
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayShipping;
    @FindBy (xpath = "//input[@id='shippingoption_2']")
    WebElement secondDayShipping;
    @FindBy (xpath = "//button[@class='button-1 shipping-method-next-step-button' and @onclick='ShippingMethod.save()']")
    WebElement shippingContinueBtn;
    @FindBy (xpath = "//input[@id='paymentmethod_1']")
    WebElement selectCreditCard;
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button' and @onclick='PaymentMethod.save()']")
    WebElement continueOnPaymentMethod;
    @FindBy (xpath = "//select[@id='CreditCardType']")
    WebElement selectPaymentCard;
    @FindBy (xpath = "//input[@id='CardholderName']")
    WebElement txtCardHolderName;
    @FindBy (xpath = "//input[@id='CardNumber']")
    WebElement txtCardNumber;
    @FindBy (xpath = "//select[@id='ExpireMonth']")
    WebElement selectExpMonth;
    @FindBy (xpath = "//select[@id='ExpireYear']")
    WebElement selectExpYear;
    @FindBy (xpath = "//input[@id='CardCode']")
    WebElement txtCardCCVNumber;
    @FindBy (xpath = "//button[@class='button-1 payment-info-next-step-button' and @onclick='PaymentInfo.save()']")
    WebElement paymentContinueBtn;
    @FindBy (xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmOrder;
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYotMassage;
    @FindBy (xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderPassMassage;

    public String getOrderPassMassage(){
        return orderPassMassage.getText();
    }

    public String getThankYouMassage(){
        return thankYotMassage.getText();
    }

    public void clickOnConfirmOrder(){
        confirmOrder.click();
    }

    public void clickPaymentContinueBtn(){
        paymentContinueBtn.click();
    }

    public void enterCVVNumber(String cvvNumber){
        txtCardCCVNumber.sendKeys(cvvNumber);
    }

    public void enterExpYear(String year) {
        Select select = new Select(selectExpYear);
        select.selectByVisibleText(year);
    }

    public void enterExpMonth(String month){
       Select select = new Select(selectExpMonth);
       select.selectByVisibleText(month);
    }

    public void setTxtCardNumber(String cardNumber){
        txtCardNumber.sendKeys(cardNumber);
    }

    public void setTxtCardHolderName(String holderName){
        txtCardHolderName.sendKeys(holderName);
    }

    public void setSelectPaymentCardType(String cardType){
        Select select = new Select(selectPaymentCard);
        select.selectByVisibleText(cardType);
    }

    public void clickContinueOnPaymentMethod(){
        continueOnPaymentMethod.click();
    }

    public void selectCreditCardPaymentMethod(){
        selectCreditCard.click();
    }

    public void ClickShippingContinueBtn(){
        shippingContinueBtn.click();
    }

    public void secondDayShippingBtn(){
        secondDayShipping.click();
    }

    public void nextDayShippingBtn(){
        nextDayShipping.click();
    }

    public void groundShippingBtn(){
        groundShipping.click();
    }


    public void clickOnContinueOnCheckOut(){
        continueOnCheckOut.click();
    }

    public void enterPhoneNumber(String txtNumber){
        txtPhoneNumber.sendKeys(txtNumber);
    }

    public void enterZipCode(String txtCode){
        txtZipCode.sendKeys(txtCode);
    }

    public void enterAddress2(String address2){
        txtAddress2. sendKeys(address2);
    }

    public void enterAddress1(String address1){
        txtAddress1. sendKeys(address1);
    }

    public void enterCityName(String cityName){
        txtCity.sendKeys(cityName);
    }

    public void setStateSelection( String stateName){
        Select select = new Select(stateSelection);
        select.selectByVisibleText(stateName);
    }

    public void setCountrySelection(String countryName){
        Select select = new Select(countrySelection);
        select.selectByVisibleText(countryName);


    }
}
