package PracticeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Thread.sleep(3000);
	WebElement title=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OrangeHRM, Inc']")));
	//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	title.click();
	//Thread.sleep(3000);
	Set<String>ids=driver.getWindowHandles();
	Iterator<String>it=ids.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	//Thread.sleep(5000);
	WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"CybotCookiebotDialogHeaderLogosWrapper\"]/following-sibling::button")));
	//driver.findElement(By.xpath("//div[@id=\"CybotCookiebotDialogHeaderLogosWrapper\"]/following-sibling::button")).click();
	link.click();
	System.out.println("Text executed");
	driver.quit();
	}
}
