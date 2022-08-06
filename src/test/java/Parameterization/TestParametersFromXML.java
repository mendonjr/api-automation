package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Date;

public class TestParametersFromXML {

    @Parameters({"browser","env"})
    @Test
    public void getBrowser(String browser, String env) throws InterruptedException {
        Date d = new Date();
        System.out.println(browser + " browser test executed in environment: " + env+ "---" + d);
        Thread.sleep(2000);
    }
}
