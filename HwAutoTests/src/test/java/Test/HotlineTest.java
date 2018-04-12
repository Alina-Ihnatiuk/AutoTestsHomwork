package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HotlineTest extends BasicTest {
  
	private WebDriver driver = getConfiguredDriver(BrowserType.CHROME);
	
	TestMethods method = new TestMethods(driver);
	Locators locator = new Locators();
	
	private String textToInsert = "Hotline";
	private String pageHeading = "Power Bank";
	private String phoneType = "Xiaomi";
	
	public static final String GOOGLE_URL = "https://www.google.com.ua/";
	public static final String HOTLINE_URL = "https://hotline.ua/";
	
	
	@Test (priority = 1)
	public void openHotlinePageTest() {
		
		driver.get(GOOGLE_URL);
		method.inputText(locator.getGoogleSearchField(), textToInsert);
		driver.findElement(locator.getFirstGoogleLink()).click();	
		Assert.assertTrue(driver.getTitle().contains(textToInsert), "Page's Title is wrong");
				
	}
	
	@Test (priority = 2)
	public void changeLanguageTest() {
		driver.get(HOTLINE_URL);
		String heading = driver.findElement(locator.getMenuHeading()).getText();
		method.changeLanguage(locator.getLanguage());
		Assert.assertTrue(heading != driver.findElement(locator.getMenuHeading()).getText());		
	}
			
	@Test (priority = 3)
	public void navigateToPageTest() {		
		driver.get(HOTLINE_URL);
		method.navigateMenu(locator.getProductSmartphone(), locator.getPoverBank());
		Assert.assertTrue(method.checkTextPresent(locator.getPageHeading(), pageHeading));
			
	}
	
	@Test (priority = 4)
	public void selectProductsTest () {	
		driver.findElement(locator.getBattery()).click();
		driver.findElement(locator.getXiaomi()).click();
		Assert.assertTrue(method.checkSorting(locator.getLinkList(), phoneType)) ;
					
	}	
		
	@AfterClass 
	public void quit() {
		quitDriver(driver);
	}
		
}
