package com.CommonActions;


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;
import com.WebPages.PreferencesPage;

public class CommonActions extends Base{

	//Screen Shot
	public static void screenShot(String screenShotName) {
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./src/resources/java/com/Screenshots/"+screenShotName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Web Driver Wait(Explicit Wait)
	public static WebDriverWait webDriverWaitMethod() {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		return wait;
	}
	
	//Mandatory field dta
	
	
	
	//LoginPage Validation
	public static void loginPage_Heading_Validation(LoginPage loginPage) {
		String actual_LoginPage_Heading=loginPage.validatingHeadingLabelText();
		String expected_LoginPage_Heading="Login";
		if(actual_LoginPage_Heading.equalsIgnoreCase(expected_LoginPage_Heading)) 
		{
			test.pass("LoginPage Heading Label Text validation Successfull");
			Log.info("LoginPage Heading Label Text validation Successfull - PASS ");
	    }
		else
		{
			test.fail("LoginPage Heading Label Text valiadation Unsuccessfull");
			Log.info("LoginPage Heading Label Text validation Unsuccessfull - FAIL ");
			screenShot(PropertiesClass.getProperties("email"));
		}
	}
	
	//Preferences Validation
	public static void preferences_Heading_Validation(PreferencesPage preferencesPage) {
		String actual_PreferencesPage_Heading=preferencesPage.preferencesPage_ChangePasswordHeadingLabelText();
		String expected_PreferencesPage_Heading="Change Password";
		if(actual_PreferencesPage_Heading.equals(expected_PreferencesPage_Heading)) 
		{
			test.pass("PreferencesPage Heading Label Text validation Successfull");
			Log.info("PreferencesPage Heading Label Text validation Successfull - PASS ");
	    }
		else
		{
			test.fail("PreferencesPage Heading Label Text valiadation Unsuccessfull");
			Log.info("PreferencesPage Heading Label Text validation Unsuccessfull - FAIL ");
		}
	}
	
	public static void checkMandatoryFieldValidation(WebElement element) {
		String value=element.getAttribute("value");
		if(value.isBlank()) {
			Log.warn(element.getText()+ " is Mandatory");
		}
	}
	
	public static List companyDetailsData(CompanyListPage companyListPage, String companyName) throws AWTException {
		
		return companyListPage.validating_CompanyDetails(companyName);
	}
	
	public static void scroll(WebElement scrollUptoElement) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,100);");
		//js.executeScript("arguments[0].scrollRight += 500;", scrollUptoElement);
	
	}
	
	
	public static String PageNotFoundError() {
		
		WebElement pageNotFoundE=driver.findElement(By.xpath("//*[text()='Opps! Page Not Found']"));
		return pageNotFoundE.getText();
	
	}
	
	public static List companyName() {
		setUp();
		LoginPage loginPage=new LoginPage();
		DashboardPage dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		CompanyListPage companyListPage=dashboardPage.validating_CompaniesOption();
		return companyListPage.companyListPage_CompanyName_Validation();
	}
	
	
	public static int existingRecordCheck(List existingRecordsList,Object newRecordName) {
		
		int existFlag=0;
		for(int record=1;record<existingRecordsList.size();record++) {
			if(existingRecordsList.get(record).equals(newRecordName.toString())){
				existFlag=1;
				break;
			}
			else
			{
				existFlag=0;
			}
		}
		
		return existFlag;
	}
	
	
	
}

