package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC_06_LoginExcel {

	// Declaramos e inicializamos un objeto del tipo WebDriver para utilizarlos en
	// este test case
	WebDriver driver = DriverSetup.setupDriver();

	// PageObjects
	LoginPage login = new LoginPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();

	}

	@Test
	public void TC_06() {
		String user = WrapClass.getCellData("TC_06", 1, 0);
		String pwd = WrapClass.getCellData("TC_06", 1, 1);
		login.login(user, pwd);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_05");
		driver.quit();
	}
}
