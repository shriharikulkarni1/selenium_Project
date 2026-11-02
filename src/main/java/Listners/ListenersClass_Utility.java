package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass_Utility implements ITestListener {

	public void onTestStart(ITestResult result) {
	    System.out.println("test execution started");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test successeded...");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed....");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped...");
	  }
	
	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	 }
} 