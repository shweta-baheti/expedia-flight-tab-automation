package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.CreateDriver;
import flightTab.Flight_tab;

public class TC_001 extends CreateDriver {
	
	@Test
	public void tcase1() throws IOException, InterruptedException
	{
		Flight_tab flt = new Flight_tab(driver);
		flt.clickFlightTab();
		Thread.sleep(3000);
		flt.ClickOneWay();
	    flt.enterDepartingPoint("BNA");
	    flt.enterArrivalPoint("LAS");
	    flt.selectDepartureDate_OneWay("12-30-2019");
	    flt.clickSubmit();
	    
		//flt.enterArrivalPoint("CHI");
	
		
		
		
	}

	
}
