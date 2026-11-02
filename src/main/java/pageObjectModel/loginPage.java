package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	//constructor
	loginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(xpath="//input[@name=\"username\"]") WebElement txt_username;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement txt_password;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement btn_login;
	
	//methods
	public void enterUname(String uname) {
		txt_username.sendKeys(uname);
	}
	
	public void enterPass(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void hitPass() {
		btn_login.click();
	}

}
