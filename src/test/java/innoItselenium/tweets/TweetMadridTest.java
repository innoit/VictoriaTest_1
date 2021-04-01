package innoItselenium.tweets;

import org.testng.annotations.Test;

import pageobjects.MunimadridHome;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TweetMadridTest extends BaseDriverClass{
public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void searchMadridTweets() {
		MunimadridHome tweetLookup = new MunimadridHome(driver);
//		WebElement element =  driver.findElement(By.id("twitter-widget-0"));
//		boolean b = driver.switchTo().frame(element).findElement(By.xpath("//h1[contains(text(), 'Tweets')]")).isDisplayed();
		
		Assert.assertTrue(tweetLookup.isFrameDisplayed());
	}
	
	@AfterTest
	public void tearDown() {
	  driver.close();
	}
}
