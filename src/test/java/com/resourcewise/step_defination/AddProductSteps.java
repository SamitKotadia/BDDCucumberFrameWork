package com.resourcewise.step_defination;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.AddProductPage;
import cucumber.api.java.en.*;


public class AddProductSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    AddProductPage navigationPage = new AddProductPage();


    @When("^I click Desktop form header menu$")
    public void i_click_Desktop_form_header_menu() throws Throwable {
        navigationPage.setClickOnDesktop();

    }

    @When("^I select on \"([^\"]*)\"$")
    public void i_select_on(String productName) throws Throwable {
        navigationPage.myProduct(productName);

    }
    @When("^I select \"([^\"]*)\" processor$")
    public void i_select_processor(String myProcessor) throws Throwable {
      navigationPage.setProcessor(myProcessor);

    }

    @When("^I select \"([^\"]*)\" RAM$")
    public void i_select_RAM(String myRam) throws Throwable {
    navigationPage.setRAM(myRam);
    Thread.sleep(3000);
    }

    @When("^I select \"([^\"]*)\" hard drive$")
    public void i_select_hard_drive(String actualHDD) throws Throwable {
     switch (actualHDD){
         case "320 GB":
             navigationPage.setHdd320btn();
             break;
         case "400 GB":
             navigationPage.setHdd400btn();
             break;
     }
        Thread.sleep(300);
    }

    @When("^I select \"([^\"]*)\" operating system$")
    public void i_select_operating_system(String actualOS) throws Throwable {
      navigationPage.selectOperatingSystem(actualOS);
        Thread.sleep(300);
    }


    @When("^I click on \"([^\"]*)\" and \"([^\"]*)\" software$")
    public void i_click_on_and_software(String software1, String software2) throws Throwable {
     navigationPage.setCommanderSoftware();
     navigationPage.setMicrosoftSoftware();
        Thread.sleep(3000);
     }

    @When("^I twice the same product quantity$")
    public void i_twice_the_same_product_quantity() throws Throwable {
     navigationPage.setProductQuantity("2");
        Thread.sleep(3000);
    }

    @When("^I click on add to cart button$")
    public void i_click_on_add_to_cart_button() throws Throwable {
    navigationPage.clickOnAddToCartButton();
        Thread.sleep(3000);
    }



    }


