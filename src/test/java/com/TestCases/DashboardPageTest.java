package com.TestCases;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;

public class DashboardPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;

	
	@BeforeMethod
	public void dashboardPage_SetUp() {
		
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		
	
	}
	
	@AfterMethod
	public void dashboardPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	
	@Test(priority = 1, description = "DashboardPage Current Url Validation")
	public void validating_DashboardPage_URL_Test() {
		test=extent.createTest("DashboardPage Current URL validation");
		test.info("Validating DashboardPage Current URL");
		//CommonActions.webDriverWaitMethod().until(ExpectedConditions.urlContains("staging.employfx.com/#/superAdmin"));
		String actual_DashbordPaage_CurrentUrl=dashboardPage.validating_DashboardPage_CurrentUrl();
		String expected_DashboardPage_CurrentUrl="superAdmin";
		//System.out.println(actual_DashbordPaage_CurrentUrl);
		if(actual_DashbordPaage_CurrentUrl.contains(expected_DashboardPage_CurrentUrl))
		{
			test.pass("DashboardPage Current Url Validation Successfull");
			Log.info("DashboardPage Current Url Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("DashboardPage Current Url Validation Unsuccessfull");
			Log.info("DashboardPage Current Url Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "DashboardPage Title Validation")
	public void validating_DashboardPage_Title_Test() {
		test=extent.createTest("DashboardPage Title Validation");
		test.info("Validating DashboardPage Title");
		String actual_DashboardPage_Title=dashboardPage.validating_DashboardPage_Title();
		String expected_DashboardPage_Title="EmployFX - Employee Management";
		//System.out.println(actual_DashboardPage_Title);
		if(actual_DashboardPage_Title.equals(expected_DashboardPage_Title))
		{
			test.pass("DashboardPage Title validation Successfull");
			Log.info("DashboardPage Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("DashboardPage Title Validation Unsuccessfull");
			Log.info("DashboardPage Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "DashboardPage EmployFX Management Label text validation")
	public void validating_DashboardPage_HeadingLabelText_Test() {
		test=extent.createTest("DashboardPage EmployFX Management Label Text Validation");
		test.info("Validating DashboardPage EmployFX Managemetnt Label Text Validation");
	    String actual_DashboardPage_HeadingLabelText=dashboardPage.validating_DashboardPage_HeaadingLabelText();
	    String expected_DashboardPage_HeadingLabelText="EmployFX - Employee Management";
	    //System.out.println(actual_DashboardPage_HeadingLabelText);
	    if(actual_DashboardPage_HeadingLabelText.equals(expected_DashboardPage_HeadingLabelText))
	    {
	        test.pass("DashboardPage EmployFx Management Label Text Validation Successfully");
	        Log.info("DashboardPage EmployFX Management Label Text Validation Successfull- PASS ");        
	    }
	    else
	    {
	    	Assert.fail("DashboardPage EmployFX Management Label Text Validation Unsuccessfull");
	    	Log.info("DashboardPage EmployFx Management Label Text Validation Unsuccessfull - FAIL");
	    }
	}
	
	/*@Test(priority = 4, enabled = false,description = "DashboardPage Greetings Validation")
	public void validating_DashboardPage_Greeting_Test() {
		test=extent.createTest("DashboardPage EmployFX Managament Label Text Validation");
		test.info("Validation DashboardPage EmployFX Management Label Text");
		
	}*/
	
	
	@Test(priority = 6, description = "DashboardPage Preferences Option Validation")
	public void validating_Preferences_Test() {
		test=extent.createTest("DashboardPage Preferences Option Validation");
		test.info("Validating DashboardPage Preferences option");
		dashboardPage.validating_UserDropDown();
		dashboardPage.validating_Preferences();
		//String actual_DashboardHeadingLabelText=dashboardPage.validating_DashboardPage_HeaadingLabelText();
		
		test.info("Navigated to PreferencesPgae successfully");
		Log.info("Navigated to PreferencesPage Successfully");
	}
	
	@Test(priority = 7, description = "DashboardPage HelpAndSupport option validation")
	public void validating_HelpAndSupport_Test() {
		test=extent.createTest("DashboardPage HelpAnsSupport option validation");
		test.info("Validating DashboardPage HelpAndSupport option");
		dashboardPage.validating_UserDropDown();
		dashboardPage.validating_HelpAndSupport();
		
		test.info("Navigated to HelpAndSupportPage Successfully");
		Log.info("Navigated to HelpAndSupportPage Successfully");
	}

	@Test(priority = 8, description = "DashboardPage User Log Out Validation")
	public void validating_LogOut_Test() {
		test=extent.createTest("DashboardPage LogOut Validation");
		test.info("Validating DashboardPage LogOut option");
		dashboardPage.validating_UserDropDown();
		dashboardPage.validating_LogOut();
		test.info("Navigated to LoginPage successfully");
		Log.info("Navigated to LoginPage Successfully");
	}
	
	@Test(priority = 9, description="DashboardPage User Profile validation")
	public void validating_UserProfile_Test() {
		test=extent.createTest("DashboardPage User Profile Validation");
		test.info("Validating DashboardPage User Profile");
		Boolean actual_UserProfile_Validatiom=dashboardPage.validating_UserProfile();
		if(actual_UserProfile_Validatiom)
		{
			test.pass("DashboardPage User Profile displayed & validation successfull");
			Log.info("DashboardPage User Profile displayed & validation succesfull - PASS");
		}
		else
		{
			Assert.fail("DashboardPage User Profile not displayed & Validation Unssucessfull");
			Log.info("DashboardPage User Profile not displayed & Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 10, description = "DashboardPage Business Category option validation")
	public void validating_BusinessCategories_Test() {
		test=extent.createTest("DashboardPage Business Categories Validation");
		test.info("Validating DashboardPage Business Categories option");
		dashboardPage.validating_BusinessCategories();
		test.info("Navigated to Business Categories Page Successfully");
		Log.info("Navigated to Business Categories Page successfully");
	}
	

	@Test(priority = 11, description = "DashboardPage Companies option validation")
	public void validating_Companies_Test() {
		test=extent.createTest("DashboardPage Companies Validation");
		test.info("Validating DashboardPage Companies option");
		dashboardPage.validating_CompaniesOption();
		test.info("Navigated to Companies Page Successfully");
		Log.info("Navigated to Companies Page Successfully");
	}
	
	/*@Test(priority = 12, enabled = false, description = "DashboardPage Chat Window option validation")
	public void validating_ChatWindow_Test() {
		test=extent.createTest("DashboardPage ChatWindow Validation");
		test.info("Validating DashboardPage chatWindow option");
		dashboardPage.validating_ChatWindowOption();
		test.info("Navigated to Chat Window Page Successfully");
		Log.info("Navigated to Chat Window Successfully");
	}*/
	

	@Test(priority = 13, description = "DashboardPage Logging into the Application and browsing back using Browser back button validaion")
	public void dashboardPage_ValidatingBrowserBackButton_Test() {
		test=extent.createTest("DashboardPage Logging into the Application and browsing back using Browser back button validaion");
		test.info("Validating of DashboardPage Logging into the Application and browsing back using Browser back button");
		driver.navigate().back();
		driver.navigate().forward();
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
	
	@Test(priority = 14, description = "DashboardPage Loggingout from the Application and browsing back using Browser back button Validation")
	public void dashboardPage_ValidatingLoggingOutBackButon_Test() {
		test=extent.createTest("DashboardPage Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating for DashboardPage Loggingout from the Application and browsing back using Browser back button");
		dashboardPage.validating_UserDropDown();
		dashboardPage.validating_LogOut();
		driver.navigate().back();
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
	
	
	
}
