package PracticeTest;

import org.testng.annotations.Test;

public class GropingTestCases {

	@Test()
	void login() {
		System.out.println("This is login test");
	}
	
	@Test(groups ="Sanity")
	void test1() {
		System.out.println("This is test1 method");
	}
	
	@Test(groups ="Sanity")
	void test2() {
		System.out.println("This is test2 method");
	}
	
	@Test(groups ="Regression")
	void test3() {
		System.out.println("This is test3 method");
	}
	
	@Test(groups ="Regression")
	void test4() {
		System.out.println("This is test4 method");
	}
	
	@Test(groups ="Regression")
	void test5() {
		System.out.println("This is test5 method");
	}
}
