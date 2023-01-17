package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_pageobject {

	public WebDriver driver;
	
    private By searchbar=By.xpath("//input[@type='text']"); //saechbar
    private By clickonSearchbutton=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By iphoneprice= By.xpath("//p[@class='price']");
	private By addtocartiphone=By.xpath("//div[@class='button-group']/button[1]");
    
	private By Samsungtabprice=By.xpath("(//p[@class='price'])[2]");
    private By Samsungaddtocart=By.xpath("(//div[@class='button-group'])[2][1]/button[1]");
    private By clickoncart=By.xpath("(//button[@data-toggle='dropdown'])[2]");
    private By cartpriceaddtionan=By.xpath("(//td[@class='text-right'])[12]"); 

    
	//constructor
	public AddToCart_pageobject(WebDriver driver2) {
		this.driver=driver2;
	}
      
	//search bar method 
	public WebElement searchbar() {
		
		return driver.findElement(searchbar);
	}
	
	
     public WebElement clickonSearchbutton() {
		
		return driver.findElement(clickonSearchbutton);
	}
	
     public WebElement iphoneprice() {
 		
 		return driver.findElement(iphoneprice);
 	}
	
     public WebElement addtocartiphone() {
  		
  		return driver.findElement(addtocartiphone);
  	}
     
     
     public WebElement Samsungtabprice() {
   		
   		return driver.findElement(Samsungtabprice);
   	}
     
     public WebElement Samsungaddtocart() {
    		
    		return driver.findElement(Samsungaddtocart);
    	}
     
     public WebElement clickoncart() {
 		
 		return driver.findElement(clickoncart);
 	}
     
     public WebElement cartpriceaddtionan() {
  		
  		return driver.findElement(cartpriceaddtionan);
  	} 
     
     
}
