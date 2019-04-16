/*package com.TestNGTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelSheet {
	public String[][] readFromExcel(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
		 
		//Read the data from the Excel Sheet
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheetName);
		 
		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		 
		for (int i= 1 ; i < totalNoOfRows; i++) {
		 
		for (int j=0; j < totalNoOfCols; j++) {
		arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
		}
		 
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return arrayExcelData;
		}
}
*/