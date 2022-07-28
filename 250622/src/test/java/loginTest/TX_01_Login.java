package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TX_01_Login {

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
	public void TC_01() {
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PWD_ADMIN);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_01");
		driver.quit();
	}
}
