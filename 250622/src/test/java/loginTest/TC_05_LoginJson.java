package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.LoginPage;

public class TC_05_LoginJson {

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
	public void TC_05() {
		String user = WrapClass.getJSONValue("TC_05", "username");
		String pwd = WrapClass.getJSONValue("TC_05", "password");
		login.login(user, pwd);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_05");
		driver.quit();
	}
}
