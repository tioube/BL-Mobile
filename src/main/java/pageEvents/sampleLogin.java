package pageEvents;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.sampleElement;
import utils.elementStats;

import java.util.concurrent.TimeUnit;

public class sampleLogin {
    AppiumDriver driver;


    public sampleLogin(AppiumDriver driver) {

        this.driver = driver;

    }

    public void login() throws InterruptedException {

        DesiredCapabilities ds = new DesiredCapabilities();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        if(driver.getCapabilities().getCapability("appActivity") == "com.indosatooredoo.Imkasapp.ui.activity.account.onboarding.OnBoardingActivity" ){
        elementStats el = new elementStats();
        el.getWebElement(driver, "ID", sampleElement.ID_EMAIL_LOGIN).sendKeys(sampleElement.ID_EMAIL_FORM);
        el.getWebElement(driver, "ID", sampleElement.ID_PASSWORD_LOGIN).sendKeys(sampleElement.ID_PASS);
        driver.navigate().back();
        el.getWebElement(driver, "ID", sampleElement.ID_LOGIN_BTN).click();
        String a =el.getWebElement(driver, "ID", "com.loginmodule.learning:id/textViewName").getText();
//        System.out.println(a);
        Assert.assertEquals(a,sampleElement.ID_EMAIL_FORM,"Data is Equals");



    }
}
