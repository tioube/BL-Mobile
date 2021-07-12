package com.test.bukalapak;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class baseSetup {

    public ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public void setDriver(AppiumDriver driver) {
        this.driver.set(driver);
    }

    public AppiumDriver getDriver(){
        return this.driver.get();
    }

    @BeforeMethod
    @Parameters({"deviceName","platformVersion","systemPort","udid"})
    public void initDriver(String deviceName, String platformVersion,String systemPort, String udid) throws MalformedURLException {
        System.out.println(systemPort);
        startAppiumService(systemPort);
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability("deviceName",deviceName);
        ds.setCapability("platformVersion",platformVersion);
        ds.setCapability("udid",udid);
        ds.setCapability("systemPort",systemPort);
        ds.setCapability("platformName","Android");
        ds.setCapability("app","/Users/tio/gitlab/bukalapak-assignment/BL-Apps/src/Sample Android App Login Test_v4.0_apkpure.com.apk");
        ds.setCapability("appPackage","com.loginmodule.learning");
        ds.setCapability("appActivity","com.loginmodule.learning.activities.LoginActivity");
        ds.setCapability("noReset","true");

        // http://127.0.0.1:4723/wd/hub
        setDriver(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),ds));

    }

    @AfterMethod
    public void closeDriver(){
        getDriver().quit();
    }

    public void startAppiumService(String systemPort){
        AppiumDriverLocalService service;
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(Integer.parseInt(systemPort));
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Service has been started with port number" + systemPort);
    }
}
