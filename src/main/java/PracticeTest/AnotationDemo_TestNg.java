package PracticeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationDemo_TestNg {
	
	@BeforeMethod()
	void login() {
		System.out.println("This BeforeMethod method");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("This is search method");
	}
	
	@Test(priority=1)
	void advsearch() {
		System.out.println("This is adv search method");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is AfterMethod method");
	}
	
	
}
