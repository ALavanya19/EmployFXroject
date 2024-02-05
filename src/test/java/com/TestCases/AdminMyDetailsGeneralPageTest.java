package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsGeneralPage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.LoginPage;

public class AdminMyDetailsGeneralPageTest extends Base{

	
	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminMyDetailsGeneralPage adminMyDetailsGeneralPage;
	
	//set Up
	@BeforeMethod
	public void GeneralPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
		adminMyDetailsGeneralPage=adminMyDetailsPage.myDetails_GeneralOption_Validation();
	}
	
	@AfterMethod
	public void GeneralPage_TearDown() {
		tearDown();
		extent.flush();
	}
	
	
	@Test(priority = 1, description = "Admin MyDetails_GeneralPage Current URL Validation")
	public void MyDetailsGeneraPage_CurrentURL_Validation_Test() {
		test=extent.createTest("Admin MyDetails-GeneralPage Current URL Validation");
		test.info("Validating Admin MyDetails-GeneralPage Current URL");
		String actual_GeneralPage_CurrentURL=adminMyDetailsGeneralPage.myDetailsGeneralPage_CurrentURL_Validation();
		String expected_GeneralPage_CurrentURL="general/general";
		if(actual_GeneralPage_CurrentURL.contains(expected_GeneralPage_CurrentURL)) {
			test.pass("Admin MyDetails_GeneralPage Current URL Validation Successfull");
			Log.info("Admin MyDetails_GeneralPAge Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails_GeneralPage Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetails_GeneralPage Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "Admin MyDetails_GeneralPage Title Validation")
	public void MyDetailsGeneralPage_Title_Vlaidation_Test() {
		test=extent.createTest("Admin MyDetail_GeneralPage Title Validation");
		test.info("Validating Admin MyDetails_GeneralPage Title");
		String actual_GeneralPage_Title=adminMyDetailsGeneralPage.myDetailsGeneralPage_Title_Validation();
		String expected_GeneralPage_Title="EmployFX - Employee Management";
		if(actual_GeneralPage_Title.equals(expected_GeneralPage_Title)) {
			test.pass("Admin MyDetails_GeneralPage Title Validation Successfull");
			Log.info("Admin MyDetails_GeneralPage Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails_GeneralPage Title Validation Unsuccessfull");
			Log.info("Admin MyDetails_GeneralPage Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Admin MyDetails_GeneralPage Heading Validation")
	public void myDetailsGeneralPage_Heading_Validation_Test() {
		test=extent.createTest("Admin MyDetails_GeneralPage Heading Validation");
		test.info("Validating Admin MyDetails_GeneralPage Heading");
		String actual_GeneralPage_Heading=adminMyDetailsGeneralPage.myDetailsGeneralPage_Heading_Validation();
		String expected_GeneralPage_Heading="General Details";
		if(actual_GeneralPage_Heading.equals(expected_GeneralPage_Heading)) {
			test.pass("Admin MyDetails_GeneralPage Heading Validation Successfull");
			Log.info("Admin MyDetails_GeneralPage Heading successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetails_GeneralPage Heading Validation Unsuccessfull");
			Log.info("Admin MyDetails_GeneralPage Heading Validation Unsuccessfull- FAIL");
		}
	}
	
	@Test(priority = 4, description = "Admin MyDetails_GeneralPage Full Name Validation")
	public void myDetailsGeneralPage_FullName_Validation_Test() {
		test=extent.createTest("Admin MyDetails_GeneralPage Full Name Validation");
		test.info("Validating Admin MyDetails_GeneralPage Full Name");
		String actual_FullName=adminMyDetailsGeneralPage.myDetailsGeneralPage_FullName_Validation();
		String expected_FullName="";
		
		//Validation
		
	}
	
	@Test(priority = 5, description = "Admin MyDetails_GeneralPage Date Of Birth Validation")
	public void myDetailsGeneralPage_DOB_Validation_Test() {
		test=extent.createTest("Admin MyDetails_GeneralPage Date Of Birth Validation");
		test.info("Validating Admin MyDetails_GeneralPage Date Of Birth");
		String actual_DOB=adminMyDetailsGeneralPage.myDetailsGeneralPage_DOB_Validation();
		String expected_DOB="";
		
		
		//Validation
		
		
	}
	
	@Test(priority = 6, description = "Admin MyDetails_GeneralPage Gender Validation")
	public void myDetailsGeneralPage_Gender_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Gender Validation");
		test.info("Validating Admin MyDetails-GeneralPage Gender");
		String actual_Gender=adminMyDetailsGeneralPage.myDetailsGeneralPage_Gender_Validation();
		String expected_Gender="";
		
		//Validation
		
		
	}
	
	@Test(priority = 7, description = "Admin MyDetails_GeneralPage Email Validation")
	public void myDetailsGeneralPage_Email_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Email Validation");
		test.info("Validating Admin MyDetails-GeneralPage Email");
		String actual_Email=adminMyDetailsGeneralPage.myDetailsGeneralPage_Email_Validation();
		String expected_Email="";
		
		//Validation
		
		
	}
	@Test(priority = 8, description = "Admin MyDetails_GeneralPage Phone Number Validation")
	public void myDetailsGeneralPage_PhoneNumber_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Phone Number Validation");
		test.info("Validating Admin MyDetails-GeneralPage Phone Number");
		String actual_PhoneNumber=adminMyDetailsGeneralPage.myDetailsGeneralPage_PhoneNumber_Validation();
		String expected_PhoneNumber="";
		
		//Validation
		
		
	}
	@Test(priority = 9, description = "Admin MyDetails_GeneralPage Company Name Validation")
	public void myDetailsGeneralPage_CompanyName_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Company Name Validation");
		test.info("Validating Admin MyDetails-GeneralPage Company Name");
		String actual_CompanyName=adminMyDetailsGeneralPage.myDetailsGeneralPage_CompanyName_Valiadtion();
		String expected_CompanyName="";
		
		//Validation
		
		
	}
	@Test(priority = 10, description = "Admin MyDetails_GeneralPage Employee ID Validation")
	public void myDetailsGeneralPage_EmployeeID_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Employee ID Validation");
		test.info("Validating Admin MyDetails-GeneralPage Employee ID");
		String actual_EmployeeID=adminMyDetailsGeneralPage.myDetailsGeneralPage_EmployeeID_Validation();
		String expected_EmployeeID="";
		
		//Validation
		
		
	}
	@Test(priority = 11, description = "Admin MyDetails_GeneralPage Social Security Number Validation")
	public void myDetailsGeneralPage_SocialSecurityNumber_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Social Security Number Validation");
		test.info("Validating Admin MyDetails-GeneralPage Social Security Number");
		String actual_SSN=adminMyDetailsGeneralPage.myDetailsGeneralPage_SocialSecurityNumber_Validation();
		String expected_SSN="";
		
		//Validation
		
		
	}
	@Test(priority = 12, description = "Admin MyDetails_GeneralPage Created Date Validation")
	public void myDetailsGeneralPage_CreatedDate_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Created Date Validation");
		test.info("Validating Admin MyDetails-GeneralPage Created Date");
		String actual_CreatedDate=adminMyDetailsGeneralPage.myDetailsGeneralPage_CreatedDate_Validation();
		String expected_CreatedDate="";
		
		//Validation
		
		
	}
	@Test(priority = 13, description = "Admin MyDetails_GeneralPage Department Validation")
	public void myDetailsGeneralPage_Department_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Department Validation");
		test.info("Validating Admin MyDetails-GeneralPage Department");
		String actual_Department=adminMyDetailsGeneralPage.myDetailsGeneralPage_Department_Validation();
		String expected_Department="";
		
		//Validation
		
		
	}
	@Test(priority = 14, description = "Admin MyDetails_GeneralPage Ethnicity Validation")
	public void myDetailsGeneralPage_Ethnicity_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Ethnicity Validation");
		test.info("Validating Admin MyDetails-GeneralPage Ethnicity");
		String actual_Ethnicity=adminMyDetailsGeneralPage.myDetailsGeneralPage_Ethnicity_Validation();
		String expected_Ethnicity="";
		
		//Validation
		
		
	}
	@Test(priority = 15, description = "Admin MyDetails_GeneralPage Hr Manager Validation")
	public void myDetailsGeneralPage_HRManager_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage HR Manager Validation");
		test.info("Validating Admin MyDetails-GeneralPage HR manager");
		String actual_HRManager=adminMyDetailsGeneralPage.myDetailsGeneralPage_HRManager_Validation();
		String expected_HRManager="";
		
		//Validation
		
		
	}
	@Test(priority = 16, description = "Admin MyDetails_GeneralPage Country Validation")
	public void myDetailsGeneralPage_Country_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Country Validation");
		test.info("Validating Admin MyDetails-GeneralPage Country");
		String actual_Country=adminMyDetailsGeneralPage.myDetailsGeneralPage_Country_Validation();
		String expected_Country="";
		
		//Validation
		
		
	}
	@Test(priority = 17, description = "Admin MyDetails_GeneralPage State Validation")
	public void myDetailsGeneralPage_State_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage State Validation");
		test.info("Validating Admin MyDetails-GeneralPage State");
		String actual_State=adminMyDetailsGeneralPage.myDetailsGeneralPage_State_Validation();
		String expected_State="";
		
		//Validation
		
		
	}
	@Test(priority = 18, description = "Admin MyDetails_GeneralPage Work Authorization Validation")
	public void myDetailsGeneralPage_WorkAuthorization_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Work Authorization Validation");
		test.info("Validating Admin MyDetails-GeneralPage Work Authorization");
		String actual_WorkAuthorization=adminMyDetailsGeneralPage.myDetailsGeneralPage_WorkAuthorization_Validation();
		String expected_WorkAuthorization="";
		
		//Validation
		
		
	}
	@Test(priority = 19, description = "Admin MyDetails_GeneralPage Reporting Manager Validation")
	public void myDetailsGeneralPage_ReportingManager_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Reporting Manager Validation");
		test.info("Validating Admin MyDetails-GeneralPage Reporting Manager");
		String actual_ReportingManager=adminMyDetailsGeneralPage.myDetailsGeneralPage_ReportingManager_Validation();
		String expected_ReportingManager="";
		
		//Validation
		
		
	}
	@Test(priority = 20, description = "Admin MyDetails_GeneralPage Veteran Status Validation")
	public void myDetailsGeneralPage_VeteranStatus_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Veteran Status Validation");
		test.info("Validating Admin MyDetails-GeneralPage Veteran Status");
		String actual_VeteranStatus=adminMyDetailsGeneralPage.myDetailsGeneralPage_VeteranStatus_Validation();
		String expected_VeteranStatus="";
		
		//Validation
		
		
	}
	@Test(priority = 21, description = "Admin MyDetails_GeneralPage Employee Type Validation")
	public void myDetailsGeneralPage_EmployeeType_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Employee Type Validation");
		test.info("Validating Admin MyDetails-GeneralPage Employee Type");
		String actual_EmployeeType=adminMyDetailsGeneralPage.myDetailsGeneralPage_EmployeeType_Validation();
		String expected_EmployeeType="";
		
		//Validation
		
		
	}
	@Test(priority = 22, description = "Admin MyDetails_GeneralPage Classification Validation")
	public void myDetailsGeneralPage_Classification_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Classification Validation");
		test.info("Validating Admin MyDetails-GeneralPage Classification");
		String actual_Classification=adminMyDetailsGeneralPage.myDetailsGeneralPage_Classification_Validation();
		String expected_Classification="";
		
		//Validation
		
		
	}
	@Test(priority = 23, description = "Admin MyDetails_GeneralPage Date Of Join Validation")
	public void myDetailsGeneralPage_DOJ_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Date Of Join Validation");
		test.info("Validating Admin MyDetails-GeneralPage Date Of Join");
		String actual_DOJ=adminMyDetailsGeneralPage.myDetailsGeneralPage_DOJ_Validation();
		String expected_DOJ="";
		
		//Validation
		
		
	}
	@Test(priority = 24, description = "Admin MyDetails_GeneralPage Grade Validation")
	public void myDetailsGeneralPage_Grade_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Grade Validation");
		test.info("Validating Admin MyDetails-GeneralPage Grade");
		String actual_Grade=adminMyDetailsGeneralPage.myDetailsGeneralPage_Grade_Validation();
		String expected_Grade="";
		
		//Validation
		
		
	}
	@Test(priority = 25, description = "Admin MyDetails_GeneralPage Working Country Validation")
	public void myDetailsGeneralPage_WorkingCountry_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Working Country Validation");
		test.info("Validating Admin MyDetails-GeneralPage Working Country");
		String actual_WorkingCountry=adminMyDetailsGeneralPage.myDetailsGeneralPage_WorkingCountry_Validation();
		String expected_WorkingCountry="";
		
		//Validation
		
		
	}
	@Test(priority = 26, description = "Admin MyDetails_GeneralPage Working State Validation")
	public void myDetailsGeneralPage_WorkingState_Validation() {
		test=extent.createTest("Admin MyDetails_GeneralPage Working State Validation");
		test.info("Validating Admin MyDetails-GeneralPage Working State");
		String actual_WorkingState=adminMyDetailsGeneralPage.myDetailsGeneralPage_WorkingState_Validation();
		String expected_WorkingState="";
		
		//Validation
		
		
	}
	
}
