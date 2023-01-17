package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_pageobject {
	public WebDriver driver;
	private By clickonlogin= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	private By sendkeysinEmail=By.xpath("//input[@name='email']");
	private By loginpagepassword=By.xpath("//input[@id='input-password']");
	private By loginbutton=By.xpath("//input[@type='submit']");
	private By warningmessage= By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	
	public Login_pageobject(WebDriver driver2) {
		 
		this.driver=driver2;
	}




	public WebElement clickonlogin() {
		
	   return driver.findElement(clickonlogin);
		
	}
	
	public WebElement Email() {
		
		   return driver.findElement(sendkeysinEmail);
			
		}
	
	public WebElement Passwordloginpage() {
		
		return driver.findElement(loginpagepassword);
	}
	
    public WebElement loginbutton() {
		
		return driver.findElement(loginbutton);
	}
	
    public WebElement warningmessage() {
		
		return driver.findElement(warningmessage);
	}
	

}
