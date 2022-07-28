package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonClasses.WrapClass;

public class DirectoryPage {
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Directory WebWlements
	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement schDirName;

	@FindBy(className = "ac_results")
	private WebElement schNameOver;

	@FindBy(id = "searchDirectory_job_title")
	private WebElement drpJobTitle;

	@FindBy(id = "searchDirectory_location")
	private WebElement drpLocation;

	@FindBy(id = "searchBtn")
	private WebElement btnSchDirectory;
	
	@FindBy(className = "odd")
	private WebElement schResult;

	public void searchNathan(String name) {
		WrapClass.sendKeys(schDirName, name);
		WrapClass.click(schNameOver);

	}

	public void searchJobTitle(String visibleText) {
//		Select dropJT = new Select(drpJobTitle);
//		dropJT.selectByVisibleText("Sales Representative");
		WrapClass.dropSelect(drpJobTitle, visibleText);

	}

	public void searchLocation(String visibleText) {
//		Select dropLoc = new Select(drpLocation);
//		dropLoc.selectByVisibleText("  United States");
		WrapClass.dropSelect(drpLocation, visibleText);

	}

	public void btnSearchDirectory() {
		WrapClass.click(btnSchDirectory);
	}
	
//	public void searchResult() {
//		String getResultName = schResult.getText();
//		boolean schResultName =  getResultName.contains("Nathan Elliot");
//		if (schResultName) {
//			System.out.println("Se muestra Nathan Elliot");
//		}else {
//			System.out.println("ERROR: Nathan Elliot no existe");
//		}
//		
//	}
	
	public boolean verifySearchNameResult(String expectedName) {
		boolean isDisplayed = schResult.getText().contains(expectedName);
		return isDisplayed;
	}

}
