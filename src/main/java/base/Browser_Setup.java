package base;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

	public void open_browser (String Name) throws IOException
	{
	
		if(Name.equalsIgnoreCase("Chrome"))
		{ 
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(opt);
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
		driver.get("https://www.makemytrip.com/flights/?gclid=EAIaIQobChMItIKwz6Wr_gIV2G99Ch2m3waoEAAYASAAEgK1L_D_BwE&cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Flight_Exact|RSA|544716708174&s_kwcid=AL!1631!3!544716708174!e!!g!!make%20my%20trip%20flights&ef_id=EAIaIQobChMItIKwz6Wr_gIV2G99Ch2m3waoEAAYASAAEgK1L_D_BwE:G:s)");
		
		
		as= new Actions(driver);
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait( driver, Duration.ofSeconds(10));

		
	}
	
	
	
	
	
	
}