package CustomListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
    System.out.println("Test is passed: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        Reporter.log("<a href=\"C:\\Users\\prasad.bhupal.mendon\\Pictures\\prasad_img.png\" target=\"_blank\">Screenshot Link </a>");
       System.out.println("The following test case has failed : " +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
