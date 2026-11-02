package PracticeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		boolean checkBoxselection=driver.findElement(By.xpath("//input[@id=\"male\"]")).isSelected();
		System.out.println("is selected :"+checkBoxselection);
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		boolean NewCheckBoxselection=driver.findElement(By.xpath("//input[@id=\"male\"]")).isSelected();
		System.out.println("is selected :"+NewCheckBoxselection);
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[contains(@id,\"day\")]"));
		for(int i=3;i<checkbox.size();i++) {
			checkbox.get(i).click();
			boolean New=driver.findElements(By.xpath("//input[contains(@id,\"day\")]")).get(i).isSelected();
			System.out.println(i+":"+New);
		}
	}

}
