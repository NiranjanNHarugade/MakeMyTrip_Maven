package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManger {
	
	public static void main (String []args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.youtube.com");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.youtube.com");
	}
	

}
