package SmokeTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HappyPathTest {

    @BeforeTest
    public void launchBrowser(){
        System.out.println("Browser Launched");
    }

    @Test
    public void doLogin(){
        System.out.println("Executing login");
    }

    @Test
    public void doUserRegistration(){
        System.out.println("Executing userRegistration");
    }

    @AfterTest
    public void closeBrowser(){
        System.out.println("Browser Closed");
    }
}
