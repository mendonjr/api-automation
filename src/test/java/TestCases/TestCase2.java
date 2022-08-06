package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase2 {
    @Test
    public void loginTest(){

        System.out.println("Executing user login test");
    }
    @Test
    public void registrationTest(){

        Assert.fail("User registration test has failed");
    }

    @Test
    public void isSkip(){

        throw new SkipException("This test has been skipped");
    }
}
