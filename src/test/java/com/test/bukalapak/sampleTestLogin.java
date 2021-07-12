package com.test.bukalapak;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageEvents.sampleLogin;
import pageObject.sampleElement;

public class sampleTestLogin extends baseSetup {
    @Test
    public void Login() throws InterruptedException {
        sampleLogin al = new sampleLogin(getDriver());
        al.login();


    }
}
