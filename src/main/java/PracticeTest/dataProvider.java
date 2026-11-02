package PracticeTest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataProvider {
	
	WebDriver driver;
	@Test(dataProvider="DP")
	void setup(String uname,String pass) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		String text=driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]")).getText();
		if(text=="Dashboard") {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider(name="DP")
	Object [][] loginData() {
		Object dataset[][]= {
				{"Admin","admin123"},
				{"Admin1","admin1234"},
				{"Admin2","admin1235"},
				{"Admin3","admin1236"},
		};
			return dataset;
	}
	
	void tearDown() {
		driver.close();
	}
}
