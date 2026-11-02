package PracticeTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations1 {

	@AfterTest()
	void test() {
		System.out.println("This is after test method");
	}
	
	@Test()
	void test2() {
		System.out.println("This is test method");
	}
	
	@BeforeTest()
	void test1() {
		System.out.println("This is before test method");
	}
	
	@BeforeSuite()
	void test4() {
		System.out.println("This is before suite method");
	}
	
	@AfterSuite()
	void test3() {
		System.out.println("This is after suite method");
	}
}
