package resorcesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
 
public class Commonmethods  {
	
	
	public static void actionMethod(WebElement Element , WebDriver driver ) {
		
		
      Actions ac = new Actions(driver);
		
      ac.moveToElement(Element).perform();
		
	}

	public static void selectdropdown(WebElement WebElement, String visibletext ) {
		
        Select sel=new Select(WebElement);
		
		sel.selectByVisibleText(visibletext);
	}
	
	public static void softassert(String ActualString , String ExpectedString) {
		
	 SoftAssert assertion=new SoftAssert();
		
		String actual=ActualString;
		String expected=ExpectedString;	
				
		assertion.assertEquals(actual, expected);
		
		assertion.assertAll();
		
	}
	

	
	
	
}
