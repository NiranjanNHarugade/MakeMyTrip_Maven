package demo1;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launchWithoutWDM {
	
	public static void main(String[]args) throws AWTException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://cfs.easyhrworld.com/employee");
		
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("https://www.youtube.com");
		
	
		
		
	}
}
