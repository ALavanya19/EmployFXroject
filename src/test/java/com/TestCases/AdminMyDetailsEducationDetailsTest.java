package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsEducationDetailsPage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.LoginPage;
import com.google.common.net.InetAddresses.TeredoInfo;

public class AdminMyDetailsEducationDetailsTest extends Base {

	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminMyDetailsEducationDetailsPage adminMyDetailsEducationDetailsPage;
	
	
	FileInputStream inputExcelFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@BeforeMethod
	public void myDetails_EducationDetails_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
		adminMyDetailsEducationDetailsPage=adminMyDetailsPage.myDetails_EducationDetailsOption_Validation();
		
		inputExcelFile=new FileInputStream("C:\\Users\\91900\\git\\repository\\EmployFX\\src\\resources\\java\\com\\TestDataInputFile\\EmployFxInputData.xlsx");
		workbook=new XSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet("Education Details");
		
	}
	
	@AfterMethod
	public void myDetails_EducationDetails_TearDown() {
		tearDown();
		extent.flush();
	}
	
	
	@Test(priority = 1, description = "Admin Mydetails-Education Details Page Current URL Validation")
	public void myDetails_EducationDetails_CurrentUrl_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Education Details Page Current URL Validation");
		test.info("Validating Admin MyDetails-Education Details Page Current URL");
		String actual_CurrentUrl=adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_CurrentURL_Validation();
		String expected_CurrentUrl="general/educationDetails";
		if(actual_CurrentUrl.contains(expected_CurrentUrl)) {
			test.pass("Admin MyDetails-Education Details Page Current URL Validation Successfull");
			Log.info("Admin MyDetails-Education Details Page Current URl Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Education Details PAge Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetails-Education Details Page Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "Admin Mydetails-Education Details Page Title Validation")
	public void myDetails_EducationDetails_Title_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Education Details Page Title Validation");
		test.info("Validating Admin MyDetails-Education Details Page Title");
		String actual_Title=adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_Title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title)) {
			test.pass("Admin MyDetails-Education Details Page Title Validation Successfull");
			Log.info("Admin MyDetails-Education Details Page Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Education Details Page Title Validation Unsuccessfull");
			Log.info("Admin MyDetails-Education Details Page Title Validation Unsuccessfull - FAIL");
			
		}
	}
	
	@Test(priority = 3, description = "Admin MyDetails-Education Details Page Table Header Validation")
	public void myDetails_EducationDetails_TableHeader_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Education Details Page Table Header Validation");
		test.info("Validating MyDetails-Education Details Page Table Header");
		String actual_Header=adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_Header_Validation();
		String expected_Header="Education Details";
		if(actual_Header.equals(expected_Header)) {
			test.pass("Admin MyDetails-Education Details Page Table Header Validation Successfull");
			Log.info("Admin MyDetails-Education Details Page Table Header Validation Successfill - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Education Details Page Table Header Unsuccessfull");
			Log.info("Admin MyDetails-Education Details Page Table Header Unsuccessfull - FAIL");
		}
	}
	
	
	@Test(priority = 4, description = "Admin MyDetails-Education Details Add Button Validation")
	public void myDetails_EducationDetails_AddButton_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Education Details Add Button Validation");
		test.info("Validating Admin MyDetails-Education Details Add Button");
		//adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddButton_Validation_Test();
		String actual_Header=adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUpHeader_Validation();
		String expected_Header="Add Education Details";
		if(actual_Header.equals(expected_Header)) {
			test.pass("Navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Successfull");
			Log.info("Navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Unable to navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Unsuccessfull");
			Log.info("Unable to navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 5, description = "Admin MyDetails-Education Details 'Add Education Details' Pop Up Header Validation")
	public void myDetails_EducationDetails_AddEducationDetailsPopUpHeader_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Education Details Add Button Validation");
		test.info("Validating Admin MyDetails-Education Details Add Button");
		String actual_Header=adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUpHeader_Validation();
		String expected_Header="Add Education Details";
		if(actual_Header.equals(expected_Header)) {
			test.pass("Navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Successfull");
			Log.info("Navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Unable to navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Unsuccessfull");
			Log.info("Unable to navigated to Add Education Details PopUp, Admin MyDetails-Education Details Add Button Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 6, description = "Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Save Button validation")
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldDataWithSavButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Education Details Add Education Details Pop Up with AllFieldsData with Save Button validation");
		test.info("Validating Admin MyDetails-Education Details Add Education Details PopUp with All Fields Data with save button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getNumericCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		//allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsEducationDetailsPage.educationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(3).getCell(1).getStringCellValue());
		if(existFlag==1) {
			Assert.fail("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
			Log.info("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot(sheet.getRow(3).getCell(1).getStringCellValue());
		}
		else
		{
			//If Not available created the record
			adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsData_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsEducationDetailsPage.educationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(1).getStringCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot(sheet.getRow(3).getCell(1).getStringCellValue());
			}
		}
	
	}
	
	@Test(priority = 7, description = "Admin MyDetails-Education Details Page 'Add Education Details' PopUp with MandatoryFieldsData With Save Button validation")
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_MandatoryFieldDataWithSavButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Education Details Add Education Details Pop Up with Mandatory FieldsData with Save Button validation");
		test.info("Validating Admin MyDetails-Education Details Add Education Details PopUp with Mandatory Fields Data with save button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(4).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(4).getCell(7).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(4).getCell(8).getStringCellValue());
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsEducationDetailsPage.educationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(4).getCell(1).getStringCellValue());
		if(existFlag==1) {
			Assert.fail("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
			Log.info("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot(sheet.getRow(4).getCell(1).getStringCellValue());
		}
		else
		{
			//If Not available created the record
			adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUp_MandatoryFieldsDataWithSaveButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsEducationDetailsPage.educationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord,sheet.getRow(4).getCell(1).getStringCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot(sheet.getRow(4).getCell(1).getStringCellValue());
			}
		
		}
		
	}
	
	@Test(priority = 8, description = "Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Cancel Button validation")
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldDataWithCancelButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Education Details Add Education Details Pop Up with AllFieldsData with Cancel Button validation");
		test.info("Validating Admin MyDetails-Education Details Add Education Details PopUp with All Fields Data with Cancel button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getNumericCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		//allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsEducationDetailsPage.educationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(3).getCell(1).getStringCellValue());
		if(existFlag==1) {
			Assert.fail("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull");
			Log.info("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsEducationDetailsPage.educationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(1).getStringCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Cancel Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Cancel Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull - FAIL");
			}
		}
	
	
	}
	
	@Test(priority = 9, description = "Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With close Button validation")
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldDataWithCloseButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Education Details Add Education Details Pop Up with AllFieldsData with Close Button validation");
		test.info("Validating Admin MyDetails-Education Details Add Education Details PopUp with All Fields Data with Close button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getNumericCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		//allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsEducationDetailsPage.educationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(3).getCell(1).getStringCellValue());
		if(existFlag==1) {
			Assert.fail("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull");
			Log.info("Education Name Record Already Exist,Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsEducationDetailsPage.myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsDataWithCloseButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsEducationDetailsPage.educationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(1).getStringCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Close Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Education Details Page 'Add Education Details' PopUp with AllFieldsData With Close Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Education Details Page 'Add Education Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull - FAIL");
			}
		}
	
	}
	
	@Test(priority = 10, description ="Admin MyDetails-Education Details Page Loggingout from the Application and browsing back using Browser back button Validation")
	public void myDetails_ContactPage_LogOutBrowsingBack_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Education Details Page Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating Admin MyDetails-Education Details Page Loggingout from the Application and browsing back using Browser back button");
		adminHomePage.adminHomePage_LogoutOption_Validation();
		driver.navigate().back();
		Thread.sleep(2000);
		String actual_401PopUp=CommonActions.PageNotFoundError();
		String expected_401PopUp="OPPS! PAGE NOT FOUND";
		if(actual_401PopUp.contains(expected_401PopUp)) {
			test.pass("401 - Page not Found error Showing Successfull");
			Log.info("401 - Page not Found error Showing Successfull - PASS");
		}
		else
		{
			Assert.fail("401 - Page not Found error is not Showing Unsccessfull");
			Log.info("401 - Page not Found error is not Showing UnSccessfull - FAIL");
		}
	}
	
	
	@Test(priority = 11, description = "Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation")
	public void presencesOfElements_Validation_Test()throws AWTException, InterruptedException {
		
		test=extent.createTest("Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation");
		test.info("Validation Admin MyDetails-EducationDetails Page Elements should be as Per Requirement");
		
		List<Object>elementPresent=new ArrayList<Object>();
		elementPresent=adminMyDetailsEducationDetailsPage.presencesOfElements_Validation();
		
		//Checking whether element present or not
		int flag=0;
		for(int element=0;element<elementPresent.size();element++){
			if(elementPresent.get(element).equals(true)) {
				flag++;
			}
			else
			{
				flag=0;
				break;
			}
		}
		
		//Checking all elements present or not
		if(flag==elementPresent.size()) {
			test.pass("Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation Successfull, All Elements are Available - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available");
			Log.info("Admin MyDetails-EducationDetails Page Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available - FAIL");
		}
	}
	

	
}


