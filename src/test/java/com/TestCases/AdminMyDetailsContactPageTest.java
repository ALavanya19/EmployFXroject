package com.TestCases;


import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsContactPage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;

public class AdminMyDetailsContactPageTest extends Base{

	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminMyDetailsContactPage adminMyDetailsContactPage;
	
	FileInputStream inputExcelFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;	
	
	
	
	@BeforeMethod
	public void contactPage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
		adminMyDetailsContactPage=adminMyDetailsPage.myDetails_ContactOption_Validation();
		inputExcelFile=new FileInputStream("C:\\Users\\91900\\git\\repository\\EmployFX\\src\\resources\\java\\com\\TestDataInputFile\\EmployFxInputData.xlsx");
		workbook=new XSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet("PresentAddress&EmergencyContact");	
	}
	
	@AfterMethod
	public void contactPage_TearDown() {
		tearDown();
		extent.flush();
	}
	
	@Test(priority = 1, description ="Admin MyDetails-Contact Page Current Url Validation")
	public void myDetails_ContactPage_CurrentUrl_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Current Url Validation");
		test.info("Validating Admin MyDetails-Contact Page Current Url");
		String actual_CurrentURL=adminMyDetailsContactPage.myDetails_ContactPage_CurrentURl_Validation();
		String expected_CurrentURL="general/contact";
		if(actual_CurrentURL.contains(expected_CurrentURL)) {
			test.pass("Admin MyDetails-Contact Page Current URL Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Current URL Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Current URl Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description ="Admin MyDetails-Contact Page Title Validation")
	public void myDetails_ContactPage_Title_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Title Validation");
		test.info("Validating Admin MyDetails-Contact Page Title");
		String actual_Title=adminMyDetailsContactPage.myDetails_ContactPage_Title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title)) {
			test.pass("Admin MyDetails-Contact Page Title Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Title Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Title Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Title Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description ="Admin MyDetails-Contact Page Address Table Header Validation")
	public void myDetails_ContactPage_AddressTableHeader_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Address Table Header Validation");
		test.info("Validating Admin MyDetails-Contact Page Address Table Header");
		String actual_Header=adminMyDetailsContactPage.myDetails_ContactPage_AddressTableHeader_Validation();
		String expected_Header="Address";
		if(actual_Header.equals(expected_Header)) {
			test.pass("Admin MyDetails-Contact Page Address Table Header Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Address Table Headers Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Address Table Header Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Address Table Header Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 4, description ="Admin MyDetails-Contact Page Address Table Add Button Validation")
	public void myDetails_ContactPage_AddressTableAddButton_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Address Table Add Button Validation");
		test.info("Validating Admin MyDetails-Contact Page Address Table Add Button");
		adminMyDetailsContactPage.myDetails_ContactPage_AddessTableAddButton_Validation();
		String actual_PopUpHeading=adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_Header_Validation();
		String expected_PopUpHeading="Add Present Address";
		if(actual_PopUpHeading.contains(expected_PopUpHeading)) {
			test.pass("Admin MyDetails-Contact Page Address Table Add Button Validation Successfull & Navigated to Add Present Address PopUp");
			Log.info("Admin MyDetails-Contact Page Address Table Add Button Validation Successfull & Navigated to Add Present Address PopUp - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Address Table Add Button Validation Unsuccessfull & Unable to Navigate to Add Present Address PopUp");
			Log.info("Admin MyDetails-Contact Page Address Table Add Button Validation Unsuccessfull & Unable to Navigate to Add Present Address PopUp - FAIL");
		}
	}
	

	@Test(priority = 5, description ="Admin MyDetails-Contact Page Add Present Address PopUp Heading Validation")
	public void myDetails_ContactPage_AddPresentAddressPopUpHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Add Present Address PopUp Heading Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Present Address PopUp Heading");
		String actual_PopUpHeading=adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_Header_Validation();
		String expected_PopUpHeading="Add Present Address";
		if(actual_PopUpHeading.contains(expected_PopUpHeading)) {
			test.pass("Admin MyDetails-Contact Page Add Present Address Header Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Add Present Address Header Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Add Present Address Header Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Add Present Address Header Validation Unsuccessfull - FAIL");
		}
	}

	@Test(priority = 6, description ="Admin MyDetails-Contact Page Loggingout from the Application and browsing back using Browser back button Validation")
	public void myDetails_ContactPage_LogOutBrowsingBack_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating Admin MyDetails-Contact Page Loggingout from the Application and browsing back using Browser back button");
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
	
	@Test(priority = 7, description ="Admin MyDetails-Contact Page Add Present Address with All fields Data Validation")
	public void myDetails_ContactPage_AddPresentAddressWithAllFieldsData_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Present Address with All fields Data Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Present Address with All fields Data");
		

		List<Object>allFieldsData=new ArrayList<Object>();

		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getNumericCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getNumericCellValue());
		
		
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_AllFieldsData_Validation(allFieldsData);
		}
		
	
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Present Address Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Present Address Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 8, description ="Admin MyDetails-Contact Page Add Present Address with Mandatory fields Data Validation")
	public void myDetails_ContactPage_AddPresentAddressWithMandatoryFieldsData_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Present Address with Mandatory fields Data Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Present Address with Mandatory fields Data");
		
		List<Object>mandatoryFieldsData=new ArrayList<Object>();

		mandatoryFieldsData.add(0, sheet.getRow(4).getCell(1).getStringCellValue());
		mandatoryFieldsData.add(1, sheet.getRow(4).getCell(3).getStringCellValue());
		mandatoryFieldsData.add(2, sheet.getRow(4).getCell(4).getStringCellValue());
		mandatoryFieldsData.add(3, sheet.getRow(4).getCell(5).getStringCellValue());
		mandatoryFieldsData.add(4, sheet.getRow(4).getCell(6).getNumericCellValue());
		mandatoryFieldsData.add(5, sheet.getRow(4).getCell(7).getStringCellValue());
		mandatoryFieldsData.add(6, sheet.getRow(4).getCell(8).getStringCellValue());
		
		
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_MandatoryFieldsData_Validation(mandatoryFieldsData);
		}

		
		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(4).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Present Address Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Present Address Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Unsucessfull - FAIL");
		}
	}

	@Test(priority = 9, description ="Admin MyDetails-Contact Page Add Present Address with Cancel Button Validation")
	public void myDetails_ContactPage_AddPresentAddressWithCancelButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Present Address with CancelButton Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Present Address with Cancel Button");
		
		List<Object>allFieldsData=new ArrayList<Object>();

		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getNumericCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getNumericCellValue());

		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_CancelButton_Validation(allFieldsData);
		}

		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Present Address Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Present Address Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 10, description ="Admin MyDetails-Contact Page Add Present Address with Close Button Validation")
	public void myDetails_ContactPage_AddPresentAddressWithCloseButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Present Address with Close Button Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Present Address with Close Button");
		
		List<Object>allFieldsData=new ArrayList<Object>();

		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getNumericCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getNumericCellValue());
		
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddAddressPopUp_CloseButton_Validation(allFieldsData);
			
		}
		
		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Present Address Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Present Address Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Present Address Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 11, description ="Admin MyDetails-Contact Page Emergency Contact Table Header Validation")
	public void myDetails_ContactPage_EmergencyContactTableHeader_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Emergency Contact Table Header Validation");
		test.info("Validating Admin MyDetails-Contact Page Emergency Contact Table Header");
		String actual_Header=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactTableHeader_Validation();
		String expected_Header="Emergency Contact";
		if(actual_Header.equals(expected_Header)) {
			test.pass("Admin MyDetails-Contact Page Emergency Contact Table Header Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Table Headers Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Table Header Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Table Header Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 12, description ="Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation")
	public void myDetails_ContactPage_EmergencyContactTableAddButton_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation");
		test.info("Validating Admin MyDetails-Contact Page Emergency Contact Table Add Button");
		adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactTableAddButton_Validation();
		String actual_PopUpHeading=adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_Header_Validation();
		String expected_PopUpHeading="Add Emergency Contact";
		if(actual_PopUpHeading.contains(expected_PopUpHeading)) {
			test.pass("Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation Successfull & Navigated to Add Present Address PopUp");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation Successfull & Navigated to Add Present Address PopUp - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation Unsuccessfull & Unable to Navigate to Add Present Address PopUp");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Table Add Button Validation Unsuccessfull & Unable to Navigate to Add Present Address PopUp - FAIL");
		}
	}
	

	@Test(priority = 13, description ="Admin MyDetails-Contact Page Add Emergency Contact PopUp Heading Validation")
	public void myDetails_ContactPage_AddEmergencyContactPopUpHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-Contact Page Add Emergency Contact PopUp Heading Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Emergency Contact PopUp Heading");
		String actual_PopUpHeading=adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_Header_Validation();
		String expected_PopUpHeading="Add Emergency Contact";
		if(actual_PopUpHeading.contains(expected_PopUpHeading)) {
			test.pass("Admin MyDetails-Contact Page Add Emergency Contact Header Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Add Emergency Contact Header Validation Successfull - PASS");
		
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Add Emergency Contact Header Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Add Emergency Contact Header Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 14, description ="Admin MyDetails-Contact Page Add Emergency Contact with All fields Data Validation")
	public void myDetails_ContactPage_AddEmergencyContactWithAllFieldsData_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Emergency Contact with All fields Data Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Emergency Contact with All fields Data");
		

		List<Object>allFieldsData=new ArrayList<Object>();

		
		allFieldsData.add(0, sheet.getRow(19).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(19).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(19).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(19).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(19).getCell(5).getNumericCellValue());
		allFieldsData.add(5, sheet.getRow(19).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(19).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(19).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(19).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(19).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(19).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(19).getCell(12).getNumericCellValue());
		
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_AllFieldsData_Validation(allFieldsData);
		}
		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 15, description ="Admin MyDetails-Contact Page Add Emergency Contact with Mandatory fields Data Validation")
	public void myDetails_ContactPage_AddEmergencyContactWithMandatoryFieldsData_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Emergency Contact with Mandatory fields Data Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Emergency Contact with Mandatory fields Data");
		
		List<Object>mandatoryFieldsData=new ArrayList<Object>();

		mandatoryFieldsData.add(0, sheet.getRow(20).getCell(1).getStringCellValue());
		mandatoryFieldsData.add(1, sheet.getRow(20).getCell(3).getStringCellValue());
		mandatoryFieldsData.add(2, sheet.getRow(20).getCell(4).getStringCellValue());
	
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(20).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_MandatoryFieldsData_Validation(mandatoryFieldsData);
		}

		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(20).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==1){
			test.pass("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsucessfull - FAIL");
		}
	}

	@Test(priority = 16, description ="Admin MyDetails-Contact Page Add Emergency Contact with Cancel Button Validation")
	public void myDetails_ContactPage_AddEmergencyContactWithCancelButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Emergency Contact with CancelButton Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Emergency Contact with Cancel Button");
		
		List<Object>allFieldsData=new ArrayList<Object>();

		allFieldsData.add(0, sheet.getRow(19).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(19).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(19).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(19).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(19).getCell(5).getNumericCellValue());
		allFieldsData.add(5, sheet.getRow(19).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(19).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(19).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(19).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(19).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(19).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(19).getCell(12).getNumericCellValue());

		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_CancelButton_Validation(allFieldsData);
		}
		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==0){
			test.pass("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(priority = 17, description ="Admin MyDetails-Contact Page Add Emergency Contact with Close Button Validation")
	public void myDetails_ContactPage_AddEmergencyContactWithCloseButton_Validation_Test() throws InterruptedException {
		test=extent.createTest("Admin MyDetails-Contact Page Add Emergency Contact with Close Button Validation");
		test.info("Validating Admin MyDetails-Contact Page Add Emergency Contact with Close Button");
		
		List<Object>allFieldsData=new ArrayList<Object>();

		allFieldsData.add(0, sheet.getRow(19).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(19).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(19).getCell(3).getNumericCellValue());
		allFieldsData.add(3, sheet.getRow(19).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(19).getCell(5).getNumericCellValue());
		allFieldsData.add(5, sheet.getRow(19).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(19).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(19).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(19).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(19).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(19).getCell(11).getStringCellValue());
		allFieldsData.add(11, sheet.getRow(19).getCell(12).getNumericCellValue());
		
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag=0;
		for(int existingRecord=0;existingRecord<actual_records.size();existingRecord++) {
			if(actual_records.get(existingRecord).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1){
			test.pass("Record Already Exist");
			Log.info("Record Already Exist");
		}
		else
		{
			adminMyDetailsContactPage.myDetails_ContactPage_AddEmergencyContactPopUp_CloseButton_Validation(allFieldsData);
			
		}
		
		List<Object>actual_record=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag1=0;
		for(int record=0;record<actual_record.size();record++) {
			if(actual_record.get(record).equals(sheet.getRow(19).getCell(1).getStringCellValue())){
				
				flag1=1;
				break;
			}
			else
			{
				flag1=0;
			}
		}
		
		if(flag1==0){
			test.pass("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsuccessfull");
			Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsucessfull - FAIL");
		}
	}
	
	@Test(enabled = false)
	public void test() {
		List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_AddressesList_Validation();
		
		
		//List<Object>actual_records=adminMyDetailsContactPage.myDetails_ContactPage_EmergencyContactsList_Validation();
		int flag=0;
		for(int record=0;record<actual_records.size();record++) {
			if(actual_records.get(record).equals(sheet.getRow(3).getCell(1).getStringCellValue())){
				
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		System.out.println(flag);
		
		if(flag==1){
			//test.pass("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull");
			//Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Successfull - PASS");
		System.out.println("PASS");
		}
		else
		{
			//test.fail("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsuccessfull");
			//Log.info("Admin MyDetails-Contact Page Emergency Contact Created Validation Unsucessfull - FAIL");
		System.out.println("FAIL");
		}
		
	}
	
	
	
}
