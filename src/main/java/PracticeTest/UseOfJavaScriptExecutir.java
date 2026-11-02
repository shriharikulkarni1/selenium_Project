package PracticeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfJavaScriptExecutir {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//send value to text box using javascripexecutor
		WebElement btn=driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','welcom');", btn);
		
		WebElement btn1=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		js.executeScript("arguments[0].setAttribute('value','Text');", btn1);
		
		WebElement btn2=driver.findElement(By.xpath("//input[@placeholder=\"Enter Phone\"]"));
		js.executeScript("arguments[0].setAttribute('value','976605248');", btn2);
		
		//click action using javascript executor
		
		//js.executeScript("arguments[0].click()", locator);
		
		//scroll donw though pixel
		//js.executeScript("window.scrollBy(0,120)");
		
		//scroll down thorugh webelement
		//js.executeScript("arguments[0].scrollIntoView();", locator);
		
		//upload multiple files
		//String path1='file/path';
		//String path2='file/path';
		
		//driver.findElement(By.xpath("locator")).sendKeys(path1+"\n"+path2);
		
	}

}
