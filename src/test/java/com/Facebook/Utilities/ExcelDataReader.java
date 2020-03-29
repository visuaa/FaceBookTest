package com.Facebook.Utilities;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	FileInputStream fis;
	
	 XSSFWorkbook Wb;
	 
	 int rowCount;
	 
	 int columnCount;
	 
	public int getRowCount()
	{   
		setRowCount();
		return rowCount;
	}

	public int getColumnCount() 
	{   
		setColumnCount();
		return columnCount;
	}

	public ExcelDataReader() 
	{
		File src = new File(".\\TestData\\TestData.xlsx");
		try 
		{
			fis = new FileInputStream(src);
			
            Wb = new XSSFWorkbook(fis);
        } 
		catch (Exception e)
		{
            System.out.println("unable to read excel file");
		}
	}
	
	public void setRowCount() 
	{
		rowCount = Wb.getSheetAt(0).getPhysicalNumberOfRows();
	}
	
	public void setColumnCount() 
	{
		columnCount = Wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();
	}


	
	public String getStringData(int sheetIndex,int row,int col )
	{
		return Wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getIntegerData(int sheetIndex,int row,int col )
	{
		return Wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getNumericCellValue();
	}

}