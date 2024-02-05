package com.TestCases;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminDashboardPage;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsApplyForLeavePage;
import com.WebPages.AdminMyDetailsAssetsPage;
import com.WebPages.AdminMyDetailsContactPage;
import com.WebPages.AdminMyDetailsDependentsPage;
import com.WebPages.AdminMyDetailsEducationDetailsPage;
import com.WebPages.AdminMyDetailsEmploymentHistoryPage;
import com.WebPages.AdminMyDetailsGeneralPage;
import com.WebPages.AdminMyDetailsHolidayCalenderPage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.AdminMyDetailsSkillsPage;
import com.WebPages.AdminMyDetailsTimesheetPage;
import com.WebPages.AdminMyDetailsWorkAuthorizationPage;
import com.WebPages.LoginPage;

public class AdminMyDetailsPageTest extends Base{

	LoginPage loginPage;
	AdminHomePage adminHomePage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminDashboardPage adminDashboardPage;
	AdminMyDetailsGeneralPage adminMyDetailsGeneralPage;
	AdminMyDetailsContactPage adminMyDetailsContactPage;
	AdminMyDetailsEducationDetailsPage adminMyDetailsEducationDetailsPage;
	AdminMyDetailsWorkAuthorizationPage adminMyDetailsWorkAuthorizationPage;
	AdminMyDetailsEmploymentHistoryPage adminMyDetailsEmployementHistoryPage;
	AdminMyDetailsSkillsPage adminMyDetailsSkillsPage;
	AdminMyDetailsDependentsPage adminMyDetailsDependentsPage;
	AdminMyDetailsAssetsPage adminMyDetailsAssetsPage;
	AdminMyDetailsTimesheetPage adminMyDetailsTimesheetPage;
	AdminMyDetailsApplyForLeavePage adminMyDetailsApplyForLeavePage;
	AdminMyDetailsHolidayCalenderPage adminMyDetailsHolidayCalenderPage;
	
	
	//set Up
	public void AdminMyDetailsPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
	}
	
	//tear Down
	public void AdminMyDetailsPage_TearDown() {
		tearDown();
		extent.flush();
	}
	
	
	
	@Test(priority = 1, description = "Admin MyDetailsPage Current URL Validation")
	public void adminMyDetailsPage_CurrentURL_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Current URl Validation");
		test.info("Validating Admin MyDetailsPage Current URL");
		String actual_CurrentURL=adminMyDetailsPage.myDetailsPage_CurrentUrl_Validation();
		String expected_CurrentURL="general/general";
		if(actual_CurrentURL.contains(expected_CurrentURL)) {
			test.pass("Admin MyDetailsPage Current URL Validation Successfull");
			Log.info("Admin MyDetailsPage Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetailsPAge Current URL Validation Unsuccessfull");
			Log.info("Admin MyDetailsPage Curreny URL Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "Admin MyDetailsPage Title Validation")
	public void adminMyDetailsPage_Title_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Title Validation");
		test.info("Validating Admin MyDetailsPage Title");
		String actual_Title=adminMyDetailsPage.myDetailsPage_Title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title)) {
			test.pass("Admin MyDetailsPage Title Validation Successfull");
			Log.info("Admin MyDetailsPage Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetailsPage Title Validation Unsuccesfull");
			Log.info("Admin MyDetailsPage Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Admin MyDetailsPage Back Arrow Button Validation")
	public void adminMyDetailsPage_BackArrowButton_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Back Arrow Button Validation");
		test.info("Validating Admin MyDetailsPage Back Arrow Button");
		adminDashboardPage=adminMyDetailsPage.myDetails_BackArrowButton_Validation();
		test.pass("Admin MyDetails Back Arrow Button Validation Successfull");
		Log.info("Admin MyDetails Back Arrow Button Validation Successfull - PASS");
	}
	
	@Test(priority = 4, description = "Admin MyDetailsPage User Image Validation")
	public void adminMyDetailsPage_UserImage_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage User Image Validation");
		test.info("Validating Admin MyDetails User Image");
		boolean flag=adminMyDetailsPage.myDetails_UserImage_Validation();
		if(flag==true) {
			test.pass("Admin MyDetailsPage User Image Validation successfull, Image is Displaying");
			Log.info("Admin MyDetailsPage User Image Validation Successfull, Image is displaying - PASS");
		}
		else
		{
			Assert.fail("Admin MyDetailsPage User Image Validation Unsuccessfull, Image is not displaying");
			Log.info("Admin MyDetailsPage User Image Validation Unsuccessfull, Image is not displaying - FAIL");
		}
	}
	

	@Test(priority = 5, description = "Admin MyDetailsPage User Name Validation")
	public void adminMyDetailsPage_UserName_Validation_Test() {
		
	}
	
	@Test(priority = 6, description = "Admin MyDetailsPage User Designation Validation")
	public void adminMyDetailsPage_UserDesignation_Validation_Test() {
		
	}
	
	@Test(priority = 7, description = "Admin MyDetailsPage User Email Validation")
	public void adminMyDetailsPage_UserEmail_Validation_Test() {
		
	}
	
	@Test(priority = 8, description = "Admin MyDetailsPage General Option Validation")
	public void adminMyDetailsPage_GeneralOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage General Option Validation");
		test.info("Validating Admin MyDetailsPage General Option");
		adminMyDetailsGeneralPage=adminMyDetailsPage.myDetails_GeneralOption_Validation();
		
		
		
		//Title Validation
		
		
	}
	
	@Test(priority = 9, description = "Admin MyDetailsPage Contact Option Validation")
	public void adminMyDetailsPage_ContactOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Contact Option Validation");
		test.info("Validating Admin MyDetailsPage Contact Option");
		adminMyDetailsContactPage=adminMyDetailsPage.myDetails_ContactOption_Validation();
		
		
		
		//Title Validation
		
		
		
	}
	
	@Test(priority = 10, description = "Admin MyDetailsPage Education Details Option Validation")
	public void adminMyDetailsPage_EducationDetailsOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Education Details Option Validation");
		test.info("Validating Admin MyDetailsPage Education Details Option Validation");
		adminMyDetailsEducationDetailsPage=adminMyDetailsPage.myDetails_EducationDetailsOption_Validation();
		
		
		
		//Title Validation
		
		
		
	}
	
	@Test(priority = 11, description = "Admin MyDetailsPage Work Authorization Option Validation")
	public void adminMyDetailsPage_WorkAuthorizationOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Work Authorization option Validation");
		test.info("Validating Admin MyDetailsPage Work Authorization Option");
		adminMyDetailsWorkAuthorizationPage=adminMyDetailsPage.myDetails_WorkAuthorizationOption_Validation();
		
		
		//Title Validation 
		
		

	}
	
	
	@Test(priority = 12, description = "Admin MyDetailsPage Employment History Option Validation")
	public void adminMyDetailsPage_EmploymentHistoryOption_Validating_Test() {
		test=extent.createTest("Admin MyDetailsPage Employment History Option Validation");
		test.info("Validating Admin MyDetailsPage Employment History Option");
		adminMyDetailsEmployementHistoryPage=adminMyDetailsPage.myDetails_EmploymentHistoryOption_Validation();
		
		
		//Title Validation
		
		
	}
	
	@Test(priority = 13, description = "Admin MyDetailsPage Skills Option Validation")
	public void adminMyDetails_SkillsOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Skills Option Validation");
		test.info("Validating Admin MyDetailsPage Skills Option");
		adminMyDetailsSkillsPage=adminMyDetailsPage.myDetails_SkillsOption_Validation();
		
		
		//Title Validation
		
		
		
	}
	
	@Test(priority = 14, description = "Admin MyDetailsPage Dependents Option Validation")
	public void adminMyDetails_DependentsOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Dependents Option Validation");
		test.info("Admin MyDetailsPage Dependents Option Validation");
		adminMyDetailsDependentsPage=adminMyDetailsPage.myDetails_DependentsOption_Validation();
		
		
		//Title Validation
		
		
	}
	
	@Test(priority = 15, description = "Admin MyDetailsPage Assets Option Validation")
	public void adminMyDetails_AssetsOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Timesheet Option Validation");
		test.info("Validating Admin MyDetailsPage Timesheet Option");
		adminMyDetailsAssetsPage=adminMyDetailsPage.myDetails_AssetsOption_Validation();
		
		
		//Title Validation
		
		
				
	}
	
	@Test(priority = 16, description = "Admin MyDdetailsPage Timesheet Option Validation")
	public void adminMyDetails_TimesheetOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Timesheet Option Validation");
		test.info("Validating Admin MyDetailsPage Timesheet Option");
		adminMyDetailsTimesheetPage=adminMyDetailsPage.myDetails_TimesheetOption_Validation();
		
		
		//Title Validation
		
		
	}
	
	@Test(priority = 17, description = "Admin MyDetailsPage Apply For Leave Option Validation")
	public void adminMyDetails_ApplyForLeaveOption_Validation_Test() {
		test=extent.createTest("Admin MyDetailsPage Apply For Leave Option Validation");
		test.info("Validating Admin MyDetailsPage Apply For Leave Option");
		adminMyDetailsApplyForLeavePage=adminMyDetailsPage.myDetails_ApplyForLeaveOption_Validation();
		
		
		//Title Validation
		
		
		
	}
	
	@Test(priority = 18, description = "Admin MyDetails Holiday Calender Option Validation")
	public void adminMyDetails_HolidayCalender_Validation_Test() {
		test=extent.createTest("Admin MyDetails Holiday Calender Option Validation");
		test.info("Validating Admin MyDetails Holiday Calender Option");
		adminMyDetailsHolidayCalenderPage=adminMyDetailsPage.myDetails_HolidayCalenderOption_Validation();
		
		
		//Title Validation 
		
		
		
	}
	
	
	
	
}
