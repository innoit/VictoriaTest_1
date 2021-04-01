package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.GenericMethods;

public class MunimadridHome {
	public WebDriver driver;
	
	private By iframeContainer = By.id("twitter-widget-0");
	private By tweetag = By.xpath("//h1[contains(text(), 'Tweets')]");
	private By cookiesmessage = By.cssSelector(".eliminar");
	private By diariobutton = By.xpath("//a[contains(@href, 'diario')]");
	
	
	public MunimadridHome (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getIframeContainer() {
		return driver.findElement(iframeContainer);
	}
	
	public WebElement getTweeTag() {
		return driver.findElement(tweetag);
	}
	
	public WebDriver getIframeContext() {
		return driver.switchTo().frame(getIframeContainer());
	}
	
	public WebElement getCookiesMessage() {
		return driver.findElement(cookiesmessage);
	}
	
	public WebElement getDiarioButton() {
		return driver.findElement(diariobutton);
	}
	
	public void waitForTweetag(WebDriver driver) {
		GenericMethods tweetwait = new GenericMethods(driver);
		tweetwait.getElementVisibility(tweetag, 3);
	}
	
//	public void clickOnUnclickableCookies(WebDriver driver) {
//		GenericMethods cookiesclick = new GenericMethods(driver);
//		cookiesclick.clickOnUnclickableElement(getCookiesMessage(), driver);
//	}
	
	public void clickOnUnclickableCookies(WebDriver driver) {
		GenericMethods cookiesclick = new GenericMethods(driver);
		cookiesclick.clickOnUnclickableElement(cookiesmessage, driver);
	}
	
	public void waitForDiario(WebDriver driver) {
		GenericMethods diariowait = new GenericMethods(driver);
		diariowait.getElementVisibility(diariobutton, 4);
	}
}
