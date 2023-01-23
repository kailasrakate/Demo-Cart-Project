package Testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobjectModel.Footer_pageobject;
import resorcesObject.Baseclass;
import resorcesObject.Constant;


public class Footer_testcasses extends Baseclass{
	
	 
	@Test
	public void Footer() throws IOException, InterruptedException {
	
	Footer_pageobject foot=new Footer_pageobject(driver);
	
//Information
	foot.ClickonAboutUS().click();	
	
	foot.ClickONDeliveryInFormation().click();
	
	foot.clickonPrivacyPolicy().click();
	
	foot.clickonTermsandConditions().click();
	
//Customer Service
	foot.clickonContactUs().click();
	
	foot.ClickonReturns().click();
	
	foot.firstname().sendKeys(Constant.firstname);
	
	foot.Lastname().sendKeys(Constant.lastname);
	
	foot.Email().sendKeys(Constant.Email);
	
	foot.telephone().sendKeys(Constant.telephone);
	
	foot.oredrid().sendKeys(Constant.orderid);
	
	foot.calender1().click();
	
	    String month="";
			
		while (!(month.equals(Constant.select_date_and_year)))	{
		
			foot.calender_monthchange_btn().click();
			
		    foot.month_year_text();
		 
			month=foot.month_year_text().getText();
		}
		
		foot.date_WebElments();
		
		try {
		for (WebElement k:foot.date_WebElments()) {
		 
	      while (k.getText().equals(Constant.select_date)){
	      
	    	  k.click();
	           break;
	            }
	       }
		}catch(StaleElementReferenceException e) {
			
			System.out.println("stale element exception");
	          }
  
	//List<WebElement> radiobtns=driver.findElements(By.xpath("//input[@type='radio']"));
	foot.radio_buttons();
	for (int i=0; i<foot.radio_buttons().size(); i++) {
		
		foot.radio_buttons().get(2).click();
	  }
	 
	 foot.yesChekbox().click();
	 
	 foot.Faultyorotherdetails().sendKeys(Constant.resonforreturn);
	 
	 foot.Clickon_Submit_btn().click();
	 
	foot.ClicksiteMap().click();
	
//Extras
	foot.Clickon_Brands().click();
	
	foot.Click_on_Gift_Sertificate().click();
	
	foot.Click_on_Afiliate().click();
	
	foot.Click_on_Specials().click();
	
//My accounts	
	foot.Click_on_Accounts().click();
	
	foot.Click_on_Order_histry().click();
	
	foot.Clik_on_footer_wishlist().click();
	
	foot.Click_on_Newsetter().click();
	
	}}
