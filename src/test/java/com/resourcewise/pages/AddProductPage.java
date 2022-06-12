package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddProductPage extends DriverManager {
   Actions actions = new Actions(driver);
  @FindBy(how = How.XPATH,using = "//a[contains(text(),'Computers')]")
    WebElement clickOnComputer;
  @FindBy(how = How.XPATH,using = "//a[contains(text(),'Desktops ')]")
  WebElement clickOnDesktop;
  @FindBy(how = How.XPATH, using = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
  WebElement selectBuildProduct;
  @FindBy(how = How.XPATH, using = "//h2[@class='product-title']//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]")
  WebElement selectDigitalStormProduct;
  @FindBy(how = How.XPATH, using = "//h2[@class='product-title']//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]")
  WebElement selectLenovoProduct;
  @FindBy(how = How.CSS, using = "select#product_attribute_1")
  WebElement selectProcessor;
  @FindBy(how = How.CSS, using = "select#product_attribute_2")
  WebElement selectRAM;
  @FindBy(how = How.CSS, using = "input#product_attribute_3_6")
  WebElement hdd320btn;
  @FindBy(how = How.CSS, using = "input#product_attribute_3_7")
  WebElement hdd400btn;
  @FindBy(how = How.CSS, using = "input#product_attribute_4_8")
  WebElement vistaHomeBtn;
  @FindBy(how = How.CSS, using = "input#product_attribute_4_9")
  WebElement vistaPremium;
  @FindBy(how = How.CSS, using = "input#product_attribute_5_10")
  WebElement microsoftSoftware;
  @FindBy(how = How.CSS, using = "input#product_attribute_5_11")
  WebElement readerSoftware;
  @FindBy(how = How.CSS, using = "input#product_attribute_5_12")
  WebElement commanderSoftware;
  @FindBy(how = How.CSS, using = "input#product_enteredQuantity_1")
  WebElement productQuantity;
  @FindBy(how = How.XPATH, using = "//button[@id='add-to-cart-button-1']")
  WebElement cartButton;





  public void clickOnAddToCartButton() throws InterruptedException {
      cartButton.click();
      Thread.sleep(3000);
  }

  public void setProductQuantity(String value){
      productQuantity.clear();
      productQuantity.sendKeys(value);
  }

  public void setMicrosoftSoftware(){
          microsoftSoftware.click();
          microsoftSoftware.click();
      }
    public void setReaderSoftware(){
     // readerSoftware.clear();
      readerSoftware.click();
    }
    public void setCommanderSoftware(){
    //  commanderSoftware.clear();
      commanderSoftware.click();
    }




  public void selectOperatingSystem(String myOS){
    if (myOS.equals("Vista Premium [+$60.00]")){
        vistaPremium.click();
    }else {
        vistaHomeBtn.click();
    }
  }

  public void setHdd320btn(){
      hdd320btn.click();
  }

  public void setHdd400btn(){
      hdd400btn.click();
  }

  public void setRAM(String myRam){
      Select ram = new Select(selectRAM);
      ram.selectByVisibleText(myRam);
  }

    public void setProcessor(String myProcessor) throws InterruptedException {
        Select processor = new Select(selectProcessor);
        processor.selectByVisibleText(myProcessor);
    }

  public void myProduct(String productName){
  if (productName.equals("Build your own computer")) {
            selectBuildProduct.click();
        } else if (productName.equals("Digital Storm VANQUISH 3 Custom Performance PC")){
            selectDigitalStormProduct.click();
        } else if (productName.equals("Lenovo IdeaCentre 600 All-in-One PC")){
            selectLenovoProduct.click();
        } else{
            closeBrowser();
        }
  }

  public void setClickOnDesktop(){
    actions.moveToElement(clickOnComputer).moveToElement(clickOnDesktop).click().build().perform();
  }

}
