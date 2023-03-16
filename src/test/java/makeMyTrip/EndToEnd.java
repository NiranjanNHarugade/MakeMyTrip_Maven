 package makeMyTrip;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser_Setup;
import pom_Class.Booking;
import pom_Class.Flights;
import pom_Class.Results;
import utility.Utility;

public class EndToEnd extends Browser_Setup {
	
	Flights FL;
	Results RL;
	Booking BK;
	
	SoftAssert SA;
	
	@BeforeTest
	public void launch_Browser() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		open_browser("chrome");	
	}
	
	
	@BeforeClass
	public void Set_Journey() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FL=new Flights(driver);
		RL=new Results(driver);
		BK=new Booking(driver);
		FL.journeyDetails();
		
		
	}
	
	@Test
	public void validateResults() throws EncryptedDocumentException, IOException, InterruptedException {
		
		RL.AllResults(driver,wait);
		SA = new SoftAssert();
		Thread.sleep(100);
		SA.assertEquals(RL.Selectflight(), Utility.ReadXcell(1, 5),"This Flight is not available");
		SA.assertAll();
		RL.Bookflight();
		BK.Ragister(driver, js);
		
		
	}
	
	@Test
	public void validateResults2() {}
//
//	@AfterClass
//	public void closetab()
//	{
//		driver.close();
//	}
//		
//	
//	@AfterTest
//	public void closeBrowse ()
//	{
////		driver.quit();	
	}

