package PracticeTest;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Type casting WebDriver to TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//captures the screenshot and save it in variable
		File sourec=ts.getScreenshotAs(OutputType.FILE);
		
		//created space for to store screenshots in folder
		File target=new File(System.getProperty("user.dir")+"\\Screenshots\\test1.png");
		
		//this will save the screenshot in created folder
		sourec.renameTo(target);

	}

}
