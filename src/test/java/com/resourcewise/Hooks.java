package com.resourcewise;

import com.resourcewise.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.goToUrl();
        driverManager.maxBrowser();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
