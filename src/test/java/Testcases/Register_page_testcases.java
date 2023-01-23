package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectModel.register_page_object;
import resorcesObject.Baseclass;
import resorcesObject.Constant;

public class Register_page_testcases extends Baseclass {
	
	@Test
	public void resiter_page() throws IOException {
		
     register_page_object reg=new register_page_object(driver);
		
		reg.clickonAccounts().click();//click on accounts 
		
		reg.clickonResister().click();//click on register
		
		reg.firstName().sendKeys(Constant.firstname);
		
		reg.LastName().sendKeys(Constant.lastname);
		
		reg.Email().sendKeys(Constant.Email);
		
		reg.Telephone().sendKeys(Constant.telephone);
		
		reg.Password().sendKeys(Constant.password);
		
		reg.ConfirmPassword().sendKeys(Constant.password);
		
		reg.SubscribeYes().click(); //subscribe option select yes
		
		reg.privecypolicy().click();// privacy policy check-box select
		
		
		
		
	}
}
