package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer_pageobject {
	
  public WebDriver driver;
	
  private By ClickONaboutUS=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
  private By ClickONDeliveryInFormation=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=6']");
  private By clickonPrivacyPolicy=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=3']");		 
  private By clickonTermsandConditions=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=5']");	 
  private By clickonContactUs=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/contact'])[2]");		 
  private By ClickonReturns=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']"); 
  private By firstname=By.xpath("//input[@id='input-firstname']");
  private By Lastname=By.xpath("//input[@id='input-lastname']");
  private By Email=By.xpath("//input[@id='input-email']");
  private By telephone=By.xpath("//input[@id='input-telephone']");
  private By oredrid=By.xpath("//input[@id='input-order-id']");
  private By calender=By.xpath("//i[@class='fa fa-calendar']");
  private By yesChekbox=By.xpath("(//input[@type='radio'])[6]");
  private By Faultyorotherdetails=By.xpath("//textarea[@name='comment']");
  private By Submit_btn=By.xpath("//input[@value='Submit']");
  private By ClicksiteMap=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/sitemap']");
  private By Clickon_Brands=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/manufacturer']");
  private By Click_on_Gift_Sertificate=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']");
  private By Click_on_Afiliate=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=affiliate/login']");
  private By Click_on_Specials =By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/special']");
  private By Click_on_Accounts=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'])[2]");
  private By Click_on_Order_histry=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/order'])[2]");
  private By Clik_on_footer_wishlist=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/wishlist'])[2]");
  private By Click_on_Newsetter=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/newsletter'])[2]");
  
  
    public Footer_pageobject(WebDriver driver2) {
	
		driver=driver2;   //constructor
      }

	public WebElement ClickonAboutUS() {
	  
	  return driver.findElement(ClickONaboutUS);
  }
		 
	public WebElement ClickONDeliveryInFormation() {
		
		return driver.findElement(ClickONDeliveryInFormation);
   }	 
	
	public WebElement clickonPrivacyPolicy() {
		  
		 return driver.findElement(clickonPrivacyPolicy);
	}
	
	public WebElement clickonTermsandConditions() {
		  
		 return driver.findElement(clickonTermsandConditions); 
	}
	
	public WebElement clickonContactUs() {
		  
		 return driver.findElement(clickonContactUs);
	}
	
	public WebElement ClickonReturns() {
		  
		 return driver.findElement(ClickonReturns);
	}	
	
	public WebElement firstname() {
		  
		 return driver.findElement(firstname);
	}
	
	
	public WebElement Lastname() {
		  
		 return driver.findElement(Lastname);
	}
	
	public WebElement Email() {
		  
		 return driver.findElement(Email);
	}
	
	public WebElement telephone() {
		  
		 return driver.findElement(telephone);
	}
	
	public WebElement oredrid() {
		  
		 return driver.findElement(oredrid);
	}
	
	public WebElement calender() {
		  
		 return driver.findElement(calender);
	}
	
			
	public WebElement yesChekbox() {
		  
		 return driver.findElement(yesChekbox);
	}
	
   public WebElement Faultyorotherdetails() {
		
		return driver.findElement(Faultyorotherdetails);
   }	
	
   
   public WebElement Clickon_Submit_btn() {
		
		return driver.findElement(Submit_btn);
  }
	
	public WebElement ClicksiteMap() {
		  
		 return driver.findElement(ClicksiteMap);
	}
	
	public WebElement Clickon_Brands () {
		  
		 return driver.findElement(Clickon_Brands);
	}
	
	public WebElement Click_on_Gift_Sertificate() {
		  
		 return driver.findElement(Click_on_Gift_Sertificate);
	}
	
	
	public WebElement Click_on_Afiliate() {
		  
		 return driver.findElement(Click_on_Afiliate);
	}
	
	public WebElement Click_on_Specials() {
		  
		 return driver.findElement(Click_on_Specials);
	}
	
	public WebElement Click_on_Accounts() {
		  
		 return driver.findElement(Click_on_Accounts);
	}
	
	public WebElement Click_on_Order_histry() {
		  
		 return driver.findElement(Click_on_Order_histry);
	}
	
	public WebElement Clik_on_footer_wishlist() {
		  
		 return driver.findElement(Clik_on_footer_wishlist);
	}
	
	public WebElement Click_on_Newsetter() {
		  
		 return driver.findElement(Click_on_Newsetter);
	}
	
	
	
}