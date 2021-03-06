package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		//Identificar los webelements de la pagina web
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement userPwd = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		userPwd.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		
		
	//click en AssignLeave
		WebElement btnAssignLeave = driver.findElement(By.className("quickLinkText"));
		btnAssignLeave.click();
		
		
		//Enviar texto a employee name
		WebElement txtEmployeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		txtEmployeeName.sendKeys("Carlos Aragon");
		Thread.sleep(3000);
		txtEmployeeName.clear();
		
		
		//Obtener texto de un webelement
		String welcomeName = driver.findElement(By.id("welcome")).getText();
		boolean name = welcomeName.contains("Welcome kathija");
		if (name) {
			System.out.println("El mensaje contiene el nombre de Kathija");
		}else {
			System.out.println("ERROR: El mensaje no contiene el nombre de Kathija");
		}
		
		//Dropdowns
		Select drpLeaveType = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		drpLeaveType.selectByVisibleText("US - Vacation");

	}

}
