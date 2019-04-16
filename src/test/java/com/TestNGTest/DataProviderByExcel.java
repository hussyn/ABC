package com.TestNGTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderByExcel {

	public String [][] inputData(String filename,String Sheetname) throws FileNotFoundException{
		
		File file=new File("path");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet shName = wb.getSheet(Sheetname);
		//Find number of rows in excel file
		 int rownum = shName.getLastRowNum();
		 short celdata = shName.getRow(rownum).getLastCellNum();
		
		
		//String [][] data=new String[2][2] 
		
		return null;
		
		
	}
}	
/*	public String[][] readFromExcel(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
		 
		//Read the data from the Excel Sheet
		FileInputStream fs = new FileInputStream(fileName);
		//Workbook wb = Workbook.getWorkbook(fs);
		//Sheet sh = wb.getSheet(sheetName);
		 
		int totalNoOfCols = sh.getColumns();
		//int totalNoOfRows = sh.getRows();
		//arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		 
		//for (int i= 1 ; i < totalNoOfRows; i++) {
		 
		for (int j=0; j < totalNoOfCols; j++) {
		arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
		}
		 
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return arrayExcelData;
		}
}*/
