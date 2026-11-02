package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {

	WebDriver driver;
	
	@Test()
	void loginOrangeHrm() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage login=new loginPage(driver);
		login.enterUname("Admin");
		login.enterPass("admin123");
		login.hitPass();
	}
}
