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
import com.WebPages.ForgotPasswordPage;
import com.WebPages.LoginPage;

public class ForgotPasswordPageTest extends Base{
	
	public LoginPage loginPage;
	public ForgotPasswordPage forgotPasswordPage;
	
	
	@BeforeMethod
	public void forgotPasswordPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		forgotPasswordPage=loginPage.validatingForgotPasswordLink();
	}

	@AfterMethod
	public void forgotPasswordPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	//Test Cases
	@Test(priority = 1, description = "ForgotPasswordPage Current Url Validation")
	public void validating_ForgotPasswordPage_CurrentUrl_Test() {
	test=extent.createTest("Forgot PasswordPage Current URL Validation");
	test.info("Validating Forgot Password Page Currnt URL");
	String actual_ForgotPasswordPage_CurrentUrl=forgotPasswordPage.validating_ForgotPasswordPage_CurrentUrl();
	String expected_ForgotPasswordPage_CurrentUrl="forgotpassword";	
	      if(actual_ForgotPasswordPage_CurrentUrl.contains(expected_ForgotPasswordPage_CurrentUrl)) {
	            test.pass("Forgot Password Page Current URL Validation Successfull");
	            Log.info("Forgot Password Page Current URL Validation Successfull - PASS ");
	       }
	       else
	       {
		        Assert.fail("ForgotPassword Page Current URL Validation Unsuccessfull");
		        Log.info("Forgot Password Page Current URL Validation Unsuccessfull - FAIL ");
	       }
	}
	
	@Test(priority = 2, description = "ForgotPassword Page Title Validation")
	public void validating_ForgotPasswordPage_Title_Test() {
		test=extent.createTest("Forgot Password Page Title Validation");
		test.info("Validating Forgot Password Page Title");
		String actual_ForgotPasswordPage_Title=forgotPasswordPage.validating_ForgotPasswordPage_Title();
		String expected_ForgotPasswordPage_Title="EmployFX - Employee Management";
		if(actual_ForgotPasswordPage_Title.equals(expected_ForgotPasswordPage_Title))
		{
			test.pass("Forgot Password Page Title Validation Successfull");
			Log.info("Forgot Password Page Title Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("Forgot Password Page Title Validation Unsuccessfull");
			Log.info("Forgot Password Page Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Forgot Password Page Heading Validation")
	public void validating_ForgotPasswordPage_Heading_Test() {
		test=extent.createTest("Forgot Password Page Heading Validation");
		test.info("Validating Forgot Password Page Heading");
		String actual_ForgotPasswordPage_Heading=forgotPasswordPage.validating_ForgotPasswordPage_Heading();
		String expected_ForgotPasswordPage_Heading="Forgot Your Password!";
		if(actual_ForgotPasswordPage_Heading.equals(expected_ForgotPasswordPage_Heading))
		{
			test.pass("Forgot Password Page Heading Validation Successfull");
			Log.info("Forgot Password Page Heading Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("Forgot Password Page Heading Validation Unsuccessfull");
			Log.info("Forgot Password Page Heading Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 4, description = "Forgot Password Page Email Label Text Validation")
	public void validating_ForgotPasswordPage_EmailLabelText_Test() {
		test=extent.createTest("Forgot Password Page Email Label Text Validation");
		test.info("Validation Forgot Password Page Email Label Text");
		String actual_ForgotPasswordPage_EmailLabelText=forgotPasswordPage.validating_ForgotPasswordPage_EmailLabelText();
		String axpected_ForgotPasswordPage_EmailLabelText="Email*";
		if(actual_ForgotPasswordPage_EmailLabelText.equals(axpected_ForgotPasswordPage_EmailLabelText))
		{
			test.pass("Forgot Password Page Email Label Text Validation Successfull");
			Log.info("Forgot Password Page Email Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("Forgot Password Page Email Label Text Validation Unsuccessfull");
			Log.info("Forgot Password Page Email Label Text Validatiom Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 5, description = "Forgot Password Page EmployFX Label Text Validation")
	public void validating_ForgotPasswordPage_EmployFXLabelText_Test() {
		test=extent.createTest("Forgot Password Page EmployFX Label Text Validation");
		test.info("Validating Forgot Password Page EmployFX Label Text Validation");
		String actual_ForgotPasswordPage_EmployFXLabelText=forgotPasswordPage.validating_ForgotPasswordPage_EmployFXLabelText();
		String expected_ForgotPasswordPage_EmployFXLabelText="EmployFX";
		if(actual_ForgotPasswordPage_EmployFXLabelText.equals(expected_ForgotPasswordPage_EmployFXLabelText))
		{
			test.pass("Forgot Password Page EmployFX Label Text Validation Successfull");
			Log.info("Forgot Password Page EmployFX Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("Forgot Password Page EmployFX Label Text Validation Unsuccessfull");
			Log.info("Forgot Password Page EmployFX Label Text Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 6, description = "Forgot Password Page Employee management Label Text Validation")
	public void validating_ForgotPasswordPage_EmployeemanagementLabelText_Text() {
		test=extent.createTest("Forgot Password Page Employee management Label Text Validation");
		test.info("Validatin Forgot Password Page Employee management Label Text");
		String actual_ForgotPasswordPage_EmployeeManagementLabelText=forgotPasswordPage.validating_ForgotPasswordPage_EmployeeManagementLabelText();
		String expected_ForgotPasswordPge_EmployeeManagementLabelText="Employee Management";
		if(actual_ForgotPasswordPage_EmployeeManagementLabelText.equals(expected_ForgotPasswordPge_EmployeeManagementLabelText))
		{
			test.pass("Forgot Password Page Employee management Label Text Validation Successfull");
			Log.info("Forgot Password Page Employee management Label Text Validation Successfull - PASS ");
			
		}
		else
		{
			Assert.fail("Forgot Password Page Employee management Label Text Validation Unsuccessfull");
			Log.info("Forgot Password Page Employee management Label Text Validation Unsuccessfull - FAIL ");
		}
	}
	
	
	@Test(priority = 7, description = "Forgot Password Page Existing User Email with Submit Button Validation")
	public void validating_ForgotPasswordPage_ExistingUserEmailWithSubmit_Test() throws InterruptedException {
		test=extent.createTest("Forgot Password Page Existing User Validation");
		test.info("Validating Forgot Password Page Existing User");
		forgotPasswordPage.validating_ForgotPasswordPage_ExistingUserEmailWithSubmit(PropertiesClass.getProperties("email"));
		//CommonActions.loginPage_Heading_Validation(loginPage);
		//Thread.sleep(5000);
		
		test.info("Reset Password Link sent to registered email successfully & Navigated back to Login Page");
		Log.info("Reset Password Link sent to registered email successfully & Navigated back to Login Page");
	
	}
	
	@Test(priority = 8, description = "Forgot Password Page Existing User Email with Cancel button Validation")
	public void validating_ForgotPasswordPage_ExistingEmailCancelButton_Test() {
		test=extent.createTest("Forgot Password Page Existing User Email with Cancel button Validation");
		test.info("Validating Forgot Password Page Existing User Email with Cancel button");
		forgotPasswordPage.validating_ForgotPasswordPage_ExistingUserWithCancel(PropertiesClass.getProperties("email"));
		CommonActions.loginPage_Heading_Validation(loginPage);
		
		test.info("Reset Password Link not sent to registered email & Navigated back to Login Page");
		Log.info("Reset Password Link not sent to registered email & Navigated back to Login Page");
	}
	
	@Test(priority = 9, description = "Forgot Password Page Login Link Validation")
	public void validating_ForgotPasswordPage_LoginLink_Test() {
		test=extent.createTest("Forgot Password Page Login Link Validation");
		test.info("Validating Forgot Password Page Login Link");
		forgotPasswordPage.validating_ForgotPasswordPage_LoginLink();
		CommonActions.loginPage_Heading_Validation(loginPage);
	}
	
	@Test(priority = 10, description = "Forgot Password Page Fields Availability Validation")
	public void validating_ForgotPassPageFieldAvailability_Test() {
		
		int emailCount=0;
		int cancelCount=0;
		int submitCount=0;
		int loginLinkCount=0;
		
		test=extent.createTest("Forgot Password Page Fields Availability Validation");
		test.info("Validating Forgot Password Page Fields Availability");
		Boolean emailFieldAvailability=forgotPasswordPage.emailFieldAvalability();
		if(emailFieldAvailability==true)
		{
			emailCount++;
		}
		else
		{
			emailCount=0;
		}
		
		Boolean cancelButtonFieldAvailability=forgotPasswordPage.cancelButtonAvailability();
		if(cancelButtonFieldAvailability==true)
		{
			cancelCount++;
		}
		else
		{
			cancelCount=0;
		}
		
		Boolean submitBButtonFieldAvailability=forgotPasswordPage.submitButtonAvailability();
		if(submitBButtonFieldAvailability==true)
		{
			submitCount++;
		}
		else
		{
			submitCount=0;
		}
		
		Boolean loginLinkFieldAvailability=forgotPasswordPage.loginLinkAvailability();
		if(loginLinkFieldAvailability==true)
		{
			loginLinkCount++;
		}
		else
		{
			loginLinkCount=0;
		}	
		
		
	}
}
