package com.TestCases;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsEmploymentHistoryPage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;

public class AdminMyDetailsEmploymentHistoryPageTest extends Base{

	
	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminMyDetailsEmploymentHistoryPage adminMyDetailsEmploymentHistoryPage;
	
	
	FileInputStream inputExcelFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@BeforeMethod
	public void myDetails_EmploymentHistoryPage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
		adminMyDetailsEmploymentHistoryPage=adminMyDetailsPage.myDetails_EmploymentHistoryOption_Validation();
		
		inputExcelFile=new FileInputStream("C:\\Users\\91900\\git\\repository\\EmployFX\\src\\resources\\java\\com\\TestDataInputFile\\EmployFxInputData.xlsx");
		workbook=new XSSFWorkbook(inputExcelFile);
		sheet=workbook.getSheet("EmploymentHistory&Reference");
		
	}
	
	@AfterMethod
	public void myDetails_EmploymentHistoryPage_TearDown() {
		tearDown();
		extent.flush();
	}
	
	
	
	//Private methods
	
	//Employee Histoy Table Employer Name & Job Title Records List
	private int myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(Object employerName,Object jobTitle) {
		List<Object>employerNameRecords=adminMyDetailsEmploymentHistoryPage.employmentHistoryPage_EmployerRecordsList();
		List<Object>jobTitleRecords=adminMyDetailsEmploymentHistoryPage.employmentHistoryPage_JobtitleList();
		List<Object>newRecords=new ArrayList<Object>();
		int exist=0;
		newRecords.add(0, employerName);
		newRecords.add(1, jobTitle);
		for(int startingrecord=0;startingrecord<employerNameRecords.size();startingrecord++) {
			if(employerNameRecords.get(startingrecord).equals(newRecords.get(0)) && jobTitleRecords.get(startingrecord).equals(newRecords.get(1))) {
				exist=1;
				break;
			}
		}	
		if(exist==1) {
			return 1;
		}else
		{
			return 0;	
		}
	}
	
	private int AddEmploymentHistoryPopUp_HeadingValidation_Test() {
		test=extent.createTest("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation");
		test.info("Validation Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading");
		adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
		String actual_AddEmploymentHistoryPopUpHeading=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_Header_Validation();
		String expected_AddEmploymentHistoryPopUpHeadeing="Add Employment History Details";
		int headerMatched=0;
		if(actual_AddEmploymentHistoryPopUpHeading.equals(expected_AddEmploymentHistoryPopUpHeadeing)) {
			headerMatched=1;
		}
		else {
			headerMatched=0;
		}
		return headerMatched;
	}	
	
	
	
	
	
	
	
	
	
	
	//Current URL Validation
	@Test(priority = 1, description = "Admin MyDetails-EmployemntHistory Page Current URL Validation")
	public void myDetails_EmploymentHistoryPage_CurrentURL_Validation_Test() {
		test=extent.createTest("Admin MyDetails-EmployemntHistory Page Current URL Validation");
		test.info("Validating Admin MyDetails-EmployemntHistory Page Current URL");
		String actual_CurrentURL=adminMyDetailsEmploymentHistoryPage.myDetails_EmployementHistoryPage_CurrentURL_Validation();
		String expected_CurrentURL="general/employments";
		if(actual_CurrentURL.contains(expected_CurrentURL)) {
			test.pass("Admin MyDetails-EmployemntHistory Page Current URL Validation Successfull");
			Log.info("Admin MyDetails-EmployemntHistory Page Current URL Validation Successfull - PASS");
		}
		else
		{
			test.fail("Admin MyDetails-EmployemntHistory Page Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetails-EmployemntHistory Page Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	//Title Validation
	@Test(priority = 2, description = "Admin MyDetails-EmployemntHistory Page Title Validation")
	public void myDetails_EmployementHistoryPage_Title_ValidationTest() {
		test=extent.createTest("Admin MyDetails-EmployemntHistory Page Title Validation");
		test.info("Validating Admin MyDetails-EmployemntHistory Page Title");
		String actual_Title=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_Title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.contains(expected_Title)) {
			test.pass("Admin MyDetails-EmployemntHistory Page Title Validation Successfull");
			Log.info("Admin MyDetails-EmployemntHistory Page Title Validation Successfull - PASS");
		}
		else
		{
			test.fail("Admin MyDetails-EmployemntHistory Page Title Validation Unsuccessfull");
			Log.info("Admin MyDetails-EmployemntHistory Page Title Validation Unsuccessfull - FAIL");
		}
		
	}
	
	//Heading of Employment History Table
	@Test(priority = 3, description = "Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation")
	public void myDetails_EmploymentHistoryPage_EmploymentHistoryTableHeading_Validation_Test() {
		test=extent.createTest("Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation");
		test.info("Validating Admin MyDetails-EmploymentHistory Page Employment History Table Heading");
		String actual_Heading=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_Header_Validation();
		String expected_Heading="Employment History";
		if(actual_Heading.equals(expected_Heading)) {
			test.pass("Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation Successfull");
			Log.info("Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation Successfull - PASS");
		}
		else
		{
			test.fail("Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails-EmploymentHistory Page Employment History Table Heading Validation Unsuccessfull - FAIL");			
		}
	}
	
	//Add Button Validation
	@Test(priority = 4, description = "Admin MyDetails-EmploymentHistory Page Add Button Validation")
	public void myDetails_EmploymentHistoryPage_AddButton_Validation_Test() {
		test=extent.createTest("Admin MyDetails-EmploymentHistory Page Add Button Validation");
		test.info("Validating Admin MyDetails-EmploymentHistory Page Add Button");
		adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
		String actual_AddEmploymentHistoryPopUpHeading=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_Header_Validation();
		String expected_AddEmploymentHistoryPopUpHeadeing="Add Employment History Details";
		if(actual_AddEmploymentHistoryPopUpHeading.equals(expected_AddEmploymentHistoryPopUpHeadeing)) {
			test.pass("Admin MyDetails-EmploymentHistory Page Add Button, Navigated to AddEmployment HistoryPopUp Validation Successfull");
			Log.info("Admin MyDetails-EmploymentHistory Page Add Button, Navigated to AddEmployment HistoryPopUp Validation Successfull - PASS");
		}
		else {
			test.fail("Admin MyDetails-EmploymentHistory Page Add Button, Unable to Navigate AddEmploymentHistoryPopUp -  Validation Unsuccessful");
			Log.info("Admin MyDetails-EmploymentHistory Page Add Button,Unable to Navigate AddEmploymentHistoryPopUp - Validation Unsuccessfull - FAIL");
		}
	}
	
	//Add Employment History PopUp Heading
	@Test(priority = 5, description = "Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation")
	public void myDetails_EmploymentHistory_AddEmploymentHistoryPopUp_HeadingValidation_Test() {
		test=extent.createTest("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation");
		test.info("Validation Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading");
		int headerMatched=AddEmploymentHistoryPopUp_HeadingValidation_Test();
		if(headerMatched==1){
			test.pass("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation Successfull");
			Log.info("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation Successfull - PASS");
		}
		else {
			test.fail("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation Unsuccessful");
			Log.info("Admin MyDetails-Employment Hiistory Page Add Employment History PopUp Heading Validation Unsuccessfull - FAIL");
		}
		
		
		/*adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
		String actual_AddEmploymentHistoryPopUpHeading=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_Header_Validation();
		String expected_AddEmploymentHistoryPopUpHeadeing="Add Employment History Details";*/
		
	}
	

	//Add Employment History Table Presence of Elements
	@Test(priority = 6, description = "Admin MyDetails-Employment History Page Employment History Table Elements Should be as per requirement Validation")
	public void myDetails_EmploymentHistory_EmploymentHistoryTable_PresenceOfElementsValidation_Test() throws AWTException {
		test=extent.createTest("Admin MyDetails-Employment History Page Employment History Table Elements Should be as per requirement Validation");
		test.info("Validation Admin MyDetails-Employment History Page Employment History Table Elements Should be as per requirement");
		List<Object>presenceOfElements=new ArrayList<Object>();
				presenceOfElements=adminMyDetailsEmploymentHistoryPage.myDetails_EmployentHistoryPage_EmploymentHistoryTablePresenceOfElements_Validation();
		
		//Check element present or not
		int flag=0;
		for(int count=0;count<presenceOfElements.size();count++) {
			if(presenceOfElements.get(count).equals(true)) {
				flag++;
			}
			else {
				flag=0;
				break;
			}
		}
		
		if(flag==presenceOfElements.size()) {
			test.pass("Admin MyDetails-Employment History Page Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Employment History Page Elements should be as Per Requirement Validation Successfull, All Elements are available - PASS");
		}
		else
		{
			test.fail("Admin MyDetails-Employment History Page Elements should be as Per Requirement Validation Successfull, All Elements are available");
			Log.info("Admin MyDetails-Employment History Page Elements should be as Per Requirement Validation Successfull, All Elements are available - FAIL");
		}	
	}
	
	//Add Employment History Table Presence of Elements
	@Test(priority = 7, description = "Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation")
	public void myDetails_EmploymentHistory_AddEmploymentHistoryPopUp_ElementsNeedToPresentValidation_Test() throws AWTException {
		test=extent.createTest("Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation");
		test.info("Validation Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation");
		//Click on Employement History Add Button
		adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
		//Get the elements list in the Add employment History Popup
		List<Object>elements=new ArrayList<Object>();
				elements=adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddEmploymentHistoryPopUp_PresenceOfElements_Validation();
		
		//Check element present or not
		int flag=0;
		for(int count=0;count<elements.size();count++) {
			if(elements.get(count).equals(true)) {
				flag++;
			}
			else {
				flag=0;
				break;
			}
		}
		
		if(flag==elements.size()) {
			test.pass("Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation Successfull");
			Log.info("Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation Successfull - PASS");
		}
		else
		{
			test.fail("Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation Unsuccessfull");
			Log.info("Admin MyDetails-Employment History Page Add Employment History PopUp Elements Should be as per requirement Validation Unsuccessfull - FAIL");
		}	
	}
	
	@Test(priority = 8, description = "Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation")
	public void myDetails_EmploymentHistory_AddEmploymenthistoryPopUp_AllFieldsDataWithSaveButton_Validation_Test() throws AWTException, InterruptedException {
		test=extent.createTest("Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation");
		test.info("Validation of Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button");
		
		//Get the All input fields data from the excel
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getNumericCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		//Check the Employer Name & Job Title is exist in Employement History Table or not
		int flag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
		
		//If Exist don't give permissions to create
		if(flag==1) {
			Assert.fail("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull");
			Log.info("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(2).getStringCellValue()));
		}
		
		//not exist create the record
		else
		{
			//Step-1:   Click on Employment History Add Button
			adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
			
			//Step-2:	Enter data into all fields & Click on [Save] Button, Create the Employment History Record 
			adminMyDetailsEmploymentHistoryPage.myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithSaveButton_Validation(allFieldsData);
		
			//Step-3:	Check Record is created or not
			int createdRecordFlag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
			if(createdRecordFlag==1) {
				test.pass("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Successfull - PASS");
			}
			else
			{
				test.fail("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(1).getStringCellValue()));
			}		
		}
		
	}
	
	
	@Test(priority = 9, description = "Admin MyDetails-Employment History Page Add Employment History PopUp Mandatory Fields Data with Save Button Validation")
	public void myDetails_EmploymentHistory_AddEmploymenthistoryPopUp_MandatoryFieldsDataWithSaveButton_Validation_Test() throws AWTException, InterruptedException {
		test=extent.createTest("Admin MyDetails-Employment History Page Add Employment History PopUp Mandatory Fields Data with Save Button Validation");
		test.info("Validation of Admin MyDetails-Employment History Page Add Employment History PopUp Mandatory Fields Data with Save Button");
		
		//Get the All input fields data from the excel
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(4).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(4).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(4).getCell(4).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(4).getCell(5).getStringCellValue());
		
		
		//Check the Employer Name & Job Title is exist in Employement History Table or not
		int flag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(4).getCell(1).getStringCellValue(),sheet.getRow(4).getCell(2).getStringCellValue());
		
		//If Exist don't give permissions to create
		if(flag==1) {
			Assert.fail("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull");
			Log.info("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot(sheet.getRow(3).getCell(1).getStringCellValue());
		}
		
		//not exist create the record
		else
		{
			//Step-1:   Click on Employment History Add Button
			adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
			
			//Step-2:	Enter data into all fields & Click on [Save] Button, Create the Employment History Record 
			adminMyDetailsEmploymentHistoryPage.myDetails_EmployementHistory_AddEmploymentHistoryPopUp_MandatoryFieldsDataWithSaveButton_Validation(allFieldsData);
			
			
			
			
			//Step-3:	Check Record is created or not
			int createdRecordFlag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(4).getCell(1).getStringCellValue(),sheet.getRow(4).getCell(2).getStringCellValue());
			if(createdRecordFlag==1) {
				test.pass("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Save Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot((sheet.getRow(4).getCell(1).getStringCellValue()+sheet.getRow(4).getCell(1).getStringCellValue()));
			}		
		}
		
	}
	
	@Test(priority = 10, description = "Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation")
	public void myDetails_EmploymentHistory_AddEmploymenthistoryPopUp_AllFieldsDataWithCancelButton_Validation_Test() throws AWTException, InterruptedException {
		test=extent.createTest("Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation");
		test.info("Validation of Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button");
		
		//Get the All input fields data from the excel
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getNumericCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		//Check the Employer Name & Job Title is exist in Employement History Table or not
		int flag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
		
		//If Exist don't give permissions to create
		if(flag==1) {
			Assert.fail("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Unsuccessfull");
			Log.info("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(2).getStringCellValue()));
		}
		
		//not exist create the record
		else
		{
			//Step-1:   Click on Employment History Add Button
			adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
			
			//Step-2:	Enter data into all fields & Click on [Cancel] Button, Create the Employment History Record 
			adminMyDetailsEmploymentHistoryPage.myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithCancelButton_Validation(allFieldsData);
		
			//Step-3:	Check Record is created or not
			int createdRecordFlag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
			if(createdRecordFlag==0) {
				test.pass("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Successfull");
				Log.info("Record Created Successfull, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Successfull - PASS");
			}
			else
			{
				Assert.fail("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Unsuccessfull");
				Log.info("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cancel Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(1).getStringCellValue()));
			}		
		}
		
	}

	
	@Test(priority = 11, description = "Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation")
	public void myDetails_EmploymentHistory_AddEmploymenthistoryPopUp_AllFieldsDataWithCrossButton_Validation_Test() throws AWTException, InterruptedException {
		test=extent.createTest("Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation");
		test.info("Validation of Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button");
		
		//Get the All input fields data from the excel
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, sheet.getRow(3).getCell(1).getStringCellValue());
		allFieldsData.add(1, sheet.getRow(3).getCell(2).getStringCellValue());
		allFieldsData.add(2, sheet.getRow(3).getCell(3).getStringCellValue());
		allFieldsData.add(3, sheet.getRow(3).getCell(4).getStringCellValue());
		allFieldsData.add(4, sheet.getRow(3).getCell(5).getStringCellValue());
		allFieldsData.add(5, sheet.getRow(3).getCell(6).getNumericCellValue());
		allFieldsData.add(6, sheet.getRow(3).getCell(7).getStringCellValue());
		allFieldsData.add(7, sheet.getRow(3).getCell(8).getStringCellValue());
		allFieldsData.add(8, sheet.getRow(3).getCell(9).getStringCellValue());
		allFieldsData.add(9, sheet.getRow(3).getCell(10).getStringCellValue());
		allFieldsData.add(10, sheet.getRow(3).getCell(11).getNumericCellValue());
		allFieldsData.add(11, sheet.getRow(3).getCell(12).getStringCellValue());
		allFieldsData.add(12, sheet.getRow(3).getCell(13).getStringCellValue());
		allFieldsData.add(13, sheet.getRow(3).getCell(14).getStringCellValue());
		allFieldsData.add(14, sheet.getRow(3).getCell(15).getStringCellValue());
		allFieldsData.add(15, sheet.getRow(3).getCell(16).getStringCellValue());
		allFieldsData.add(16, sheet.getRow(3).getCell(17).getStringCellValue());
		
		
		//Check the Employer Name & Job Title is exist in Employement History Table or not
		int flag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
		
		//If Exist don't give permissions to create
		if(flag==1) {
			Assert.fail("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Unsuccessfull");
			Log.info("Employer Name & Job Title Record Already Exist,Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Unsuccessfull - FAIL");
			CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(2).getStringCellValue()));
		}
		
		//not exist create the record
		else
		{
			//Step-1:   Click on Employment History Add Button
			adminMyDetailsEmploymentHistoryPage.myDetails_EmploymentHistoryPage_AddButton_Validation();
			
			//Step-2:	Enter data into all fields & Click on [Save] Button, Create the Employment History Record 
			adminMyDetailsEmploymentHistoryPage.myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithCrossButton_Validation(allFieldsData);
		
			//Step-3:	Check Record is created or not
			int createdRecordFlag=myDetails_EmployemntHistory_EmployerNameJobTitleRecords_Validation_Test(sheet.getRow(3).getCell(1).getStringCellValue(),sheet.getRow(3).getCell(2).getStringCellValue());
			if(createdRecordFlag==0) {
				test.pass("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Successfull");
				Log.info("Unable to Create record, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Successfull - PASS");
			}
			else
			{
				test.fail("Record created successfully, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Unsuccessfull");
				Log.info("Records created successfully, Admin MyDetails-Employment History Page Add Employment History PopUp All Fields Data with Cross Button Validation Unsuccessfull - FAIL");
				CommonActions.screenShot((sheet.getRow(3).getCell(1).getStringCellValue()+sheet.getRow(3).getCell(1).getStringCellValue()));
			}		
		}
		
	}

	
	
	
	
	
	
}
