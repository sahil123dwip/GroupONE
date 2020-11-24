package com.osa.fileReaders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFileRead {
	@DataProvider(name = "FB")
	public Object[][] excelRead() throws IOException {
		
		FileInputStream fl = new FileInputStream("/Users/mdalamin/Desktop/Book01.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook (fl);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		        int rowSize = sheet.getLastRowNum();
		        int  cellSize= sheet.getRow(0).getLastCellNum();
		        
		    Object[][]data = new Object[rowSize][cellSize];
		        
		      for (int i=1; i<=rowSize; i++) {
		      for(int j=0; j<cellSize; j++) {
		    	  
		    	data[i-1][j] = sheet.getRow(i).getCell(j); 
	
		    	
	    }  
		    	  
      }	  
		    	  
		    return data; 	  
		       
	}

}
