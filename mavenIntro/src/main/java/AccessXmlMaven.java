package main.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessXmlMaven {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		//AccessXmlMaven.writeIntoExcel("Record.xlsx");
		System.out.println("Test 1");
		System.out.println("Test 2");
		AccessXmlMaven accessXmlMaven = new AccessXmlMaven();
		accessXmlMaven.test();

	}
	public static void writeIntoExcel(String file) throws FileNotFoundException, IOException
		{ 
			Workbook book = new XSSFWorkbook(); 
			Sheet sheet = book.createSheet("Birthdays"); 
			Row row = sheet.createRow(0); 
			Cell name = row.createCell(0); 
			name.setCellValue("Avijit"); 
			// Now, its time to write content of Excel into File 
			book.write(new FileOutputStream(file)); 
			book.close(); 
		}
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D://Users//SONAVYUMAN//git//mavenIntro//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//driver.close();
		driver.quit();
	}

	

}
