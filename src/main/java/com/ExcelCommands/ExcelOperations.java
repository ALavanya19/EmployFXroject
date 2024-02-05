package com.ExcelCommands;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.Base.Base;
import com.Config.PropertiesClass;

public class ExcelOperations extends Base{

	private static FileInputStream inputExcelFile;
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	private static HSSFCell cell;
	
	public static void inputFileReader(String inputFilePath,String sheetName) throws IOException {
		
		inputExcelFile=new FileInputStream(inputFilePath);
		workbook=new HSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet(sheetName);
		
	}
	
	
	public static void getExcelData(String inputFilePath,String sheetName ) throws IOException {
		inputFileReader(inputFilePath,sheetName);
		row=sheet.getRow(1);
		
	}
	
	
	
	
}
