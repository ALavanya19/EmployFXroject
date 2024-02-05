package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AddCompanyPage;
import com.WebPages.BusinessCategoriesPage;

import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;


public class AddCompanyPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	BusinessCategoriesPage businessCategoryPage;
	CompanyListPage companyListPage;
	AddCompanyPage addCompanyPage;
	
	
    FileInputStream inputExcelFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@BeforeMethod
	public void addCompaniesPage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		companyListPage=dashboardPage.validating_CompaniesOption();
		addCompanyPage=companyListPage.validating_companyListPage_AddCompanyButton();
		inputExcelFile=new FileInputStream("C:\\Users\\91900\\git\\repository\\EmployFX\\src\\resources\\java\\com\\TestDataInputFile\\EmployFxInputData.xlsx");
		workbook=new XSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet("AddCompany");	
		row=sheet.getRow(1);
	}
	
	@AfterMethod
	public void addCompanyPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	
	@Test(priority = 1, description = "Add Company Page Current URL Validation")
	public void addCompanyPage_CurrentURL_Validation_Test() {
		test=extent.createTest("Add Company Page Current URL Validation");
		test.info("Validation for Add Company Page Current Url");
		String actualCurrentURL=addCompanyPage.addCompanyPage_CurrentURL_Validation();
		String expectedCurrentURL="addCompany";
		if(actualCurrentURL.contains(expectedCurrentURL))
		{
			test.pass("Add Company Page Current URL Validation Successfull");
			Log.info("Add Company Page Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Add Company Page Current URL Validation Unsuccessfull");
			Log.info("Add Company Page Current URL Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "Add Company Page Title Validation")
	public void addCompanyPage_Title_Validation_Test() {
		test=extent.createTest("Add Company Page Title Validation");
		test.info("Validation for Add Company Page Title");
		String actualTitle=addCompanyPage.addCompanyPage_Title_Validation();
		String expectedTitle="EmployFX - Employee Management";
		if(actualTitle.equals(expectedTitle))
		{
			test.pass("Add Company Page Title Validation Successfull");
			Log.info("Add Company Page Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Add Company Page Title Validation Unsuccessfull");
			Log.info("Add Company Page Title Validation UnSuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Add Company Page Heading Label Text Validation")
	public void addCompanyPage_HeadingLabelText_Validation_Test() {
		test=extent.createTest("Add Company Page Heading Label Text Validation");
		test.info("Validation for Add Company Page Heading Label Text");
		String actual_HeadingLabellText=addCompanyPage.addCompanyPage_HeadingLabelText_Validation();
		String expected_HeadingLabelText="Add Company";
		if(actual_HeadingLabellText.equals(expected_HeadingLabelText))
		{
			test.pass("Add Company Page Heading Label Text Validation Successfull");
			Log.info("Add Company Page Heading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Add Company Page Heading Label Text Validation Unsuccessfull");
			Log.info("Add Company Page Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}

	@Test(priority = 4, description = "Add Company Page Sub Heading Label Text Validation")
	public void addCompanyPage_SubHeadingLabelText_Validation_Test() {
		test=extent.createTest("Add Company Page Sub Heading Label Text Validation");
		test.info("Validation for Add Company Page Sub Heading Label Text");
		String actual_SubHeadingLabelText=addCompanyPage.addCompanyPage_SubHeadingLabelText_Validation();
		String expected_SubHeadingLabelText="Company Details";
		if(actual_SubHeadingLabelText.equals(expected_SubHeadingLabelText))
		{
			test.pass("Add Company Page Sub Heading Label Text Validation Successfull");
			Log.info("Add Company Page Sub Heading Label Text Validation Successfull - PASS");	
		}
		else
		{
			Assert.fail("Add Company Page Sub Heading Label Text Validation Unsuccessfull");
			Log.info("Add Company Page Sub Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}
	

	@Test(priority = 5, description = "Add Company Page With All fields Data with save button")
	public void addCompanyPage_AllFields_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Add Company Page with All fields Data");
		test.info("Validating with All fields Data");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, row.getCell(1).getStringCellValue());
		allFieldsData.add(1, row.getCell(2).getStringCellValue());
		allFieldsData.add(2, row.getCell(3).getStringCellValue());
		allFieldsData.add(3, row.getCell(4).getStringCellValue());
		allFieldsData.add(4, row.getCell(5).getStringCellValue());
		allFieldsData.add(5, row.getCell(6).getStringCellValue());
		allFieldsData.add(6, row.getCell(7).getNumericCellValue());
		allFieldsData.add(7, row.getCell(8).getStringCellValue());
		allFieldsData.add(8, row.getCell(9).getStringCellValue());
		allFieldsData.add(9, row.getCell(10).getNumericCellValue());
		allFieldsData.add(10, row.getCell(11).getNumericCellValue());
		allFieldsData.add(11, row.getCell(12).getStringCellValue().toString());
		allFieldsData.add(12, row.getCell(13).getStringCellValue());
		allFieldsData.add(13, row.getCell(14).getStringCellValue());
		allFieldsData.add(14, row.getCell(15).getStringCellValue());
		allFieldsData.add(15, row.getCell(16).getStringCellValue());
		allFieldsData.add(16, row.getCell(17).getStringCellValue());
		allFieldsData.add(17, row.getCell(18).getStringCellValue());
		allFieldsData.add(18, row.getCell(19).getNumericCellValue());
		allFieldsData.add(19, row.getCell(20).getNumericCellValue());
		allFieldsData.add(20, row.getCell(21).getNumericCellValue());
		allFieldsData.add(21, row.getCell(22).getNumericCellValue());
		allFieldsData.add(22, row.getCell(23).getStringCellValue());
		allFieldsData.add(23, row.getCell(24).getStringCellValue());
		allFieldsData.add(24, row.getCell(25).getStringCellValue());
		allFieldsData.add(25, row.getCell(26).getStringCellValue());
		allFieldsData.add(26, row.getCell(27).getStringCellValue());
		allFieldsData.add(27, row.getCell(28).getStringCellValue());
		allFieldsData.add(28, row.getCell(29).getStringCellValue());
		allFieldsData.add(29, row.getCell(30).getNumericCellValue());
		allFieldsData.add(30, row.getCell(31).getNumericCellValue());
		allFieldsData.add(31, row.getCell(32).getNumericCellValue());
		allFieldsData.add(32, row.getCell(33).getNumericCellValue());
		allFieldsData.add(33, row.getCell(34).getStringCellValue());
		allFieldsData.add(34, row.getCell(35).getStringCellValue());
		allFieldsData.add(35, row.getCell(36).getNumericCellValue());
		
		
		
	/*	allFieldsData.add(1, "Banking");
		allFieldsData.add(2, "India");
		allFieldsData.add(3, "Telangana");
		allFieldsData.add(4, "Hyderabad");
		allFieldsData.add(5, "Kukatpally");
		allFieldsData.add(6, "500035");
		allFieldsData.add(7, "https://www.vbh.com");
		allFieldsData.add(8,"vgcdcfvgb@gmail.com");
		allFieldsData.add(9, "7894561235");
		allFieldsData.add(10, "8521479632");
		allFieldsData.add(11, "D:\\EmployFX-Automation\\EmployFX\\src\\resources\\java\\com\\AutoItFiles\\choosefilephoto.exe");
		allFieldsData.add(12, "Mr");
		allFieldsData.add(13, "Srinivas");
		allFieldsData.add(14, "India");
		allFieldsData.add(15, "Telangana");
		allFieldsData.add(16, "Hyderabad");
		allFieldsData.add(17, "Gachibowli");
		allFieldsData.add(18, "500048");
		allFieldsData.add(19, "8521479652");
		allFieldsData.add(20, "1234567893");
		allFieldsData.add(21, "0457891258");
		allFieldsData.add(22, "srinivascfgc@gmail.com");
		allFieldsData.add(23, "Mr");
		allFieldsData.add(24, "Kalyan");
		allFieldsData.add(25, "United States");
		allFieldsData.add(26, "Alabama");
		allFieldsData.add(27, "Aljgf");
		allFieldsData.add(28, "cfvgbhnjmkl");
		allFieldsData.add(29, "25896");
		allFieldsData.add(30, "9874563214");
		allFieldsData.add(31, "5479812658");
		allFieldsData.add(32, "3547896128");
		allFieldsData.add(33, "kalyanfgbhnj@gmail.com");
		allFieldsData.add(34, "Public");
		allFieldsData.add(35, "50");
		
		*/
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add(sheet.getRow(1).getCell(37).getStringCellValue());
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add(sheet.getRow(1).getCell(38).getStringCellValue());
		
		addCompanyPage.addCompanyPage_AllFieldsSave_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Added Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Added Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Add Company");
			Log.info("Unable to Add Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}
	
	@Test(priority = 6, description = "Add Company Page With All fields Data with Cancel button")
	public void addCompanyPage_AllFieldsCancel_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Add Company Page with All fields Data with Cancel Button");
		test.info("Validating with All fields Data with cancel button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		
		allFieldsData.add(0, row.getCell(1).getStringCellValue());
		allFieldsData.add(1, row.getCell(2).getStringCellValue());
		allFieldsData.add(2, row.getCell(3).getStringCellValue());
		allFieldsData.add(3, row.getCell(4).getStringCellValue());
		allFieldsData.add(4, row.getCell(5).getStringCellValue());
		allFieldsData.add(5, row.getCell(6).getStringCellValue());
		allFieldsData.add(6, row.getCell(7).getNumericCellValue());
		allFieldsData.add(7, row.getCell(8).getStringCellValue());
		allFieldsData.add(8, row.getCell(9).getStringCellValue());
		allFieldsData.add(9, row.getCell(10).getNumericCellValue());
		allFieldsData.add(10, row.getCell(11).getNumericCellValue());
		allFieldsData.add(11, row.getCell(12).getStringCellValue().toString());
		allFieldsData.add(12, row.getCell(13).getStringCellValue());
		allFieldsData.add(13, row.getCell(14).getStringCellValue());
		allFieldsData.add(14, row.getCell(15).getStringCellValue());
		allFieldsData.add(15, row.getCell(16).getStringCellValue());
		allFieldsData.add(16, row.getCell(17).getStringCellValue());
		allFieldsData.add(17, row.getCell(18).getStringCellValue());
		allFieldsData.add(18, row.getCell(19).getNumericCellValue());
		allFieldsData.add(19, row.getCell(20).getNumericCellValue());
		allFieldsData.add(20, row.getCell(21).getNumericCellValue());
		allFieldsData.add(21, row.getCell(22).getNumericCellValue());
		allFieldsData.add(22, row.getCell(23).getStringCellValue());
		allFieldsData.add(23, row.getCell(24).getStringCellValue());
		allFieldsData.add(24, row.getCell(25).getStringCellValue());
		allFieldsData.add(25, row.getCell(26).getStringCellValue());
		allFieldsData.add(26, row.getCell(27).getStringCellValue());
		allFieldsData.add(27, row.getCell(28).getStringCellValue());
		allFieldsData.add(28, row.getCell(29).getStringCellValue());
		allFieldsData.add(29, row.getCell(30).getNumericCellValue());
		allFieldsData.add(30, row.getCell(31).getNumericCellValue());
		allFieldsData.add(31, row.getCell(32).getNumericCellValue());
		allFieldsData.add(32, row.getCell(33).getNumericCellValue());
		allFieldsData.add(33, row.getCell(34).getStringCellValue());
		allFieldsData.add(34, row.getCell(35).getStringCellValue());
		allFieldsData.add(35, row.getCell(36).getNumericCellValue());
		
		
	/*	allFieldsData.add(0, "TechInfo");
		allFieldsData.add(1, "Banking");
		allFieldsData.add(2, "India");
		allFieldsData.add(3, "Telangana");
		allFieldsData.add(4, "Hyderabad");
		allFieldsData.add(5,"Kukatpally");
		allFieldsData.add(6, "500035");
		allFieldsData.add(7, "https://www.vbh.com");
		allFieldsData.add(8,"vgcdcfvgb@gmail.com");
		allFieldsData.add(9, "7894561235");
		allFieldsData.add(10, "8521479632");
		allFieldsData.add(11, "D:\\EmployFX-Automation\\EmployFX\\src\\resources\\java\\com\\AutoItFiles\\choosefilephoto.exe");
		allFieldsData.add(12, "Mr");
		allFieldsData.add(13, "Srinivas");
		allFieldsData.add(14, "India");
		allFieldsData.add(15, "Telangana");
		allFieldsData.add(16, "Hyderabad");
		allFieldsData.add(17, "Gachibowli");
		allFieldsData.add(18, "500048");
		allFieldsData.add(19, "8521479652");
		allFieldsData.add(20, "1234567893");
		allFieldsData.add(21, "0457891258");
		allFieldsData.add(22, "srinivascfgc@gmail.com");
		allFieldsData.add(23, "Mr");
		allFieldsData.add(24, "Kalyan");
		allFieldsData.add(25, "United States");
		allFieldsData.add(26, "Alabama");
		allFieldsData.add(27, "Aljgf");
		allFieldsData.add(28, "cfvgbhnjmkl");
		allFieldsData.add(29, "25896");
		allFieldsData.add(30, "9874563214");
		allFieldsData.add(31, "5479812658");
		allFieldsData.add(32, "3547896128");
		allFieldsData.add(33, "kalyanfgbhnj@gmail.com");
		allFieldsData.add(34, "Public");
		allFieldsData.add(35, "50");
		*/
		
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add("United States");
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add("Alabama");
		
		addCompanyPage.addCompanyPage_AllFieldsCancel_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Added Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Added Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Add Company");
			Log.info("Unable to Add Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}
	
	@Test(priority = 7, description = "Add Company Page With All fields Data with Reset button")
	public void addCompanyPage_AllFieldsReset_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Add Company Page with All fields Data with Reset Button");
		test.info("Validating with All fields Data with Reset button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		
		allFieldsData.add(0, row.getCell(1).getStringCellValue());
		allFieldsData.add(1, row.getCell(2).getStringCellValue());
		allFieldsData.add(2, row.getCell(3).getStringCellValue());
		allFieldsData.add(3, row.getCell(4).getStringCellValue());
		allFieldsData.add(4, row.getCell(5).getStringCellValue());
		allFieldsData.add(5, row.getCell(6).getStringCellValue());
		allFieldsData.add(6, row.getCell(7).getNumericCellValue());
		allFieldsData.add(7, row.getCell(8).getStringCellValue());
		allFieldsData.add(8, row.getCell(9).getStringCellValue());
		allFieldsData.add(9, row.getCell(10).getNumericCellValue());
		allFieldsData.add(10, row.getCell(11).getNumericCellValue());
		allFieldsData.add(11, row.getCell(12).getStringCellValue().toString());
		allFieldsData.add(12, row.getCell(13).getStringCellValue());
		allFieldsData.add(13, row.getCell(14).getStringCellValue());
		allFieldsData.add(14, row.getCell(15).getStringCellValue());
		allFieldsData.add(15, row.getCell(16).getStringCellValue());
		allFieldsData.add(16, row.getCell(17).getStringCellValue());
		allFieldsData.add(17, row.getCell(18).getStringCellValue());
		allFieldsData.add(18, row.getCell(19).getNumericCellValue());
		allFieldsData.add(19, row.getCell(20).getNumericCellValue());
		allFieldsData.add(20, row.getCell(21).getNumericCellValue());
		allFieldsData.add(21, row.getCell(22).getNumericCellValue());
		allFieldsData.add(22, row.getCell(23).getStringCellValue());
		allFieldsData.add(23, row.getCell(24).getStringCellValue());
		allFieldsData.add(24, row.getCell(25).getStringCellValue());
		allFieldsData.add(25, row.getCell(26).getStringCellValue());
		allFieldsData.add(26, row.getCell(27).getStringCellValue());
		allFieldsData.add(27, row.getCell(28).getStringCellValue());
		allFieldsData.add(28, row.getCell(29).getStringCellValue());
		allFieldsData.add(29, row.getCell(30).getNumericCellValue());
		allFieldsData.add(30, row.getCell(31).getNumericCellValue());
		allFieldsData.add(31, row.getCell(32).getNumericCellValue());
		allFieldsData.add(32, row.getCell(33).getNumericCellValue());
		allFieldsData.add(33, row.getCell(34).getStringCellValue());
		allFieldsData.add(34, row.getCell(35).getStringCellValue());
		allFieldsData.add(35, row.getCell(36).getNumericCellValue());
		
		/*
		allFieldsData.add(0, "TechInfo");
		allFieldsData.add(1, "Banking");
		allFieldsData.add(2, "India");
		allFieldsData.add(3, "Telangana");
		allFieldsData.add(4, "Hyderabad");
		allFieldsData.add(5,"Kukatpally");
		allFieldsData.add(6, "500035");
		allFieldsData.add(7, "https://www.vbh.com");
		allFieldsData.add(8,"vgcdcfvgb@gmail.com");
		allFieldsData.add(9, "7894561235");
		allFieldsData.add(10, "8521479632");
		allFieldsData.add(11, "D:\\EmployFX-Automation\\EmployFX\\src\\resources\\java\\com\\AutoItFiles\\choosefilephoto.exe");
		allFieldsData.add(12, "Mr");
		allFieldsData.add(13, "Srinivas");
		allFieldsData.add(14, "India");
		allFieldsData.add(15, "Telangana");
		allFieldsData.add(16, "Hyderabad");
		allFieldsData.add(17, "Gachibowli");
		allFieldsData.add(18, "500048");
		allFieldsData.add(19, "8521479652");
		allFieldsData.add(20, "1234567893");
		allFieldsData.add(21, "0457891258");
		allFieldsData.add(22, "srinivascfgc@gmail.com");
		allFieldsData.add(23, "Mr");
		allFieldsData.add(24, "Kalyan");
		allFieldsData.add(25, "United States");
		allFieldsData.add(26, "Alabama");
		allFieldsData.add(27, "Aljgf");
		allFieldsData.add(28, "cfvgbhnjmkl");
		allFieldsData.add(29, "25896");
		allFieldsData.add(30, "9874563214");
		allFieldsData.add(31, "5479812658");
		allFieldsData.add(32, "3547896128");
		allFieldsData.add(33, "kalyanfgbhnj@gmail.com");
		allFieldsData.add(34, "Public");
		allFieldsData.add(35, "50");
		*/
		
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add("United States");
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add("Alabama");
		
		addCompanyPage.addCompanyPage_AllFieldsReset_Validation(allFieldsData,operatingCountries,operatingStates);
		
		addCompanyPage.addCompanyPage_AllFieldsReset_Validation(allFieldsData, operatingCountries, operatingStates);
		
	}
	
	@Test(priority = 8, description = "Add Company Page Without Secondary Details save button")
	public void addCompanyPage_WithoutSecondary_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Add Company Page Without Secondary Details save button");
		test.info("Add Company Page Without Secondary Details save button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, row.getCell(1).getStringCellValue());
		allFieldsData.add(1, row.getCell(2).getStringCellValue());
		allFieldsData.add(2, row.getCell(3).getStringCellValue());
		allFieldsData.add(3, row.getCell(4).getStringCellValue());
		allFieldsData.add(4, row.getCell(5).getStringCellValue());
		allFieldsData.add(5, row.getCell(6).getStringCellValue());
		allFieldsData.add(6, row.getCell(7).getNumericCellValue());
		allFieldsData.add(7, row.getCell(8).getStringCellValue());
		allFieldsData.add(8, row.getCell(9).getStringCellValue());
		allFieldsData.add(9, row.getCell(10).getNumericCellValue());
		allFieldsData.add(10, row.getCell(11).getNumericCellValue());
		allFieldsData.add(11, row.getCell(12).getStringCellValue().toString());
		allFieldsData.add(12, row.getCell(13).getStringCellValue());
		allFieldsData.add(13, row.getCell(14).getStringCellValue());
		allFieldsData.add(14, row.getCell(15).getStringCellValue());
		allFieldsData.add(15, row.getCell(16).getStringCellValue());
		allFieldsData.add(16, row.getCell(17).getStringCellValue());
		allFieldsData.add(17, row.getCell(18).getStringCellValue());
		allFieldsData.add(18, row.getCell(19).getNumericCellValue());
		allFieldsData.add(19, row.getCell(20).getNumericCellValue());
		allFieldsData.add(20, row.getCell(21).getNumericCellValue());
		allFieldsData.add(21, row.getCell(22).getNumericCellValue());
		allFieldsData.add(22, row.getCell(23).getStringCellValue());
		allFieldsData.add(23, row.getCell(35).getStringCellValue());
		allFieldsData.add(24, row.getCell(36).getNumericCellValue());
		
	/*	allFieldsData.add(0, "TechInfo");
		allFieldsData.add(1, "Banking");
		allFieldsData.add(2, "India");
		allFieldsData.add(3, "Telangana");
		allFieldsData.add(4, "Hyderabad");
		allFieldsData.add(5,"Kukatpally");
		allFieldsData.add(6, "500035");
		allFieldsData.add(7, "https://www.vbh.com");
		allFieldsData.add(8,"vgcdcfvgb@gmail.com");
		allFieldsData.add(9, "7894561235");
		allFieldsData.add(10, "8521479632");
		allFieldsData.add(11, "D:\\EmployFX-Automation\\EmployFX\\src\\resources\\java\\com\\AutoItFiles\\choosefilephoto.exe");
		allFieldsData.add(12, "Mr");
		allFieldsData.add(13, "Srinivas");
		allFieldsData.add(14, "India");
		allFieldsData.add(15, "Telangana");
		allFieldsData.add(16, "Hyderabad");
		allFieldsData.add(17, "Gachibowli");
		allFieldsData.add(18, "500048");
		allFieldsData.add(19, "8521479652");
		allFieldsData.add(20, "1234567893");
		allFieldsData.add(21, "0457891258");
		allFieldsData.add(22, "srinivascfgc@gmail.com");
		allFieldsData.add(23, "Public");
		allFieldsData.add(24, "50");
		
		*/
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add(row.getCell(37).getNumericCellValue());
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add(row.getCell(38).getNumericCellValue());
		
		addCompanyPage.addCompanyPage_Mandatoryfields_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Added Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Added Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Add Company");
			Log.info("Unable to Add Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}


	@Test(priority = 9, description = "Add Company Page With Mandatory fields Data with save button")
	public void addCompanyPage_MandatoryFields_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Add Company Page With Mandatory fields Data with save button");
		test.info("Add Company Page With Mandatory fields Data with save button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, row.getCell(1).getStringCellValue());
		allFieldsData.add(1, row.getCell(2).getStringCellValue());
		allFieldsData.add(2, row.getCell(3).getStringCellValue());
		allFieldsData.add(3, row.getCell(4).getStringCellValue());
		allFieldsData.add(4, row.getCell(5).getStringCellValue());
		allFieldsData.add(5, row.getCell(6).getStringCellValue());
		allFieldsData.add(6, row.getCell(7).getNumericCellValue());
		allFieldsData.add(7, row.getCell(9).getStringCellValue());
		allFieldsData.add(8, row.getCell(10).getStringCellValue());
		allFieldsData.add(9, row.getCell(13).getNumericCellValue());
		allFieldsData.add(10, row.getCell(14).getNumericCellValue());
		allFieldsData.add(11, row.getCell(15).getStringCellValue().toString());
		allFieldsData.add(12, row.getCell(16).getStringCellValue());
		allFieldsData.add(13, row.getCell(18).getStringCellValue());
		allFieldsData.add(14, row.getCell(20).getStringCellValue());
		allFieldsData.add(15, row.getCell(36).getStringCellValue());
		
	/*	allFieldsData.add(0, "TechInfo");
		allFieldsData.add(1, "Banking");
		allFieldsData.add(2, "India");
		allFieldsData.add(3, "Telangana");
		allFieldsData.add(4, "Hyderabad");
		allFieldsData.add(5,"Kukatpally");
		allFieldsData.add(6, "500035");
		allFieldsData.add(7,"vgcdcfvgb@gmail.com");
		allFieldsData.add(8, "7894561235");
		allFieldsData.add(9, "Mr");
		allFieldsData.add(10, "Srinivas");
		allFieldsData.add(11, "India");
		allFieldsData.add(12, "Telangana");
		allFieldsData.add(13, "Gachibowli");
		allFieldsData.add(14, "8521479652");
		allFieldsData.add(15, "50");
		
		*/
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add(row.getCell(37).getStringCellValue());
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add(row.getCell(38).getStringCellValue());
		
		addCompanyPage.addCompanyPage_Mandatoryfields_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Added Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Added Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Add Company");
			Log.info("Unable to Add Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}

	
}

