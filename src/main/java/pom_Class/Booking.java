package pom_Class;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class Booking {
	
	
	@FindBy (xpath="//span[text()='I do not wish to secure my trip']") private WebElement  radiobutton;
	@FindBy (xpath="//input[@placeholder='Mobile No']") private WebElement  mobilefeild;
	@FindBy (xpath="//input[@placeholder='Email']") private WebElement  email;
	@FindBy (xpath="//button[text()='Continue']") private WebElement  continuebutton;

	
	public Booking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Ragister(WebDriver driver, JavascriptExecutor js) throws InterruptedException, IOException 
	{
		Set<String> Tabs = driver.getWindowHandles();
		ArrayList<String> Al= new ArrayList<String>(Tabs);
		driver.switchTo().window(Al.get(1));
		
		Thread.sleep(2000);
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoVeiw",radiobutton );
		radiobutton.click();
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoVeiw",mobilefeild);
		
		
		mobilefeild.sendKeys(Utility.ReadPropertyFile("MOBILE"));
		Thread.sleep(200);
		email.sendKeys(Utility.ReadPropertyFile("EMAIL"));
		Thread.sleep(200);
//		continuebutton.click();
	}




	
	
	

}
