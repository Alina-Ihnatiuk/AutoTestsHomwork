package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMethods {
	
	private WebDriver driver;

	public TestMethods(WebDriver driver) {
		this.driver = driver;
	}
		
	public void inputText(By by, String text) {
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(text);
		element.submit();
	}
			
	public boolean checkTextPresent (By by, String str) {
		WebElement element = driver.findElement(by);
		return element.getText().contains(str) ;
		
	}
	
	public void navigateMenu (By locatorForAction, By locatorToClickOn) {
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);					
		actions.moveToElement(driver.findElement(locatorForAction)).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorToClickOn));
		driver.findElement(locatorToClickOn).click();
	}
	
	public void changeLanguage (By by) {
		List<WebElement> languagesToTest = driver.findElements(by);
			for (WebElement element: languagesToTest) {
				if(!element.isSelected()) {
					element.click();	
				}
		}				
	}
		
	public boolean checkSorting (By by, String name) {
		driver.navigate().refresh();
		List<WebElement> linkList = driver.findElements(by);
		boolean isSorted = true;
			for (WebElement element : linkList) {	
				if (!element.getText().contains(name)) {
					isSorted = false;				
					return isSorted;
				}		
			}
		return isSorted;	
	}
		
}
	

