package base;

import java.io.IOException;
import org.automation.shweta.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.automation.shweta.utility.Utility;

public class CreateDriver {
    public WebDriver driver;
    
    @BeforeMethod
	public void initiateDriver() throws IOException
	{
    	if(Utility.fetchPropertyvalue("browser").toString().equalsIgnoreCase("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:/Users/shwet/Desktop/Shweta/Chrome_Driver_latest/chromedriver.exe");
    		driver = new ChromeDriver();
    		
    	}
	     
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/shwet/Desktop/Shweta/Chrome_Driver_latest/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		driver.get(Utility.fetchPropertyvalue("applicationurl").toString());
		
	}
	
    @AfterMethod
	public void closeDriver()
	{
		//driver.quit();
	}
}
