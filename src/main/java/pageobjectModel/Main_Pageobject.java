package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_Pageobject {
	
   public WebDriver driver;
   private By currency =By.xpath("//button[@class='btn btn-link dropdown-toggle']");
   private By Selectcurrency=By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[3]");
   private By contactus=By.xpath("//i[@class='fa fa-phone']");
   private By yourNameIncontactUs=By.xpath("//input[@name='name']");
   private By heartSymbolWishlist1=By.xpath("//i[@class='fa fa-heart']");
   private By shoppingCartSymbol=By.xpath("//i[@class='fa fa-shopping-cart']");
   private By CheckoutSymbolClick=By.xpath("//i[@class='fa fa-share']");
   
   private By desktop =By.xpath("(//a[@class='dropdown-toggle'])[2]");
   private By pc =By.xpath("//a[contains(text(),'PC')]");
   private By continue1=By.xpath("//a[@class='btn btn-primary']"); 
   private By Mac =By.xpath("//a[contains(text(),'Mac')]");
   private By sortbydropdown=By.xpath("//select[@id='input-sort']");
   private By showdropdown=By.xpath("//select[@id='input-limit']");
   private By clickonMac=By.xpath("//a[contains(text(),'iMac')]");
   private By ClickOnHomebutton=By.xpath("//i[@class='fa fa-home']");
   private By LaptopAndnotebook=By.xpath("(//a[@class='dropdown-toggle'])[3]");
   private By Macs =By.xpath("//a[contains(text(),'Macs (0)')]");  
   private By Windows =By.xpath("//a[contains(text(),'Windows (0)')]");
   private By componants =By.xpath("//a[contains(text(),'Components')]");
   private By clickonmonitors =By.xpath("//a[contains(text(),'Monitors (2)')]");
   private By monitorsgettext =By.xpath("//h2[contains(text(),'Monitors')]"); 
   private By clickontest0 =By.xpath("//a[contains(text(),'test 1 (0)')]");
   private By clickoncountinue2 =By.xpath("//a[contains(text(),'Continue')]");
   private By clickonCamera=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33']");
   private By ClickonMP3Plyers=By.xpath("(//a[@class='dropdown-toggle'])[5]");
   
   
   public Main_Pageobject(WebDriver driver2) {
	
	this.driver = driver2;
	
   }
   
   
    public WebElement clickonCurrencydropdown() {
	   
	   return driver.findElement(currency);
   }

   public WebElement Selectcurrency() {
	   
	   return driver.findElement(Selectcurrency);
   } 
   
   public WebElement clickoncontactus() {
	   
	   return driver.findElement(contactus);
   }
   
   public WebElement yourNameIncontactUs() {
	   
	   return driver.findElement(yourNameIncontactUs);
   }
   
   public WebElement shoppingCartSymbol() {
	   
	   return driver.findElement(shoppingCartSymbol);
   }
   
   public WebElement clickonheartSymbolWishlist1() {
	   
	   return driver.findElement(heartSymbolWishlist1);
   }
   
   public WebElement clickonCheckoutSymbol() {
	   
	   return driver.findElement(CheckoutSymbolClick);
   }
   
   
   public WebElement clickonclickonCamera() {
	   
	   return driver.findElement(clickonCamera);
   }
   
   public WebElement  ClickonMP3Plyers() {
	   
	   return driver.findElement( ClickonMP3Plyers);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public WebElement desktop() {
	   
	   return driver.findElement(desktop);
   }
   
   public WebElement Clickonpc() {
	   
	   return driver.findElement(pc);
   }
	
   public WebElement ClickonContinue() {
	   
	   return driver.findElement(continue1);
   }
	
   public WebElement ClickonMac() {
	   
	   return driver.findElement(Mac);
   }
	
   public WebElement sortbyDropdown() {
	   
	   return driver.findElement(sortbydropdown);
   }
   
   public WebElement showdropdown() {
	   
	   return driver.findElement(showdropdown);
   }
   
   public WebElement clickONmac() {
	   
	   return driver.findElement(clickonMac);
   }
   
   public WebElement ClickOnHomebutton() {
	   
	   return driver.findElement(ClickOnHomebutton);
   }
   
   public WebElement LaptopAndnotebook() {
	   
		  return driver.findElement(LaptopAndnotebook);
	   }
   
   
   public WebElement Macs() {
	   
	   return driver.findElement(Macs);
   }
   
     public WebElement Windows() {
	   
	   return driver.findElement(Windows);
   
     }
   
     public WebElement componantsmousehover() {
  	   
  	   return driver.findElement(componants);
     
       }
   
     public WebElement clickonmonitors() {
    	   
    	   return driver.findElement(clickonmonitors);
       
         }
   
    
     public WebElement monitorsgettext() {
  	   
  	   return driver.findElement(monitorsgettext);
     
       }
     
     public WebElement Clickontest0() {
  	   
  	   return driver.findElement(clickontest0);
     }
     
     
     public WebElement clickoncountinue2() {
  	   
  	   return driver.findElement(clickoncountinue2);
     }
     
    
     
     
     
     
     
     
     
     
     

}
