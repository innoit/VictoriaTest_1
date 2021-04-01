package innoItselenium.tweets;

import org.testng.annotations.Test;

import pageobjects.MunimadridHome;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void searchMadridTweets() throws InterruptedException {
		MunimadridHome elframe = new MunimadridHome(driver);
		elframe.getIframeContext();
		WebElement unTweet = elframe.getTweeTag();
		elframe.waitForTweetag(driver);
		Assert.assertTrue(unTweet.isDisplayed());
		//driver.switchTo().defaultContent();
	}
	
	@AfterTest
	public void tearDown() {
	  driver.close();
	}
}
