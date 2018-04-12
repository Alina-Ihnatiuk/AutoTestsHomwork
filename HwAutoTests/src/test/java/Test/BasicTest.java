package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public abstract class BasicTest {
	
	public static WebDriver getDriver (BrowserType type) {
		
		switch (type) {
		
			case FIRE_FOX:
				System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				return new FirefoxDriver();
			case OPERA:	
				System.setProperty("webdriver.opera.driver", 
				System.getProperty("user.dir") + "/drivers/operadriver.exe");
				return new OperaDriver();
			case CHROME:
			default:
				System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				return new ChromeDriver();
		}			
	}
	
	public static WebDriver getConfiguredDriver(BrowserType type) {
		WebDriver driver = getDriver(type);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void quitDriver (WebDriver driver) {
		driver.quit();
	}

}
