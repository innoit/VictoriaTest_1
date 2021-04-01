package innoItselenium.tweets;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.MunimadridHome;

public class DiarioMadridTest extends BaseDriverClass {
public WebDriver driver;

@BeforeTest
public void setup() throws IOException {
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
}

@Test
public void searchMadridDiario() throws InterruptedException {
	MunimadridHome searchdiario = new MunimadridHome (driver);
	searchdiario.clickOnUnclickableCookies(driver);
	searchdiario.waitForDiario(driver);
	searchdiario.getDiarioButton().click();
}

@AfterTest
public void tearDown() {
  driver.close();
}
}
