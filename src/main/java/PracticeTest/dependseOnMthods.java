package PracticeTest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class dependseOnMthods {
	
	@Test()
	void login() {
		boolean flag=false;
		Assert.assertEquals(flag, true);
	}
	
	@Test(dependsOnMethods={"login"})
	void homepage() {
		System.out.println("This is homepage method");
	}
}
