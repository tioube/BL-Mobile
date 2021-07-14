package pageEvents;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.*;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.sampleElement;
import utils.elementStats;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class sampleRegister {
    AppiumDriver driver;


    public sampleRegister(AppiumDriver driver) {

        this.driver = driver;

    }


    public void register() throws InterruptedException {

        DesiredCapabilities ds = new DesiredCapabilities();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        if(driver.getCapabilities().getCapability("appActivity") == "com.indosatooredoo.Imkasapp.ui.activity.account.onboarding.OnBoardingActivity" ){
        elementStats el = new elementStats();

        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_TEXT).click();
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_NAME).sendKeys(sampleElement.ID_NAME_FORM);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_EMAIL).sendKeys(sampleElement.ID_EMAIL_FORM);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_PASSWORD).sendKeys(sampleElement.ID_PASS);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_CONFIRM_PASS).sendKeys(sampleElement.ID_PASS);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_BUTTON).click();
        String a = el.getWebElement(driver, "ID", "com.loginmodule.learning:id/snackbar_text").getText();
        Assert.assertEquals(a,"Registration Successful","Assert True");

//        try {
//            WebElement mobileElement = el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_TEXT);
//            wait.until(ExpectedConditions.visibilityOf(mobileElement));
//            boolean isElementPresent = mobileElement.isDisplayed();
//            return isElementPresent;
//        } catch (Exception e) {
//            boolean isElementPresent = false;
//            System.out.println(e.getMessage());
//            return isElementPresent;
//        }

    }

    public void invalidRegister() throws InterruptedException {

        DesiredCapabilities ds = new DesiredCapabilities();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        elementStats el = new elementStats();

//        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_TEXT).click();
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_NAME).sendKeys(sampleElement.ID_NAME_FORM);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_EMAIL).sendKeys(sampleElement.ID_EMAIL_FORM);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_PASSWORD).sendKeys(sampleElement.ID_PASS);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_CONFIRM_PASS).sendKeys(sampleElement.ID_PASS);
        driver.navigate().back();
//        Thread.sleep(500);
        el.getWebElement(driver, "ID", sampleElement.ID_REGISTER_BUTTON).click();
        String a = el.getWebElement(driver, "ID", "com.loginmodule.learning:id/snackbar_text").getText();
        Assert.assertEquals(a,"Email Already Exists","Assert True");

    }

}




//        }else{
//            System.out.println("Login 4444::>"+ currentActivity);
//
//        }

