package flightTab;

import java.awt.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.automation.shweta.utilty.Utility;
import org.automation.shweta.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight_tab {
    WebDriver driver;
	
	public Flight_tab(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickFlightTab() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("flight_tab_xpath"))).click();
	}
	
	public void ClickOneWay() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("flight_type_oneWay_xpath"))).click();
	}
	public void enterDepartingPoint(String dplace) throws IOException, InterruptedException
	{	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement textbox=driver.findElement(By.xpath(Utility.fetchLocatorValue("flight_origin_xpath")));
		textbox.clear();
		textbox.sendKeys(dplace);
		Thread.sleep(4000);
		java.util.List<WebElement> allOptions = driver.findElements(By.xpath(Utility.fetchLocatorValue("flight_origin_xpath")));
		int count=allOptions.size();
		System.out.println("No of autosuggestions"+count);
		for(int i=0;i<count;i++)
		{
		String text=allOptions.get(i).getText();
		System.out.println(text);
		}
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
	}
	
	public void enterArrivalPoint(String aplace) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement textbox=driver.findElement(By.xpath(Utility.fetchLocatorValue("flight_destination_xpath")));
		textbox.clear();
		textbox.sendKeys(aplace);
		Thread.sleep(4000);
		java.util.List<WebElement> allOptions = driver.findElements(By.xpath(Utility.fetchLocatorValue("flight_origin_xpath")));
		int count=allOptions.size();
		System.out.println("No of autosuggestions"+count);
		for(int i=0;i<count;i++)
		{
		String text=allOptions.get(i).getText();
		System.out.println(text);
		}
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
	}
	public void selectDepartureDate_OneWay(String ddate) throws IOException
	{
		WebElement date= driver.findElement(By.xpath(Utility.fetchLocatorValue("flight_departing_oneWay_xpath")));
		String dateVal = ddate;
		selectDepartdateJS(driver , date , dateVal);
	}
	
			public static void selectDepartdateJS(WebDriver driver, WebElement element , String dateVal)
			{
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
			}
	
	public void selectTravelerCount()
	{
		
	}
	
	public void clickSubmit() throws IOException
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("search_button_xpath"))).click();
	}
	/*	
	public void enterOrigin(String uname) throws Exception
	{
	   driver.findElement(By.id(Utility.fetchLocatorValue("flight_origin_xpath"))).sendKeys(uname);	
	}
	
	public void enterDestination (String depDate) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("flight_destination_xpath"))).sendKeys(depDate);
	}
	
	public void enterDepartDate (String pass) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	public void enterReturnDate(String pass) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	
	public void entertravelers (String pass) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	
	public void enterPrefferedClass (String pass) throws Exception
	{
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	public void clickSignin() throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
		
	}
	 * @throws IOException */

	

	
}
