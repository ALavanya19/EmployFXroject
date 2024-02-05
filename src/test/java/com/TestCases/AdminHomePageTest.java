package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.AdminChatPage;
import com.WebPages.AdminCompanyDetailsPage;
import com.WebPages.AdminDashboardPage;
import com.WebPages.AdminEmployeeListPage;
import com.WebPages.AdminEmployeeStaticFieldsPage;
import com.WebPages.AdminHolidayManagementPage;
import com.WebPages.AdminHomePage;
import com.WebPages.AdminMyDetailsPage;
import com.WebPages.AdminPendingApprovalsPage;
import com.WebPages.AdminRolesAndPermissionsPage;
import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.HelpAndSupportPage;
import com.WebPages.LoginPage;
import com.WebPages.PreferencesPage;

public class AdminHomePageTest extends Base {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminHomePage adminHomePage;
	CompanyListPage companyListPage;
	PreferencesPage preferencesPage;
	HelpAndSupportPage helpAndSupportPage;
	AdminDashboardPage adminDashboardPage;
	AdminChatPage adminChatPage;
	AdminMyDetailsPage adminMyDetailsPage;
	AdminCompanyDetailsPage adminCompanyDetailsPage;
	AdminEmployeeListPage adminEmployeeListPage;
	AdminRolesAndPermissionsPage adminRolesAndPermissionsPage;
	AdminPendingApprovalsPage adminPendingApprovalsPage;
	AdminHolidayManagementPage adminHolidayManagementPage;
	AdminEmployeeStaticFieldsPage adminEmployeeStaticFieldsPage;
	
	List<WebElement>homePageCompanyNme;
	String expected_HomePageTitle;
	
	
	@BeforeMethod
	public void adminHomePage_SetUp() {
	
		setUp();
		loginPage=new LoginPage();
		adminHomePage=loginPage.adminLogin(PropertiesClass.getProperties("adminEmail"), PropertiesClass.getProperties("adminPassword"));
	}
	
	@AfterMethod
	public void adminHomePage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	
	@Test(priority = 1, description = "AdminHomePage Current URL Validation")
	public void adminHomePage_CurrentURL_Validation_Test() {
		test=extent.createTest("AdminHomePage Current URL Validation");
		test.info("Validating AdminHomePage Current URL");
		String actual_HomePageURL=adminHomePage.adminHomePage_CurrentURL_Validation();
		String expected_HomePageURL="http://em-new-staging.employfx.com/#/dashboard";
		if(actual_HomePageURL.contains(expected_HomePageURL)) {
			test.pass("AdminHomePage Current URL Validation Successfull");
			Log.info("AdminHomePage Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("AdminHomePage Current URL Validation Unsuccessfull");
			Log.info("AdminHomePage Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "AdminHomePage Title Validation")
	public void adminHomePage_Title_Validation_Test() {
		test=extent.createTest("AdminHomePage Title Validation");
		test.info("Validating AdminHomePage Title");
		String actual_HomePageTitle=adminHomePage.adminHomePage_Title_Validation();
		String expected_HomePageTitle="EmployFX - Employee Management";
		if(actual_HomePageTitle.contains(expected_HomePageTitle)) {
			test.pass("AdminHomePage Title Validation Successfull");
			Log.info("AdminHomePage Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("AdminHomePage Title Validation Unsuccessfull");
			Log.info("AdminHomePage Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "AdminHomePage Heading Validation")
	public void adminHomePage_Heading_Validation_Test() {
		test=extent.createTest("AdminHomePage Heading Validation");
		test.info("Validating AdminHomePage Heading");
		String actual_HomePageTitle=adminHomePage.adminHomePage_Heading_Validation();
		/*homePageCompanyNme=CommonActions.companyName();
		for(int companyName=1; companyName<homePageCompanyNme.size();companyName++) {
			String loggedIncompanyName=homePageCompanyNme.get(companyName).getText();
			if(loggedIncompanyName.equals(adminHomePage.adminHomePage_UserName_Validation())) {
				expected_HomePageTitle=loggedIncompanyName+" - Employee Management";
			}
		}
		if(actual_HomePageTitle.contains(expected_HomePageTitle)) {
			test.pass("AdminHomePage Title Validation Successfull");
			Log.info("AdminHomePage Title Validation Successfull - PASS");
		}
		else
		{
			test.fail("AdminHomePage Title Validation Unsuccessfull");
			Log.info("AdminHomePage Title Validation Unsuccessfull - FAIL");
		}*/
	}
	
	@Test(priority = 4, description = "AdminHomePage Notification Bell Icon Validation")
	public void adminHomePage_NotificationBellIcon_Validation_Test() {
		test=extent.createTest("AdminHomePage Notification Bell Icon Validation");
		test.info("Validating AdminHomePage Notification Bell Icon");
		adminHomePage.adminHomePage_NotificationButton_Validation();
		String actual_NotificationPopUpHeading=adminHomePage.adminHomePage_NotificationPopUpHeadingLabelText();
		String expected_NotificationPopUpHeading="Notifications";
		if(actual_NotificationPopUpHeading.equals(expected_NotificationPopUpHeading)) {
			test.pass("AdminHomePage NotificationsList validation Successfull");
			Log.info("AdminHomePage NotificationsList Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("AdminHomePage NotificationsList Validation Unsuccessfull");
			Log.info("AdminHomePage NotificationsList Validation Unsuccessfull");
		}
	}
	
	@Test(priority = 5, description = "AdminHomePage Logged In User Name Validation")
	public void adminHomePage_LoggedInUserName_Validation_Test() {
		test=extent.createTest("AdminHomePage LoggedIn User Name Validation");
		test.info("Validating AdminHomePage LoggedIn User Name");
		String actual_UserName=adminHomePage.adminHomePage_UserName_Validation();
		/*homePageCompanyNme=CommonActions.companyName();
		for(int companyName=1;companyName<homePageCompanyNme.size();companyName++) {
			if(actual_UserName.equals(homePageCompanyNme.get(companyName).getText()))
			{
				test.pass("Company Name is available, AdminHomePage LoggedIn User Name Validation Successfull");
				Log.info("Company Name is available, AdminHomePage LoggedIn User Name Validation Successfull - PASS");
			}
			else
			{
				test.fail("Company Name is not available, AdminHomePage LoggedIn User Name Validation Unsuccessfull");
				Log.info("Company Name is not available, AdminHomePage LoggedIn User Name Validation Unsuccessfull - FAIL");
			}
		}*/
	}
	
	@Test(priority = 6, description = "AdminHomePage Preferences Option Validation")
	public void adminHomePage_PreferencesOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Preferences Option Validation");
		test.info("Validating AdminHomePage Preferences Option");
		preferencesPage=adminHomePage.adminHomePage_PreferencesOption_Validation();
		String actual_Heading=preferencesPage.preferencesPage_PreferencesHeadingLabelText();
		String expected_Heading="Preferences";
		if(actual_Heading.equals(expected_Heading)) {
			test.pass("Navigated to Preferences Page Successfully");
			Log.info("Navigated to Preferences Page Successfull - PASS");
		}
		else
		{
			Assert.fail("Unable to Navigate to PreferencesPage");
			Log.info("Unable to Navigate to PreferencesPage - FAIL");
		}
	}
	
	@Test(priority = 7, description = "AdminHomePage Help & Support Option Validation")
	public void adminHomePage_HelpAndSupportOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Help&Support Option Validation");
		test.info("Validating AdminHomePage Help&Support Option");
		helpAndSupportPage=adminHomePage.adminHomePage_HelpSupportOption_Validation();
	}
	
	@Test(priority = 8, description = "AdminHomePage Logout Option Validation")
	public void adminHomePage_LogoutOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Logout Option Validation");
		test.info("Validating AdminHomePage Logout Option");
		loginPage=adminHomePage.adminHomePage_LogoutOption_Validation();
		String actual_LoginHeading=loginPage.validatingHeadingLabelText();
		String expected_LoginHeading="Login";
		if(actual_LoginHeading.equals(expected_LoginHeading)) {
			test.pass("Logged Out Successfully");
			Log.info("Logged Out Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Log Out");
			Log.info("Unable to Log Out");
		}
	}
	
	@Test(priority = 9, description = "AdminHomePage Logged in User Image Validation")
	public void adminHomePage_LoggedInUserImage_Validation_Test() {
		test=extent.createTest("AdminHomePage Logged In User Image Validation");
		test.info("Validating AdminHomePage Logged In User Image");
		boolean flag=adminHomePage.adminHomePage_UserProfileImage_Validation();
		if(flag==true)
		{
			test.pass("AdminHomePage Logged In User Image displaying Successfully");
			Log.info("AdminHomePage Logged In User Image displaying Successfully - PASS");
		}
		else
		{
			Assert.fail("AdminHomePage Logged In User Image is not displaying Unsuccessfully");
			Log.info("AdminHomePage Logged In User Image is not displaying Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 10, description = "AdminHomePage Dashboard Option Validation")
	public void adminHomePage_DashboardOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Dashboard Option Validation");
		test.info("Validating AdminHomePage Dashboard Option");
		adminDashboardPage=adminHomePage.adminHomePage_DashboardOption_Validation();
	}
	
	@Test(priority = 11, description = "AdminHomePage Chat Option Validation")
	public void adminHomePage_ChatOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Chat Option Validation");
		test.info("Validating AdminHomePage Chat Option");
		adminChatPage=adminHomePage.adminHomePage_ChatOption_Validation();
	}
	
	@Test(priority = 12, description = "AdminHomePage My Details Option Validation")
	public void adminHomePage_MyDetailsOption_Validation_Test() {
		test=extent.createTest("AdminHomePage My Details Option Validation");
		test.info("Validating AdminHomePage My Details Option");
		adminMyDetailsPage=adminHomePage.adminHomePage_MyDetailsOption_Validation();
	}
	
	@Test(priority = 13, description = "AdminHomePage Company Details Option Validation")
	public void adminHomePage_CompanyDetailsOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Company Details Option Validation");
		test.info("Validating AdminHomePage Company Details Option");
		adminCompanyDetailsPage=adminHomePage.adminHomePage_CompanyDetailsOption_Validation();
	}
	
	@Test(priority = 14, description = "AdminHomePage Employee List Option Validation")
	public void adminHomePage_EmployeeListOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Employee List Option Validation");
		test.info("Validating AdminHomePage Employee List Option");
		adminEmployeeListPage=adminHomePage.adminHomePage_EmployeeListOption_Validation();
	}
	
	@Test(priority = 15, description = "AdminHomePage Roles & Permissions Option Validation")
	public void adminHomePage_RolesAndPermissionsOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Roles & Permissions Option Validation");
		test.info("Validating AdminHomePage Roles & Permissions Option");
		adminRolesAndPermissionsPage=adminHomePage.adminHomePage_RolesAndPermissionsOption_Validation();
	}
	
	@Test(priority = 16, description = "AdminHomePage Pending Approvals Option Validation")
	public void adminHomePage_PendingApprovalsOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Pending Approvals Option Validation");
		test.info("Validating AdminHomePage Pending Approvals Option");
		adminPendingApprovalsPage=adminHomePage.adminHomePage_PendingApprovalsOption_Validation();
	}
	
	@Test(priority = 17, description = "AdminHomePage Holiday Management Option Validation")
	public void adminHomePage_HolidayManagementOption_Validation() {
		test=extent.createTest("AdminHomePage Holiday Management Option Validation");
		test.info("Validating AdminHomePage Holiday Management Option");
		adminHolidayManagementPage=adminHomePage.adminHomePage_HolidayManagementOption_Validation();
	}
	
	@Test(priority = 18, description = "AdminHomePage Employee Static Fields Option Validation")
	public void adminHomePage_EmployeeStaticFieldsOption_Validation_Test() {
		test=extent.createTest("AdminHomePage Employee Static Fields Option Validation");
		test.info("Validating AdminHomePage Employee Static Fields Option");
		adminEmployeeStaticFieldsPage=adminHomePage.adminHomePage_EmployeeStaticFieldsOption_Validation();
	}
	
	@Test(priority = 19, description = "AdminHomePage Logging into the Application and browsing back using Browser back button validaion")
	public void adminHomePage_ValidatingBrowserBackButton_Test() {
		test=extent.createTest("AdminHomePage Logging into the Application and browsing back using Browser back button validaion");
		test.info("Validating of AdminHomePage Logging into the Application and browsing back using Browser back button");
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
	
	@Test(priority = 20, description = "AdminHomePage Loggingout from the Application and browsing back using Browser back button Validation")
	public void dashboardPage_ValidatingLoggingOutBackButon_Test() {
		test=extent.createTest("AdminHomePage Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating for AdminHomePage Loggingout from the Application and browsing back using Browser back button");
		adminHomePage.adminHomePage_LogoutOption_Validation();
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
