package com.TestCases;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;
import com.WebPages.PreferencesPage;
import com.aventstack.extentreports.ExtentTest;

public class PreferencesPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	PreferencesPage preferencesPage;
	
	
	@BeforeMethod
	public void preferencesPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		preferencesPage=dashboardPage.validating_Preferences();
	}
	
	@AfterMethod
	public void preferencesPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority = 1, description = "PreferenccesPage Current URL validation")
	public void currentURL_Validation_Test() {
		test=extent.createTest("PreferencesPAge Current URL Validation");
		test.info("Validating PreferenccesPage Current URL");
		String actual_CurrentUrl=preferencesPage.currentURL_Validation();
		String expected_CurrentUrl="changePassword";
		if(actual_CurrentUrl.contains(expected_CurrentUrl))
		{
			test.pass("PreferencesPage Current Url Validation Successfull");
			Log.info("PreferencesPage Current Url Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("PreferencesPage Current Url Validation Unsuccessfull");
			Log.info("PreferencesPage Current Url Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "PreferencesPage Title Validation")
	public void title_Validation_Test() {
		test=extent.createTest("Preferences Page Title Validation");
		test.info("Validating PreferencesPage Title");
		String actual_Title=preferencesPage.title_Validation();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title)) {
			test.pass("PreferencesPage Title Validation successfull");
			Log.info("PreferencesPage Titlr Validation successfull - PASS ");
		}
		else
		{
			Assert.fail("PreferencesPage Title Validation Unsuccessfull");
			Log.info("PreferencesPage Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Preferences Page Preferences Heading Label Text Validation")
	public void preferencesPage_PreferenceHeadingLabelText_Validation_Test() {
		test=extent.createTest("PreferencesPage Heading Label Text Validation");
		test.info("Validating PreferencesPage Heading Label Text");
		String actual_PreferencesHeadingLabelText=preferencesPage.preferencesPage_PreferencesHeadingLabelText();
		String expected_PreferencesHeadingLabelText="Preferences";
		if(actual_PreferencesHeadingLabelText.equals(expected_PreferencesHeadingLabelText))
		{
			test.pass("PreferencesPage Preferences Heading Label Text Validation Successfull");
			Log.info("PreferencesPage PreferencesHeading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("PreferencesPage Preferences Heading Label Text Validation Unsuccessfull");
			Log.info("PreferencesPage Preferences Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 4, description = "PreferncesPage Change Password Heading Label Text Validation")
	public void preferencesPage_ChangePasswordHeadingLabelText_Validation_Test() {
		test=extent.createTest("PreferencesPage Change Password Heading Label Text Validation");
		test.info("Validating PreferencesPage Change Password Heading Label Text");
		String actual_ChangePasswordHEadingLabelText=preferencesPage.preferencesPage_ChangePasswordHeadingLabelText();
		String expected_ChangePasswordHeadingLabelText="Change Password";
		if(actual_ChangePasswordHEadingLabelText.equals(expected_ChangePasswordHeadingLabelText)) {
			test.pass("PreferencesPage Change Password Heading Label Text Validation Successfull");
			Log.info("PreferencesPage Change Password Heading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("PreferencesPage Change Password Heading Label Text Validation Unsuccessfull");
			Log.info("PreferencesPage Change Password Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 5, description = "PreferencesPage Reset Button Validation")
	public void preferencesPage_ResetButtonValidation_Test() {
		test=extent.createTest("PreferencesPage ResetButton Validation");
		test.info("Validating PreferencesPage Reset Button");
		String oldPasswordValue=preferencesPage.resetButton_Validation("cdfvgb", "fvgbh");
		if(oldPasswordValue.isBlank())
		{
			test.pass("PreferencesPage Reset Button Validation Successfull");
			Log.info("PreferencesPage Reset Button Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("PreferencesPage Reset Button Validation Unsuccessfull");
			Log.info("PreferncesPage Reset Button Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 6, description = "PreferencesPage Submit Button Validation")
	public void preferencesPage_SubmitButtonalidation_Test() {
		test=extent.createTest("PreferencesPage Submit Button Validation");
		test.info("Validating PreferencesPage Submit Button");
		preferencesPage.submitButtonWithValidData_Validation("", null);
	}
}
