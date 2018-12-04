package com.qa.base;

import java.io.FileInputStream;


//@Test(dataProvider="getloginData")

/*@DataProvider
public Object[][] getloginData() throws Exception
{
	Object[][] data=TestUtilJXL.getTestData("login");
	return data;
}*/


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class LoginExcelReading extends TestBase {
	
	public static Workbook book;
	public static Sheet sheet;
	
	
	public static String Test_data_sheet_path="C:\\Users\\Nishant\\eclipse-workspace\\Offline_ALT\\src\\main\\java\\com\\qa\\testData\\loginSheet.xls";

public static Object[][] getTestData(String sheetName) throws Exception
	{
		FileInputStream fis=null;
	try 
	{
		fis=new FileInputStream(Test_data_sheet_path);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}

	try
	{
		book= Workbook.getWorkbook(fis);
	}
	catch(IOException e)
	{
		e.printStackTrace();	
	}

	
	

		sheet=book.getSheet(sheetName);

		int totalRows=sheet.getRows();
		int totalColumns=sheet.getColumns();

		Object[][] data=new Object[totalRows-1][totalColumns];

		for(int i=1;i<totalRows;i++)
		{
			for(int k=0;k<totalColumns;k++)
			{
				data[i-1][k] = sheet.getCell(k, i).getContents();
			}
		}
		return data;
	}


	


}
