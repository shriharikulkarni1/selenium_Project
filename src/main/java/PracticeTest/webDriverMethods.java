package PracticeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".caret")).click();
		Thread.sleep(3000);
		boolean isDesplayed = driver
				.findElement(By.xpath("//ul[starts-with(@class,\"dropdown-menu\")]//a[text()='Showcase']"))
				.isDisplayed();
		driver.findElement(By.xpath("//ul[starts-with(@class,\"dropdown-menu\")]//a[text()='Showcase']")).click();
		String title = driver.findElement(By.xpath("//*[text()='OpenCart Success Stories']")).getText();
		System.out.println(title);
		// conditional Methods
		System.out.println(isDesplayed);
		driver.close();
	}
}
