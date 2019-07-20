package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Excel {
	@Test 
	public static String[][] read_data(String wbookname) throws IOException
	{
		// creating an object for XSSFWorkbook and adding the path
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+wbookname+".xlsx");
		// navigate to sheet
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		//get the no of filled rows
		int rows = sheet.getLastRowNum();
		// get the number of cloumns using the row index
		int column = sheet.getRow(0).getLastCellNum();
		// iterating on the rows and columns to find the cell value
		String[][] data =new String[rows][column];
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <column; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data);
			}
			wbook.close();
		}
		return data;
		
//		1 : Create a 2 dimentin array with arguements " String[][] data =new String[rows][column];"
//		2 : assigning the cell value into the 2 dimentional array "data[i-1][j] = cell.getStringCellValue();"
//		  a : row value will start from 1 but array index value will be from 0 hence i-1
//		3 : converting the whole method read_data() into 2 dimention String array and return type
//		4 : adding the return type in line no 34	
	}

}
