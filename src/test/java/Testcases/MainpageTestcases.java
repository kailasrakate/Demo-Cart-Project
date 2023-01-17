package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectModel.Main_Pageobject;
import resorcesObject.Baseclass;
import resorcesObject.Commonmethods;
import resorcesObject.Constant;

public class MainpageTestcases extends Baseclass {
	
	@Test
	public void mainpage() throws IOException, InterruptedException {
		
		Main_Pageobject mp=new Main_Pageobject(driver);
		
		mp.clickonCurrencydropdown().click();
		
		mp.Selectcurrency().click();
		
		mp.clickoncontactus().click();
		
		mp.yourNameIncontactUs().sendKeys(Constant.firstname);
		
		mp.clickonheartSymbolWishlist1().click();
		
		mp.shoppingCartSymbol().click();
		
		mp.clickonCheckoutSymbol().click();
		
		Commonmethods.actionMethod(mp.desktop(), driver);
		
		mp.Clickonpc().click();
		
		mp.ClickonContinue().click();

		Commonmethods.actionMethod(mp.desktop(), driver);
		
		mp.ClickonMac().click();
		
		Commonmethods.selectdropdown(mp.sortbyDropdown(), Constant.ratinghighest);
		
		Commonmethods.selectdropdown(mp.showdropdown(), Constant.fifty);
		
		mp.ClickOnHomebutton().click();
		
		Commonmethods.actionMethod(mp.LaptopAndnotebook(), driver);
		
		mp.Macs().click();
		driver.navigate().back();
		
		Commonmethods.actionMethod(mp.LaptopAndnotebook(), driver);
		
		mp.Windows().click();
		
		Commonmethods.actionMethod(mp.componantsmousehover(), driver);
		
		mp.clickonmonitors().click();
		
		System.out.println(mp.monitorsgettext().getText());
		
		
		Commonmethods.softassert(Constant.monitorActual, mp.monitorsgettext().getText());
		
		mp.Clickontest0().click();
		
		mp.clickoncountinue2().click();
		
		mp.clickonclickonCamera().click();
		
		mp.ClickonMP3Plyers().click();
		
		
		
	}
}
