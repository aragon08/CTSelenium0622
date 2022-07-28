package testSel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

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
		
		List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class=\"firstLevelMenu\"]"));
		System.out.println("Numero de elementos: " + firstLevelMenu.size());
		
//		String primerMenu = firstLevelMenu.get(0).getText();
//		String segundoMenu = firstLevelMenu.get(1).getText();
//		System.out.println(primerMenu);
//		System.out.println(segundoMenu);
		
		for (int i = 0; i < firstLevelMenu.size(); i++) {
			System.out.println("El menu es: " + firstLevelMenu.get(i).getText());
		}
	}

}
