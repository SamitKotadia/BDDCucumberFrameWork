package com.resourcewise.pages;

import com.resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BasketPage extends DriverManager {

    Actions actions = new Actions(driver);

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartButton;
    @FindBy(how = How.XPATH, using = "//table[@class='cart']")
    WebElement basketTable;
    @FindBy(how = How.XPATH, using = "//table[@class='cart']/tbody/tr")
    List<WebElement> basketTableRow;
    @FindBy(how = How.XPATH, using = "//table[@class='cart']/tbody/tr/td")
    List<WebElement> basketTableColumns;
    @FindBy(how = How.XPATH, using = "//input[@id='itemquantity11232']")
    WebElement basketQuantityUpdate;
    @FindBy (how = How.XPATH, using = "//button[@id='checkout']")
    WebElement continueShoppingBtn;
    @FindBy (how = How.XPATH, using = "//input[@id='termsofservice']")
    WebElement continueShoppingCheckBox;

    public void clickContinueShoppingCheckBox(){
        continueShoppingCheckBox.click();
    }


    public void clickContinueShoppingBtn(){
        continueShoppingBtn.click();
    }

    public void updateQuantity(String value) throws InterruptedException {
        actions.doubleClick(basketQuantityUpdate).build().perform();
       // basketQuantityUpdate.clear();
        basketQuantityUpdate.sendKeys(value);
        Thread.sleep(3000);
    }

    public int getBasketRows(){
    return basketTableRow.size();
    }
    public int getBasketColumns(){
        return basketTableColumns.size();
    }

    public boolean searchBasketByProduct(String pName){
    boolean productData = false;
    for (int i=1; i<=getBasketRows(); i++){
    String productName= basketTable.findElement(By.xpath("//table[@class='cart']/tbody/tr['+i+']/td[3]/a")).getText();
        System.out.println(productName);
    if (productName.equals(pName)){
        productData = true;
    }
    }
    return productData;
    }

    public void clickOnShoppingCartBtn(){
        shoppingCartButton.click();
    }
}
