package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectModel.Login_pageobject;
import pageobjectModel.register_page_object;
import resorcesObject.Baseclass;
import resorcesObject.Commonmethods;
import resorcesObject.Constant;

public class Login_Testcases extends Baseclass {
	
	@Test
	public void Login() throws IOException {
		
		register_page_object reg=new register_page_object(driver); //resister page object for use click on account  
		
		reg.clickonAccounts().click();//click on account 
		
		Login_pageobject log=new Login_pageobject(driver);
		
		log.clickonlogin().click(); //click on login
		
		log.Email().sendKeys(Constant.loginEmail); //sendkeys in email box
		
		log.Passwordloginpage().sendKeys(Constant.loginpagepassword);
		
		log.loginbutton().click();
		
		System.out.println(log.warningmessage().getText());// print warning msg
		
		Commonmethods.softassert(log.warningmessage().getText(),Constant.Expected_warning_msg);
		
		
		
	
	}

}
