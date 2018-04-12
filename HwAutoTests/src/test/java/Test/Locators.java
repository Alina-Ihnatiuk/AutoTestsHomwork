package Test;

import org.openqa.selenium.By;

public class Locators {
	
	private By googleSearchField = By.id("lst-ib");
	private By firstGoogleLink = By.xpath("(//*[@id='rso']//h3)[1]/a");
	private By menuHeading = By.xpath("//span[@class='uppercase']");
	private By language = By.xpath("//*[@id='page-index']/header//span[@data-language]");
	private By productSmartphone = By.xpath("//*[@id='page-index']//li[16]/a");
	private By pageHeading = By.xpath("//h1");
	private By xiaomi = By.xpath("//*[@id='page-catalog']//div[3]/ul[1]/li[9]//a");
	private By battery = By.xpath("//*[@id='page-catalog']//div[1]/div[1]/div[2]/ul/li[6]//a");
	private By powerBank = By.xpath("//*[@id='page-index']//li[16]/div/ul/li[1]//li[4]/a");
	private By linkList = By.xpath(".//*[@id='catalog-products']/div[2]/ul/li/div[4]/div//a");
	
	
	public By getGoogleSearchField() {
		return googleSearchField;
	}
	public By getFirstGoogleLink() {
		return firstGoogleLink;
	}
	public By getMenuHeading() {
		return menuHeading;
	}
	public By getProductSmartphone() {
		return productSmartphone;
	}
	
	public By getPoverBank() {
		return powerBank;
	}
	
	public By getLanguage() {
		return language;
	}
	public By getPageHeading() {
		return pageHeading;
	}
	public By getXiaomi() {
		return xiaomi;
	}
	public By getBattery() {
		return battery;
	}
	public By getLinkList() {
		return linkList;
	}
	

}
