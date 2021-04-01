package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MunimadridHome {
	public WebDriver driver;
	
	private By iframeContainer = By.xpath("twitter-widget-0");
	private By tweetext = By.xpath("//h1[contains(text(), 'Tweets')]");
	
	public MunimadridHome (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getIframeContainer() {
		return driver.findElement(iframeContainer);
	}
	
	public WebElement getTweeText() {
		return driver.findElement(tweetext);
	}
	
	public Boolean isFrameDisplayed() {
		return driver.switchTo().frame(getIframeContainer()).findElement(By.xpath("//h1[contains(text(), 'Tweets')]")).isDisplayed();
	}
	
}
