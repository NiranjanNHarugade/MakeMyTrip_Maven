package base;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Utility;

public class Browser_Setup {

	
	public static WebDriver driver;
	public static Actions as;
	public static JavascriptExecutor js;
	public  static WebDriverWait wait;

	public static void open_browser (String Name) throws IOException
	{
	
		if(Name.equalsIgnoreCase("Chrome"))
		{
		driver =new ChromeDriver();
		}
		else if(Name.equalsIgnoreCase("Firefox"))
		{
		driver =new FirefoxDriver();
		}
		else if(Name.equalsIgnoreCase("Edge"))
		{
		driver =new EdgeDriver();	
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get(Utility.ReadPropertyFile("URL"));
		
		
		as= new Actions(driver);
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait( driver, Duration.ofSeconds(10));

		
	}
	
	
	
	
	
	
}