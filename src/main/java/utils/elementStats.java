package utils;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class elementStats {

    public WebElement getWebElement(AppiumDriver driver, String identifierType, String identifierValue){
        switch (identifierType){
            case"ID":
                return driver.findElement(By.id(identifierValue));
            case"CSS":
                return driver.findElement(By.id(identifierValue));
            case"TAGNAME":
                return driver.findElement(By.id(identifierValue));
            case"XPATH":
                return driver.findElement(By.id(identifierValue));
            default:
                return null;
        }

    }
    public WebElement getListWebElements (AppiumDriver driver, String identifierType, String identifierValue){
        switch (identifierType){
            case"ID":
                return driver.findElement(By.id(identifierValue));
            case"CSS":
                return driver.findElement(By.id(identifierValue));
            case"TAGNAME":
                return driver.findElement(By.id(identifierValue));
            case"XPATH":
                return driver.findElement(By.id(identifierValue));
            default:
                return null;
        }
    }

}
