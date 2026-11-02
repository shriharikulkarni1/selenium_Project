package PracticeTest;

import org.testng.annotations.Test;

public class TestNg_Part1 {
	
	@Test(priority=-1)
	void openapp() {
		System.out.println("This is open app method");
	}
	
	@Test(priority=0)
	void login() {
		System.out.println("This is  login method");
	}
	
	@Test(priority=1)
	void logout() {
		System.out.println("This is logout method");
	}

}
