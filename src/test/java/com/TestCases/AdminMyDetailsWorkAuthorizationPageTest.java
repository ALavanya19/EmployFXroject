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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.AdminMyDetailsWorkAuthorizationPage;
import com.WebPages.LoginPage;
import com.aventstack.extentreports.ExtentTest;

public class AdminMyDetailsWorkAuthorizationPageTest extends Base{

	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminMyDetailsWorkAuthorizationPage adminMyDetailsWorkAuthorizationPage;
	
	
	FileInputStream inputExcelFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@BeforeMethod
	public void myDetails_WorkAuthorizaton_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
		adminMyDetailsWorkAuthorizationPage=adminMyDetailsPage.myDetails_WorkAuthorizationOption_Validation();
		
		
		inputExcelFile=new FileInputStream("C:\\Users\\91900\\git\\repository\\EmployFX\\src\\resources\\java\\com\\TestDataInputFile\\EmployFxInputData.xlsx");
		workbook=new XSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet("WorkAuthorization&Passport&I94");
		
	}
	
	@AfterMethod
	public void myDetails_WorkAuthorization_TearDown() {
		tearDown();
		extent.flush();
	}
	
	//Current URL Validation
	@Test(priority = 1, description = "Admin MyDetails-Work Authorization Page Work Authorization Option Current URL Validation")
	public void myDetails_WorkAuthorization_CurrentURL_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Work Authorization Option Current URL Validation");
		test.info("Validating Admin MyDetails-Work authorization Page Work Authorization Option Current URL");
		String actual_CurrentURL=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_CurrentURL_Validation();
		String expected_CurrentURL="general/workauthorizations";
		if(actual_CurrentURL.contains(expected_CurrentURL)) {
			test.pass("Admin MyDetails-Work Authorization Page Work Authorization Option Current URL Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page  Work Authorization Option Current URL Validation Successfull - PASS");
		}
		else {
			Assert.fail("Admin MyDetails-Work Authorization Page Work Authorization Option Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page Work Authorization Option Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	//Title Validation
	@Test(priority = 2, description = "Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation")
	public void myDetails_WorkAuthorization_Title_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation");
		test.info("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation");
		String actual_Title=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_Title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title)) {
			test.pass("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page Work Authorization Option Title Validation Unsuccessfull - FAIL");
		}
	}
	
	//Work Authorization Heading Validation
	@Test(priority = 3, description = "Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationTableHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page Work Authorization Option Heading");
		String actual_WorkAuthorizationHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_WorkAuthorizationTableHeading_Validation();
		String expected_WorkAuthorizationHEading="Work Authorization";
		if(actual_WorkAuthorizationHeading.equals(expected_WorkAuthorizationHEading)) {
			test.pass("Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page Work Authorization Option Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	//Passport HEading Validation
	@Test(priority = 4, description = "Admin MyDetails-Work Authorization Page Passport Option Heading Validation")
	public void myDetails_WorkAuthorization_PassportTableHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Passport Option Heading Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page Passport Option Heading");
		String actual_PassportHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_PassportTableHeading_Validation();
		String expected_PassportHeading="Passport";
		if(actual_PassportHeading.equals(expected_PassportHeading)) {
			test.pass("Admin MyDetails-Work Authorization Page Passport Option Heading Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page Passport Option Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page Passport Option Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page Passport Option Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	//I-94 Heading Validation
	@Test(priority = 5, description = "Admin MyDetails-Work Authorization Page I-94 Option Heading Validation")
	public void myDetails_WorkAuthorization_I94TableHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page I-94 Option Heading Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page I-94 Option Heading");
		String actual_I94Heading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_I94TableHeading_Validation();
		String expected_I94Heading="I-94";
		if(actual_I94Heading.equals(expected_I94Heading)) {
			test.pass("Admin MyDetails-Work Authorization Page I-94 Option Heading Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page I-94 Option Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page I-94 Option Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page I-94 Option Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 7, description = "Admin MyDetails-Work Authorization Page Work Authorization Option Elements should be as Per Requirement Validation")
	public void MyDetails_WorkAuthorization_WorkAuthorizationPresencesOfElements_Validation_Test()throws AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Elements should be as Per Requirement Validation");
		test.info("Validation Admin MyDetails-Work Authorization Page Elements should be as Per Requirement");
		
		List<Object>elementPresent=new ArrayList<Object>();
		elementPresent=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_WorkAuthorizationElementsAsPerRequirements_Validation();
		
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
			test.pass("Admin MyDetails-Work Authorization Page Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Work Authorization Page Elements should be as Per Requirement Validation Successfull, All Elements are Available - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available");
			Log.info("Admin MyDetails-Work Authorization Page Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available - FAIL");
		}
	}
	
	@Test(priority = 8, description ="Admin MyDetails-Work Authorization Page Work Authorization Option Loggingout from the Application and browsing back using Browser back button Validation")
	public void myDetails_WorkAuthorization_LogOutBrowsingBack_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Work Authorization Option Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page Work Authorization Option Loggingout from the Application and browsing back using Browser back button");
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
	
	@Test(priority = 9, description = "Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationOption_AddButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation");
		adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_WorkAuthorizationOptionAddButton_Validation();
		String actual_WorkAuthorizationPopUpHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddWorkAuthorizationPopUpHeading_Validation();
		String expected_WorkAuthorizationPopUpHeading="Add Work Authorization Details";
		if(actual_WorkAuthorizationPopUpHeading.equals(expected_WorkAuthorizationPopUpHeading)) {
			test.pass("Navigated to Add Work Authorization Details PopUp, Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation successfull");
			Log.info("Navigated to Add Work Authorization Details PopUp, Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation Successfull - PASS");
		}
		else {
			Assert.fail("Unable to Navigated to Add Work Authorization Details PopUp, Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation Unsuccessfull");
			Log.info("Unable to Navigated to Add Work Authorization Details PopUp successfuly, Admin MyDetails-Work Authorization Page, Work Authorization option Add Button Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 10, description = "Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationOption_AllFieldsDataWithSaveButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Save Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Save Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getNumericCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(3).getCell(3).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
			Log.info("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithSaveButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(3).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp with AllFieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authroization Details' PopUp with AllFieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
			}
		}

	}
	

	@Test(priority = 11, description = "Admin MyDetails-Work Authorization Page, Work Authorization Option Mandatory Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationOption_MandatoryFieldsDataWithSaveButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work Authorization Option Mandatory Fields Data with Save Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work Authorization Option Mandatory Fields Data with Save Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(4).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(4).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(4).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(4).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(4).getCell(5).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(4).getCell(3).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
			Log.info("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
			
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_MandatoryFieldsDataWithSaveButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(4).getCell(3).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp with Mandatory FieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authroization Details' PopUp with Mandatory FieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
			}
		}		
	}
	
	@Test(priority = 12, description = "Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Cancel Button Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationOption_AllFieldsDataWithCancelButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Cancel Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Cancel Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getNumericCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(4).getCell(3).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull");
			Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull - FAIL");	
		}
		else
		{	
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(3).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp with AllFieldsData With Cancel Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authroization Details' PopUp with AllFieldsData With Cancel Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull - FAIL");
			}
		}
	}
		
	@Test(priority = 13, description = "Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Close Button Validation")
	public void myDetails_WorkAuthorization_WorkAuthorizationOption_AllFieldsDataWithCloseButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Close Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work Authorization Option All Fields Data with Close Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getNumericCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(3).getCell(3).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull");
			Log.info("Work Authorization Name Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithCloseButton_Validation(allFieldsData);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(3).getCell(3).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp with AllFieldsData With Close Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Work Authroization Details' PopUp with AllFieldsData With Close Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Work Authorization Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull - FAIL");
			}
		}
	
	}
	
	@Test(priority = 14, description ="Admin MyDetails-Work Authorization Page Passport Option Loggingout from the Application and browsing back using Browser back button Validation")
	public void myDetails_WorkAuthorization_PassportOption_LogOutBrowsingBack_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Passport Option Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page Passport Option Loggingout from the Application and browsing back using Browser back button");
		adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_PassportOption_Validation();
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
	
	@Test(priority = 15, description = "Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation")
	public void MyDetails_WorkAuthorization_PassportPresencesOfElements_Validation_Test()throws AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation");
		test.info("Validation Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement");
		
		List<Object>elementPresent=new ArrayList<Object>();
		elementPresent=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_PassportElementsAsPerRequirements_Validation();
		
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
			test.pass("Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation Successfull, All Elements are Available - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available");
			Log.info("Admin MyDetails-Work Authorization Page Passport Option Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available - FAIL");
		}
	}
	
	@Test(priority = 16, description = "Admin MyDetails-Work Authorization, Passport Option Add Button Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddButton_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization, Passport Option Add Button");
		String actual_AddPassportDetailsPopUpHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportDetailsPopUpHeading_Validation();
		String expected_addPassportDetailsPopUpHeading="Add Passport Details";
		if(actual_AddPassportDetailsPopUpHeading.equals(expected_addPassportDetailsPopUpHeading)) {
			test.pass("Successfully Navigateed to Add Passport Details PopUp,Admin MyDetails-Work Authorization, Passport Option Add Button Validation Successfull");
			Log.info("Successfully Navigateed to Add Passport Details PopUp,Admin MyDetails-Work Authorization, Passport Option Add Button Validation Successfull - PASS");
		}
		else {
			Assert.fail("Unable to Navigateed to Add Passport Details PopUp,Admin MyDetails-Work Authorization, Passport Option Add Button Validation Unsuccessfull");
			Log.info("Unable to Navigateed to Add Passport Details PopUp,Admin MyDetails-Work Authorization, Passport Option Add Button Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 17, description = "Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Heading Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddPassportDetailsPopUpHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Details Popup Heading Validation");
		Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Details Popup Heading Validation");
		String actual_AddPassportDetailsPopUpHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportDetailsPopUpHeading_Validation();
		String expected_addPassportDetailsPopUpHeading="Add Passport Details";
		if(actual_AddPassportDetailsPopUpHeading.equals(expected_addPassportDetailsPopUpHeading)) {
			test.pass("Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Heading Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Heading Validation Successfull - PASS");
		}
		else {
			Assert.fail("Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 18, description = "Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp All Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddPassportDetailsPopUp_AllFieldsDataSaveButton_Validation_Test() throws InterruptedException, AWTException {
		
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Save Button Validation");
		Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Save Button Validation");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(13).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(13).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(13).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(13).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(13).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(13).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(13).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(13).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(13).getCell(9).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.passPortRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(13).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
			Log.info("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithSaveButton_Validation(allFieldsData);
		
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(13).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Save Button Validation Unsuccessfull - FAIL");
			}
		}
	}
		
	@Test(priority = 19, description = "Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp Mandatory Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddPassportDetailsPopUp_MandatoryFieldsDataSaveButton_Validation_Test() throws InterruptedException, AWTException {
			
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup Mandatory Fields Data with Save Button Validation");
		Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup Mandatory Fields Data with Save Button Validation");
			
		List<Object>allFieldsData=new ArrayList<Object>();
			
		allFieldsData.add(0, sheet.getRow(14).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(14).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(14).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(14).getCell(5).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(14).getCell(6).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(14).getCell(7).getStringCellValue());
			
			// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.passPortRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(14).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
			Log.info("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportPopUp_MandatoryFieldsDataWithSaveButton_Validation(allFieldsData);
		
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(14).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with Mandatory FieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with Mandatory FieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
			}
		}
	}
	
	@Test(priority = 20, description = "Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp All Fields Data with Cancel Button Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddPassportDetailsPopUp_AllFieldsDataCancelButton_Validation_Test() throws InterruptedException, AWTException {
		
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Cancel Button Validation");
		Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Cancel Button Validation");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(13).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(13).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(13).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(13).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(13).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(13).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(13).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(13).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(13).getCell(9).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.passPortRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(13).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With All FieldsData With Cancel Button Validation Unsuccessfull");
			Log.info("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With All FieldsData With Cancel Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
		
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(13).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Cancel Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Cancel Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Cancel Button Validation Unsuccessfull - FAIL");
			}
		}
	}
	
	@Test(priority = 21, description = "Admin MyDetails-Work Authorization, Passport Option Add Passport Details PopUp All Fields Data with Close Button Validation")
	public void myDetails_WorkAuthorization_PassportOption_AddPassportDetailsPopUp_AllFieldsDataCloseButton_Validation_Test() throws InterruptedException, AWTException {
		
		test=extent.createTest("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Close Button Validation");
		Log.info("Admin MyDetails-Work Authorization, Passport Option Add Passport Details Popup All Fields Data with Close Button Validation");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(13).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(13).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(13).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(13).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(13).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(13).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(13).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(13).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(13).getCell(9).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.passPortRecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(13).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With All FieldsData With Close Button Validation Unsuccessfull");
			Log.info("Passport Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With All FieldsData With Close Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
		
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.workAuthorizationRecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(13).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Close Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp with AllFieldsData With Close Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add Passport Details' PopUp With AllFieldsData With Close Button Validation Unsuccessfull - FAIL");
			}
		}
	}
		
	@Test(priority = 22, description ="Admin MyDetails-Work Authorization Page I-94 Option Loggingout from the Application and browsing back using Browser back button Validation")
	public void myDetails_WorkAuthorization_I94Option_LogOutBrowsingBack_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page I-94 Option Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page I-94 Option Loggingout from the Application and browsing back using Browser back button");
		adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_I94Option_Validation();
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
	
	@Test(priority = 23, description = "Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation")
	public void MyDetails_WorkAuthorization_I94PresencesOfElements_Validation_Test()throws AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation");
		test.info("Validation Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement");
		
		List<Object>elementPresent=new ArrayList<Object>();
		elementPresent=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_I94ElementsAsPerRequirements_Validation();
		
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
			test.pass("Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation Successfull, All Elements are Available - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available");
			Log.info("Admin MyDetails-Work Authorization Page I-94 Option Elements should be as Per Requirement Validation Unsuccessfull, All Elements are not Available - FAIL");
		}
	}
	
	@Test(priority = 24, description = "Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation")
	public void myDetails_WorkAuthorization_I94AddButton_Validation_Test() {
		extent.createTest("Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation");
		test.info("Validating Admin MyDetaails-Work Authorization Page I-94 Option Add Button");
		String actual_I94PopUpHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94DetailsPopUpHeading_Validation();
		String expected_I94PopUpHeading="Add I-94 Details";
		if(actual_I94PopUpHeading.equals(expected_I94PopUpHeading)) {
			test.pass("Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation Successfull");
			Log.info("Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation Unsuccessfull");
			Log.info("Admin MyDetaails-Work Authorization Page I-94 Option Add Button Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 25, description = "Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation")
	public void myDetails_WorkAuthorization_AddI94DetailsHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading");
		String actual_I94PopUpHeading=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94DetailsPopUpHeading_Validation();
		String expected_I94PopUpHeading="Add I-94 Details";
		if(actual_I94PopUpHeading.equals(expected_I94PopUpHeading)) {
			test.pass("Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation Successfull");
			Log.info("Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 26, description = "Admin MyDetails-Work Authorization Page I-94 'Add I-94 Details' PopUp Elements to be Present Validation")
	public void myDetails_WorkAuthorization_AddI94DetailsElementsToBePresent_Validation_Test() throws AWTException {
		test=extent.createTest("Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present Validation");
		test.info("Validation Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present");
		
		List<Object>elementPresent=new ArrayList<Object>();
		elementPresent=adminMyDetailsWorkAuthorizationPage.myDetails_WorkAutjorization_AddI94DetailsPopUp_ElementsToBePresent_Validation();
		
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
			test.pass("Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present Validation Successfull, All Elements are Available - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present Validation Unsuccessfull, All Elements are not Available");
			Log.info("Admin MyDetails-Work Authoriation Page I-94 'Add I94 Details' PopUp Elements to be Present Validation Unsuccessfull, All Elements are not Available - FAIL");
		}	
	}
	
	@Test(priority = 27, description = "Admin MyDetails-Work Authorization Page, I-94 Option All Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_I94Option_AllFieldsDataWithSaveButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Save Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Save Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(23).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(23).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(23).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(23).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(23).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(23).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(23).getCell(7).getStringCellValue());
			
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(23).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Save Button Validation Unsuccessfull");
			Log.info("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Save Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithSaveButton_Validation(allFieldsData);
			//Checking Record is added or not
			Thread.sleep(3000);
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(23).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Save Button Validation Unsuccessfull - FAIL");
			}
		}

	}
	

	@Test(priority = 28, description = "Admin MyDetails-Work Authorization Page, I-94 Option Mandatory Fields Data with Save Button Validation")
	public void myDetails_WorkAuthorization_I94Option_MandatoryFieldsDataWithSaveButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, I-94 Option Mandatory Fields Data with Save Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, I-94 Option Mandatory Fields Data with Save Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(24).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(24).getCell(3).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(24).getCell(4).getStringCellValue());
		
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(24).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
			Log.info("I-94 number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
			
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94PopUp_MandatoryFieldsDataWithSaveButton_Validation(allFieldsData);
			//Checking Record is added or not
			Thread.sleep(3000);
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(24).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with Mandatory FieldsData With Save Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with Mandatory FieldsData With Save Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With Mandatory FieldsData With Save Button Validation Unsuccessfull - FAIL");
			}
		}		
	}
	
	@Test(priority = 29, description = "Admin MyDetails-Work Authorization Page, I-94 Option All Fields Data with Cancel Button Validation")
	public void myDetails_WorkAuthorization_I94Option_AllFieldsDataWithCancelButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Cancel Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Cancel Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(23).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(23).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(23).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(23).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(23).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(23).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(23).getCell(7).getStringCellValue());
			
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(23).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Cancel Button Validation Unsuccessfull");
			Log.info("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Cancel Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
			Thread.sleep(3000);
			//Checking Record is added or not
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(23).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Cancel Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Cancel Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Cancel Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Cancel Button Validation Unsuccessfull - FAIL");
			}
		}

	}
	
	@Test(priority = 30, description = "Admin MyDetails-Work Authorization Page, I-94 Option All Fields Data with Close Button Validation")
	public void myDetails_WorkAuthorization_I94Option_AllFieldsDataWithCloseButton_Validation() throws InterruptedException, AWTException {
		test=extent.createTest("Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Close Button Validation");
		test.info("Validating Admin MyDetails-Work Authorization Page, Work I-94 Option All Fields Data with Close Button");
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(23).getCell(1).getNumericCellValue());
		allFieldsData.add(1, sheet.getRow(23).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(23).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(23).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(23).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(23).getCell(6).getStringCellValue());
		allFieldsData.add(6, sheet.getRow(23).getCell(7).getStringCellValue());
			
		
		// Checking Record is already exist or not
		List<Object>recordsList=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
		int existFlag=CommonActions.existingRecordCheck(recordsList, sheet.getRow(23).getCell(1).getNumericCellValue());
		if(existFlag==1) {
			Assert.fail("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Close Button Validation Unsuccessfull");
			Log.info("I-94 Number Record Already Exist,Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Close Button Validation Unsuccessfull - FAIL");
		}
		else
		{
			//If Not available created the record
			adminMyDetailsWorkAuthorizationPage.myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithCloseButton_Validation(allFieldsData);
			//Checking Record is added or not
			Thread.sleep(3000);
			List<Object>recordsListAfterCreatingRecord=adminMyDetailsWorkAuthorizationPage.i94RecordsList();
			
			int addedFlag=CommonActions.existingRecordCheck(recordsListAfterCreatingRecord, sheet.getRow(23).getCell(1).getNumericCellValue());
			
			if(addedFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Close Button validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp with All Fields Data With Close Button validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Close Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Work Authorization Page 'Add I-94 Details' PopUp With All Fields Data With Close Button Validation Unsuccessfull - FAIL");
			}
		}

	}

	
	
}
