package com.test.bukalapak;


import org.testng.annotations.Test;
import pageEvents.sampleRegister;

public class sampleTestRegister extends baseSetup {
    @Test
    public void Register() throws InterruptedException {
        sampleRegister fl = new sampleRegister(getDriver());
        fl.register();
        fl.invalidRegister();
    }
}
