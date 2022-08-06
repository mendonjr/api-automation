package CustomListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

    @Test
    public void launchBrowser(){
        Assert.fail("Test has failed");
    }

    public void closeBrowser(){
        Assert.fail("Test has failed");
    }
}
