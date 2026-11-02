package PracticeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingPart1 {

	//Excel File-->WorkbooK-->Sheets-->Rows-->Cells
	public static void main(String[] args) throws IOException {
	
	//read data from excel
		
		//Read the file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\TestData_Read.xlsx");
		
		//get the file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//get sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//find no of rows
		int rows=sheet.getLastRowNum();
		
		//find no of cells
		int cells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("No of rows :"+rows);
		System.out.println("No of cells :"+cells);
		
		for(int r=0;r<=rows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell currentCell=currentRow.getCell(c);
				System.out.print(currentCell.toString()+"            ");
			}
			System.out.println();
		}
		
	//Create data in excel
		FileOutputStream newfile=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\TestData.xlsx");
		
		XSSFWorkbook newworkbook=new XSSFWorkbook();
		
		XSSFSheet newsheet=newworkbook.createSheet("Data");
		
		XSSFRow row1=newsheet.createRow(0);
		row1.createCell(0).setCellValue("Selenium");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2=newsheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(20);
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3=newsheet.createRow(2);
		row3.createCell(0).setCellValue("java");
		row3.createCell(2).setCellValue("Automation");
		
		newworkbook.write(newfile);
	}

}
