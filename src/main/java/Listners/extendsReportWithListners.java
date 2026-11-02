package Listners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendsReportWithListners implements ITestListener {

	public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    // Initialize Extent Report
    @Override
    public void onStart(ITestContext context) {

        String reportPath = System.getProperty("user.dir")+ "/reports/myReport.html";

        sparkReporter = new ExtentSparkReporter(reportPath);

        // Report configuration
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // System information
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Pavan");
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    // Create test entry before execution
    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.INFO,"Test case execution started: " + result.getName());          
    }

    // Test passed
    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS,"Test case PASSED: " + result.getName());
               
    }

    // Test failed
    @Override
    public void onTestFailure(ITestResult result) {

        test.log(Status.FAIL,"Test case FAILED: " + result.getName());
              

        test.log(Status.FAIL,result.getThrowable());
    }

    // Test skipped
    @Override
    public void onTestSkipped(ITestResult result) {

        test.log(Status.SKIP,
                "Test case SKIPPED: " + result.getName());

        test.log(Status.SKIP,
                result.getThrowable());
    }

    // Finish execution and generate report
    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println("Extent Report generated successfully!");
    }
}
