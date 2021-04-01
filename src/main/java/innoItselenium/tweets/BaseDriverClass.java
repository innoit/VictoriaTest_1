package innoItselenium.tweets;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriverClass {
	public WebDriver driver;
	public Properties prop;
	  public WebDriver initializeDriver() throws IOException {
		  
		  prop = new Properties();
		  FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/resources/data.properties");
		  prop.load(fis);
		  String browserName = prop.getProperty("browser");
		  if(browserName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/resources/chromedriver");
			  driver = new ChromeDriver();
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return driver;
	  }
}
