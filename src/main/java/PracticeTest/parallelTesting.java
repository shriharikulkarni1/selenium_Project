package PracticeTest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTesting {

	WebDriver driver;
	@BeforeTest()
	@Parameters("browser")
	void setup(String br) {
		if(br.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(br.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("invalid broswer");
			return;
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
	}
	
	@Test(priority=1)
	void test1() {
		String text=driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]")).getText();
		Assert.assertEquals(text, "Dashboard");
	}
	
	@Test(priority=2)
	void test2() {
		String text=driver.getTitle();
		Assert.assertEquals(text, "OrangeHRM");
	}
	
	@AfterTest()
	void test3() {
		driver.quit();
	}
	
}
