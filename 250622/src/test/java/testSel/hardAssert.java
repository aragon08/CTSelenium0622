package testSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
  @Test
  public void assertEq() {
//	  int a = 10;
//	  int b = 10;
//	  Assert.assertEquals(a, b);
	  
	String exePath = "./drivers/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";
	
	Assert.assertEquals(actualTitle, expectedTitle);
  }
}
