package resorcesObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public WebDriver driver;
	
	public void browserInitialiazation() throws IOException {
		
   		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resorcesObject\\Browser.properties");
		
		Properties prop=new Properties(); 
		
		prop.load(fis); 
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
			 driver =new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("FirefoxDriver")) {
			
			driver =new FirefoxDriver();
			
		}else System.out.println("please enter valid browser nmae");
		
		
	}
	
	@BeforeMethod
	public void browserlaunch() throws IOException {
		
		browserInitialiazation();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		
		
		
		
	}
	
	
	
	
 	
	
	
	
	

}
