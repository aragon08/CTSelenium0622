package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.LoginPage;

public class TC_04_LogingParam {
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
		@Parameters({"user","password"})
		public void TC_04(String user, String password) {
			login.login(user, password);
		}

		@AfterTest
		public void closeDriver() {
			driver.quit();
		}
}
