package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;
import com.aventstack.extentreports.ExtentTest;

@Listeners(com.Listeners.ListenersTest.class)
public class LoginPageTest extends Base {

	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	
	@BeforeMethod
	public void loginPage_setUp() {
	    // set up browser
		// TODO Auto-generated constructor stub
	   setUp();
	   loginPage=new LoginPage();
	}
	
	@AfterMethod
	public void loginPage_tearDown() {
		extent.flush();
		tearDown();
	}
	
	
	//Test Cases
	@Test(priority = 1, description = "LoginPage Url Validation")
	public void loginpage_CurrentUrl_Test() {
		
		test=extent.createTest("LoginPage Current Url Validation");
		test.info("Validating LoginPage Current Url");
		String actual_LoginPage_Url=loginPage.validatingUrl();
		String expected_LoginPage_Url="#";
		if(actual_LoginPage_Url.contains(expected_LoginPage_Url)) {
			test.pass("LoginPage Url Validation Successfull");
			Log.info("LoginPage Url Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage Url Validation Unsuccessfull");
			Log.info("LoginPage Url Validation Unsuccessfull - FAIL ");
		}
		
	}
	
	@Test(priority = 2, description = "LoginPage Title Validation")
	public void loginpage_Title_Test(){
		
		test=extent.createTest("LoginPage Title Validation");
		test.info("Validating LoginPage Title");
		String actual_LoginPage_Title=loginPage.validatingTitle();
		String expected_LoginPage_Title="EmployFX - Employee Management";
		if(actual_LoginPage_Title.equals(expected_LoginPage_Title)) {
			test.pass("LoginPage Title Validation Successfull");
			Log.info("LoginPage Title Validation Successfull - PASS ");
		}
		else
		{
			test.fail("LoginPage Title Validation Unsuccessfull");
			Log.info("LoginPage Title Validation Unsuccessfull - FAIL ");
		}
		
		//AssertJUnit.assertEquals(actual_LoginPage_Title, expected_LoginPage_Title, "LoginPage Title Validation Successfull - PASS");
	}
	
	@Test(priority = 3, description = "LoginPage Heading Label Text Validation")
	public void loginpage_HeadingLabelText_Test() {
		
		test=extent.createTest("LoginPage Heading Label Text");
		test.info("Validating LoginPage Heading Label Text");
		String actual_LoginPage_HeadingLabelText = loginPage.validatingHeadingLabelText();
		String expected_LoginPage_HeadingLabelText="Login";
		if(actual_LoginPage_HeadingLabelText.equals(expected_LoginPage_HeadingLabelText))
		{
			test.pass("LoginPage Heading Label Text validation Successfull");
			Log.info("LoginPage Heading Label Text validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage Heading Label Text validation Unsuccessfull");
			Log.info("LoginPage Heading Label Text validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 4, description = "LoginPage EmployFX Label Text Validation")
	public void loginpage_EmployFXLabelText_Test() {
		test=extent.createTest("LoginPage EmployFX Label Text Validation");
		test.info("Validating LoginPage EmployFX Label Text");
		String actual_LoginPage_EmployFXLabelText=loginPage.validatingEmployFXLabel();
		String expected_LoginPage_EmployFXLabeText="EmployFX";
		if(actual_LoginPage_EmployFXLabelText.equals(expected_LoginPage_EmployFXLabeText))
		{
			test.pass("LoginPage EmployFx Label Text Validation Successfull");
			Log.info("LoginPage EmployFx Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage EmployFX Label Text Validation Unsuccessfull");
			Log.info("LoginPage EmployFX Label Text Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 5, description = "LoginPage EmployFX Management Label Text Validation")
	public void loginpage_EmployFXManagementLabelText_Test() {
		test=extent.createTest("LoginPage EmployFX Management Label Text Validation");
		test.info("Validating LoginPage EmployFx Management Label Text");
		String actual_LoginPage_EmployFXManagementLabelText=loginPage.validatingEmployFXManagement();
		String Expected_LoginPage_EmployFXManagementLabelText="Employee Management";
		if(actual_LoginPage_EmployFXManagementLabelText.equals(Expected_LoginPage_EmployFXManagementLabelText)) {
			test.pass("LoginPage EmployFX Management Label Text Validation Successfull");
			Log.info("LoginPage EmployFX Management Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage EmployFX Management Label Text Validation Unsuccessfull");
			Log.info("LoginPage EmployFX Management Label Text Validation Unsucessfull - FAIL ");
		}
	}
	
	@Test(priority = 6, description = "LoginPage SuperAdmin Login Validation")
	public void loginpage_SuperAdminLogin_Test() throws InterruptedException {
		test=extent.createTest("LoginPage Login Validation");
		test.info("Validating Login");
		loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		CommonActions.webDriverWaitMethod().until(ExpectedConditions.urlContains("staging.employfx.com/#/superAdmin"));
		String actual_DashboardPage_Url=driver.getCurrentUrl();
		String expected_DashboardPage_Url="staging.employfx.com/#/superAdmin";
		if(actual_DashboardPage_Url.contains(expected_DashboardPage_Url)) {
			test.pass(PropertiesClass.getProperties("email")+" User Login Successfull & Navigated to DashboardPage succesfully");
			Log.info(PropertiesClass.getProperties("email")+" User Login Successfull & Navigated to DashboardPage Successfully - PASS ");
		}
		else
		{
			Assert.fail(PropertiesClass.getProperties("email")+" User Login Unsuccessfull");
			Log.info(PropertiesClass.getProperties("email")+" User Login Unsuccessfull - FAIL ");
			CommonActions.screenShot(PropertiesClass.getProperties("email"));
		}
	}
	
	@Test(priority = 7, description = "LoginPage Admin Login Validation")
	public void loginpage_AdminLogin_Test() throws InterruptedException {
		test=extent.createTest("LoginPage Login Validation");
		test.info("Validating Login");
		loginPage.adminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		CommonActions.webDriverWaitMethod().until(ExpectedConditions.urlContains("em-new-staging.employfx.com/#/dashboard"));
		String actual_HomePage_Url=driver.getCurrentUrl();
		String expected_HomePage_Url="em-new-staging.employfx.com/#/dashboard";
		if(actual_HomePage_Url.contains(expected_HomePage_Url)) {
			test.pass(PropertiesClass.getProperties("email")+" User Login Successfull & Navigated to DashboardPage succesfully");
			Log.info(PropertiesClass.getProperties("email")+" User Login Successfull & Navigated to DashboardPage Successfully - PASS ");
		}
		else
		{
			Assert.fail(PropertiesClass.getProperties("email")+" User Login Unsuccessfull");
			Log.info(PropertiesClass.getProperties("email")+" User Login Unsuccessfull - FAIL ");
			CommonActions.screenShot(PropertiesClass.getProperties("email"));
		}
	}
	
	@Test(priority = 8, description = "LoginPage ForgotPassword Link Validation")
	public void loginpage_validatingForgotPasswordLink_Test() {
		test=extent.createTest("LoginPage Forgot Password link Validation");
		test.info("Validating LoginPage forgot password link");
		loginPage.validatingForgotPasswordLink();
        test.info("Navigated to ForgotPassword Page successfully");
        Log.info("Navigated to ForgotPassword Page successfully");
	}
	
	@ Test(priority = 9, description = "LoginPage ForgotPassword Label Text Validation")
	public void loginpage_ValidatingForgotPasswordLabelText_Test() {
		test=extent.createTest("LoginPage Forgot Password Label Text Validation");
		test.info("Validating LoginPage forgot Password Label Text");
		String actual_LoginPage_validtingForgotPasswordText=loginPage.validtingForgotPasswordText();
		String expected_LoginPage_ValidtingForgotPasswordText="Forgot Password?";
		if(actual_LoginPage_validtingForgotPasswordText.equals(expected_LoginPage_ValidtingForgotPasswordText)) {
			test.pass("LoginPage Forgot Password Label Text Validation Successfull");
			Log.info("LoginPage Forgot Password Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage Forgot Password Label Text Validation Unsuccessfull");
			Log.info("LoginPage Forgot Password Label Text Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 10, description = "LoginPage Email Label Text Validation")
	public void loginPage_ValidatingEmailLabelText_Test() {
		test=extent.createTest("LoginPage Email Label Text Validation");
		test.info("Validating LoginPage Email Label Text Validation");
		String actual_LoginPage_ValidatingEmailLabelText=loginPage.validatingEmailLabelText();
		String expected_LoginPage_ValidatingEmailLabelText="Email*";
		if(actual_LoginPage_ValidatingEmailLabelText.equals(expected_LoginPage_ValidatingEmailLabelText)) {
			test.pass("LoginPage Email Label Text Validation Successfull");
			Log.info("LoginPage Email Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage Email Label Text Validation Unsuccessfull");
			Log.info("LoginPage Email Label Text Validation Unsuccessfull - FAIL ");
		}
	}
	
	@Test(priority = 11, description = "LoginPage Password Label Text Validation")
	public void loginPage_ValidatingPasswordLabelText_Test() {
		test=extent.createTest("LoginPage Password Label Text Validation");
		test.info("Validating LoginPage Password Label Text Validation");
		String actual_LoginPage_ValidatingPasswordLabelText=loginPage.validatingPasswordLabelText();
		String expected_LoginPage_ValidatingPasswordLabelText="Password*";
		if(actual_LoginPage_ValidatingPasswordLabelText.equals(expected_LoginPage_ValidatingPasswordLabelText)) {
			test.pass("LoginPage Password Label Text Validation Successfull");
			Log.info("LoginPage Password Label Text Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("LoginPage Password Label Text Validation Unsuccessfull");
			Log.info("LoginPage Password Label Text Validation Unsuccessfull");
		}
	}
	
	
	@Test(priority =12, description = "LoginPage Fields Availability Validation" )
	public void loginPage_ValidatingFieldsAvailaility_Test() {
		test=extent.createTest("LoginPage Fields Availability Validation");
		test.info("Validating LoginPage Fields Availability");
		int count=0;
		Boolean emailFieldAvailability=loginPage.validatingEmailFieldAvailability();
		if(emailFieldAvailability==true) {
			count++;
		}
		else
		{
			count=0;
		}
		Boolean passwordFieldAvailability=loginPage.validatingPasswordFieldAvailability();
		if(passwordFieldAvailability==true) {
			count++;
		}
		else
		{
			count=0;
		}
		
		Boolean loginButtonFieldAvailability=loginPage.validatingLoginButtonFieldAvailability();
		if(loginButtonFieldAvailability==true) {
			count++;
		}
		else
		{
			count=0;
		}
		
		Boolean forgotPasswordLinkFieldAvailability=loginPage.validatingForgotPasswordFieldAvailability();
		if(forgotPasswordLinkFieldAvailability==true) {
			count++;
		}
		else
		{
			count=0;
		}
		
		if(count==0)
		{
			Assert.fail("LoginPage Fields Availability validation Unsuccessfull");
			Log.info("LoginPage Fields Availability validation Unsuccessfull - FAIL");
		}
		else
		{
			test.pass("LoginPage Fields Availability validation Successfull");
			Log.info("LoginPage Fields Availability validation Successfull - PASS");
		}
		
	}
	
	@Test(priority = 13, description = "LoginPage Logging into the Application and browsing back using Browser back button validaion")
	public void loginPage_ValidatingBrowserBackButton_Test() {
		test=extent.createTest("LoginPage Logging into the Application and browsing back using Browser back button validaion");
		test.info("Validating of LoginPage Logging into the Application and browsing back using Browser back button");
		loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
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
	
	@Test(priority = 14, description = "LoginPage Loggingout from the Application and browsing back using Browser back button Validation")
	public void loginPage_ValidatingLoggingOutBackButon_Test() {
		test=extent.createTest("LoginPage Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating for LoginPage Loggingout from the Application and browsing back using Browser back button");
		DashboardPage dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
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