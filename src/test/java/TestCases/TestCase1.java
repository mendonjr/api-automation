package TestCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeTest
    public void setReport(){
        //path where we want the reports
        htmlReporter = new ExtentSparkReporter("./reports/extent.html");

        //set encoding
        htmlReporter.config().setEncoding("utf-8");

        //Give title to the Reports
        htmlReporter.config().setDocumentTitle("Prasad's Automation Reports");

        //Give name to the Reports
        htmlReporter.config().setReportName("Test Result's");

        //set the theme of the report
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter); //attach the report

        extent.setSystemInfo("Tester", "Prasad Mendon");
        extent.setSystemInfo("Organization", "Thoughtworks");
        extent.setSystemInfo("Build No", "PI 3.4");

    }
    @Test
    public void loginTest(){
        test = extent.createTest("Login Test");
        System.out.println("Executing user login test");
    }
    @Test
    public void registrationTest(){
        test = extent.createTest("Registration Test");
       Assert.fail("User registration test has failed");
    }

    @Test
    public void isSkip(){
        test = extent.createTest("Skip Test");
        throw new SkipException("This test has been skipped");
    }
    @AfterMethod
    public void tearDownMethod(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            String methodName = result.getMethod().getMethodName();
            String logText = "<b>" + "TEST CASE: - "+methodName.toUpperCase() + " Failed" + "</b>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED); //customize the report
            test.fail(m);
        } else if (result.getStatus()==ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String logText = "<b>" + "TEST CASE: - "+methodName.toUpperCase() + " Skipped" + "</b>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.AMBER); //customize the report
            test.skip(m);
        } else if (result.getStatus()==ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText = "<b>" + "TEST CASE: - "+methodName.toUpperCase() + " PASSED" + "</b>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN); //customize the report
            test.pass(m);
        }
    }

    @AfterTest
    public void endReport(){
        extent.flush(); //erase any previous data and create a new report
    }


}
