package PracticeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement button=driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act=new Actions(driver);
		act.moveToElement(button).perform();
		WebElement newButton=driver.findElement(By.xpath("//a[text()='PC (0)']"));
		act.moveToElement(newButton).click().perform();
		System.out.println("Test executed");
	}

}
