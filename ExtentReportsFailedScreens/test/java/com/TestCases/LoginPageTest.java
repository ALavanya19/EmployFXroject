package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.CommonActions.CommonActionsClass;
import com.Config.PropertiesClass;
import com.Log.Logs;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class LoginPageTest extends BaseClass{


	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	
	
	@BeforeTest
	public void loginPage_setUp() {
		setUp();
		loginPage=new LoginPage();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception{
		if(result.getStatus() == ITestResult.FAILURE){

			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String screenshotPath = CommonActionsClass.getScreenShot(driver, result.getName());
			logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath).toString());
	  }
	else if(result.getStatus() == ITestResult.SKIP){
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
	  }
	else if(result.getStatus() == ITestResult.SUCCESS){
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	  }
	}
	
	@AfterTest
	public void loginPage_tearDown() {
		extent.flush();
		tearDown();
	}
		
	@Test(priority = 0, description = "Validating LoginPage Title")
	public void titleTest() {
		logger=extent.createTest("Validating LoginPage Login Title");
		String actualTitle=loginPage.validatingTitle();
		String expectedTitle="EmployFX - EmployeeManagement";
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
}
