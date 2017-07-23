package main.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessXmlMaven {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		AccessXmlMaven.writeIntoExcel("Record.xlsx");
		System.out.println("Test 1");

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

	

}
