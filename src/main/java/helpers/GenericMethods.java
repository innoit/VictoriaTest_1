package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
  WebDriver driver;
  
  public GenericMethods(WebDriver driver) {
	  this.driver = driver;
  }
  
  public WebElement getElementVisibility(By locator, int timeout) {
	  WebElement element = null;
	  try {
		  WebDriverWait wait = new WebDriverWait(driver, timeout);
		  element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	  } catch (Exception e) {
		  System.out.println("Element is not visible in the webpage");
	  }
	return element;
  }
  
  public void clickOnUnclickableElement(By locator, WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.location = 'https://www.madrid.es/portal/site/munimadrid/portal/site/munimadrid';");
		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].click", element);
}
  
}
