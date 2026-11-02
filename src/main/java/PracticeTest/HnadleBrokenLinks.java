package PracticeTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//get the links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//get the href atribute 
		for(WebElement allLinks:links) {
			String hrefLinks=allLinks.getAttribute("href");
			
			if(hrefLinks==null || hrefLinks.isEmpty()) {
				System.out.println("Not posible");
				continue;
			}
			
			try {
				//convert string formate it in URl formate
				URL url=new URL(hrefLinks); //convert string into the URL
				HttpURLConnection connection=(HttpURLConnection) url.openConnection(); //Open the connection to server
				connection.connect();//connects the server
				
				//get the response code
				if(connection.getResponseCode()>=400) {
					System.out.println("It is broken link");
				}else {
					System.out.println("It is Not broken link");
				}	
			}catch(Exception e) {
				
			}
	}
	}
	}
