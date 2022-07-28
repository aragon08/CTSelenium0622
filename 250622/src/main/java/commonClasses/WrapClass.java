package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.JsonToWebElementConverter;
import org.openqa.selenium.support.ui.Select;

public class WrapClass {
	
	public static void click(WebElement webElementToClick) {
		webElementToClick.click();
	}
	
	public static void sendKeys(WebElement webElementToSendText, String textToSend) {
		webElementToSendText.sendKeys(textToSend);
	}
	
	public static void dropSelect(WebElement webElementToSelect, String textToSelect) {
		Select drpDwn = new Select(webElementToSelect);
		drpDwn.selectByVisibleText(textToSelect);
	}
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		//Tomandoel screenshot de la pagina
		File scrnFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//Establecer la ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		//Se creo el folder usando la ruta especificaa de la variable "screenshotPath"
		FileHandler.createDir(new File(screenshotPath));
		
		//Copiamos el screenshot a la ruta creada
		try {
			FileHandler.copy(scrnFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getJSONValue(String jsonFileObj, String jsonkeey) {
		//JsonData
		try {
			//Usando la ruta obtenemos el archivo json
			InputStream inputStream = new FileInputStream("./src/test/resources/jsonData/" + jsonFileObj + ".json");
			JSONObject jsonObj = new JSONObject(new JSONTokener(inputStream));//Convertimos el archivo a un objeto Json de Java
					
			//Get Data
			String jsonValue = (String) jsonObj.getJSONObject(jsonFileObj).get(jsonkeey);
			return jsonValue;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static String getCellData(String excelName, int row, int column) {
		//Leyendo data
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/excelData/" + excelName + ".xlsx");
			//Construir un objecto de excel
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis); //Obteniendo el excel
			Sheet sheet = wb.getSheetAt(0);//Leer la hoja 0
			Row rwoObj = sheet.getRow(row);
			Cell cell = rwoObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
