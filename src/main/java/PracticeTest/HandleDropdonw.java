package PracticeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdonw {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropwn=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select sel=new Select(dropwn);
		sel.selectByVisibleText("United States");
		sel.selectByValue("canada");
		sel.selectByIndex(1);
		
		
		//capture all option
		List<WebElement>allOptions=sel.getOptions();
		System.out.println("all option :"+allOptions.size());	
		
		//print all options
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()); 
		}
		
		//Through inhanced for loop
		for(WebElement op:allOptions) {
			System.out.println("enhanced for loop data :"+op.getText());
		}
		System.out.println("Test executed");
		driver.close();
	}

}
