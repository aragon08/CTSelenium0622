package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAssertE() {
//	  int a = 5;
//	  int b =10;
//	  int x = 8;
//	  int y = 8;
//	  
//	  softAssert.assertEquals(a, b);
//	  softAssert.assertEquals(x, y);
//	  
//	  softAssert.assertAll();
	  
	String exePath = "./drivers/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
	String badTitle = "OraneHRM";
	
	softAssert.assertEquals(actualTitle, badTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertAll();
  }
}
