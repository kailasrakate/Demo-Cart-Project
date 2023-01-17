package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import resorcesObject.Baseclass;

public class register_page_object extends Baseclass {
	
     public WebDriver driver;
	
   private  By clickonAccounts= By.xpath("//i[@class='fa fa-user']");
   private By clickONResister= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");
   private  By firstName= By.xpath("//input[@id='input-firstname']");		
   private  By LastName= By.xpath("//input[@id='input-lastname']");
   private  By Email= By.xpath("//input[@id='input-email']");
   private  By Telephone= By.xpath("//input[@id='input-telephone']");
   private  By Password= By.xpath("//input[@id='input-password']");
   private  By ConfirmPassword= By.xpath("//input[@id='input-confirm']");
   private By SubscribeYes=By.xpath("(//input[@type='radio'])[2]");
   private By privecypolicy=By.xpath("//input[@type='checkbox']");
   
   
	public register_page_object(WebDriver driver2) {
		
		this.driver= driver2;
	}


	public WebElement clickonAccounts() {
		
		return driver.findElement(clickonAccounts);
	}
		
   public WebElement clickonResister() {
		
		return driver.findElement(clickONResister);
	}	
   
   public WebElement firstName() {
		
		return driver.findElement(firstName);
	}	
   
     
   public WebElement LastName() {
		
		return driver.findElement(LastName);
	}	
     
   public WebElement Email() {
		
		return driver.findElement(Email);
	}	
   
   public WebElement Telephone() {
		
		return driver.findElement(Telephone);
	}	
   
   public WebElement Password() {
		
		return driver.findElement(Password);
	}	
   
   public WebElement ConfirmPassword() {
		
		return driver.findElement(ConfirmPassword);
	}	
   
   public WebElement SubscribeYes() {
		
		return driver.findElement(SubscribeYes);
		
	}	
   
   public WebElement privecypolicy() {
		
		return driver.findElement(privecypolicy);
		
	}	
   
   
   
   
   
   
   
   
   
   
   
	}
	

