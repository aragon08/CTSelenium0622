package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Dashboard WebElements
	@FindBy (id ="welcome") 
	private WebElement welcomeDropDwn;
	
	@FindBy (xpath ="//*[@id=\"welcome-menu\"]/ul/li[3]/a") 
	private WebElement logoutLink;
	
	@FindBy (id = "menu_directory_viewDirectory")
	private WebElement directoryMenu;
	
	public void logout() {
		WrapClass.click(welcomeDropDwn);
		WrapClass.click(logoutLink);
	}
	
	public void directory() {
		WrapClass.click(directoryMenu);
	}

}
