package testSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio1_CT_Sel {

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
		WebElement btnAssignLeave = driver.findElement(By.id("menu_directory_viewDirectory"));
		btnAssignLeave.click();
		
		
		//Ingresar "Nathan" y seleccionar "Nathan Elliot"
		WebElement schDirEmployeeName = driver.findElement(By.name("searchDirectory[emp_name][empName]"));
		schDirEmployeeName.sendKeys("Nathan");
		Thread.sleep(2000);
		WebElement selectEmployee = driver.findElement(By.className("ac_even"));
		selectEmployee.click();
		
		//JobTitle = Sales Representative
		Select drpJobTitle = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		drpJobTitle.selectByVisibleText("Sales Representative");
		Thread.sleep(2000);
		
		//Location= Unated States
		Select drpLocation = new Select(driver.findElement(By.id("searchDirectory_location")));
		drpLocation.selectByVisibleText("  United States");
		Thread.sleep(2000);
		
		WebElement btnSearch = driver.findElement(By.id("searchBtn"));
		Thread.sleep(2000);
		btnSearch.submit();
		
		//Validar que Nathan se muestra
		String resultEmployeeName = driver.findElement(By.className("odd")).getText();
		boolean name = resultEmployeeName.contains("Nathan Elliot");
		if (name) {
			System.out.println("Se muestra Nathan Elliot");
		}else {
			System.out.println("ERROR: Nathan Elliot no existe");
		}
		

	}

}
