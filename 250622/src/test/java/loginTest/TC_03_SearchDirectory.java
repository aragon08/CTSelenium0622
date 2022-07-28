package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_03_SearchDirectory {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();

	}
	
	@Test
	public void TC_03() throws InterruptedException {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PWD_ADMIN);
//		Thread.sleep(2000);
		dashboard.directory();

		directory.searchNathan("Nathan");

		directory.searchJobTitle("Sales Representative");
		
		directory.searchLocation("  United States");
		
		directory.btnSearchDirectory();
		Thread.sleep(2000);
		//directory.searchResult();
		Assert.assertTrue(directory.verifySearchNameResult("Nathan"));
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
  
}
