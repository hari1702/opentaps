package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		//Set system property for chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//navigate to Amazon
		driver.get("http://www.amazon.in");
		
		//To route to the excel sheet
		FileInputStream fis = new FileInputStream(new File ("./data/Book1.xlsx"));
		
		//To get workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//To get Sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//To get number of rows in Sheet1
		System.out.println("No of rows in Excel:"+sheet.getLastRowNum());
		
		
		//To get value
		for(int i=1; i<=sheet.getLastRowNum(); i++){
		XSSFRow currentrow = sheet.getRow(i);
		System.out.println(currentrow.getCell(0).getStringCellValue());
		System.out.println(currentrow.getCell(1).getStringCellValue());		
		}
		
		//Enter bag in search using input bag from Excel
		XSSFRow currentrow1 = sheet.getRow(1);
        driver.findElementByXPath("//div[@id='nav-search']/form/div[3]/div/input").sendKeys(currentrow1.getCell(0).getStringCellValue());
        
        //To click search button
        driver.findElementByXPath("//form[@class='nav-searchbar']/div[2]/div/input").click();
        
        
	}

}
