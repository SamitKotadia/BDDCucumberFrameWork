package com.resourcewise.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    String browser="chrome";
    String url ="https://demo.nopcommerce.com/";

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void runOnLocalBrowser() throws IllegalAccessException {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;
            case "safari":
                driver= new SafariDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new IllegalAccessException("Unexpected browser");
        }
    }
    public void maxBrowser(){
    driver.manage().window().maximize();
}
    public void applyImplicitWait(){
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
    public void sleepBrowser(int milliSecond) throws InterruptedException {
        Thread.sleep(milliSecond);
    }
    public void goToUrl(){
        driver.get(url);
    }
    public String getUrl(){
       return driver.getCurrentUrl();
    }
}
