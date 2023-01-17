package Testcases;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import pageobjectModel.AddToCart_pageobject;
import resorcesObject.Baseclass;
import resorcesObject.Constant;

public class AddToCartTestCases extends Baseclass {
	@Test
	public void AddToCart() throws IOException, InterruptedException {
		
		AddToCart_pageobject add=new AddToCart_pageobject(driver);
		
		add.searchbar().sendKeys(Constant.iphone);  //send key in search-bar iphone
		
		add.clickonSearchbutton().click();  //click on search button
		
		
		System.out.println(add.iphoneprice().getText());
		
		add.iphoneprice().getText();
		
		String a=add.iphoneprice().getText();    // $123.20 Ex Tax: $101.00
		                                                    
		
		String []b=a.split("\\s+"); //cut the string as basis of space  
		
		                                    //      b[0]     b[1]  b[2]   b[3]
		System.out.println(Arrays.toString(b)); //[$123.20 , Ex , Tax: , $101.00]
		
		String c=b[0];  //$123.20
		
		System.out.println(c.replace("$", "")); //$ replace with space
		
		String d=c.replace("$", "");
		
		double e= Double.parseDouble(d);  //String convert into double by using this method 
		
		add.addtocartiphone().click(); //click on add to cart iphone
		 
		add.searchbar().clear();  //search bar clear kela
		
		add.searchbar().sendKeys(Constant.samsung); //type samsung in search bar
		 
		add.clickonSearchbutton().click(); //search button var click
		
		System.out.println(Constant.samsung_price);
		System.out.println(add.Samsungtabprice().getText());
		
		String s1=add.Samsungtabprice().getText();
		
		String s2[]=s1.split("\\s+");
	
		String s3=s2[0];
		 
		System.out.println(s3);  
		
		String s4= s3.replace("$", "");
		
		Double s5=Double.parseDouble(s4);
		
		System.out.println(s5);
		
		add.Samsungaddtocart().click();
		
		Thread.sleep(3000);
		add.clickoncart().click();
		
		
		double s6=e+s5;
		System.out.println(Constant.cart_price);
		System.out.println(s6);
		
		String s7="$"+s6;
		
		System.out.println(s7);  //$365.19
		
		String s8=add.cartpriceaddtionan().getText();
		
		System.out.println(s8);
		
		if (s8.equals(s7)) {
			
			System.out.println(Constant.test_pass);
		}else {
			
			System.out.println(Constant.test_Fail);
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}